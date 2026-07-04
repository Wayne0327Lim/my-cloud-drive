package com.xddcodec.fs.file.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpRequest;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.xddcodec.fs.file.config.AiSummaryProperties;
import com.xddcodec.fs.file.domain.FileAiSummary;
import com.xddcodec.fs.file.domain.FileInfo;
import com.xddcodec.fs.file.domain.vo.FileAiSummaryVO;
import com.xddcodec.fs.file.mapper.FileAiSummaryMapper;
import com.xddcodec.fs.file.service.FileAiSummaryService;
import com.xddcodec.fs.file.service.FileInfoService;
import com.xddcodec.fs.framework.common.constant.CommonConstant;
import com.xddcodec.fs.framework.common.context.WorkspaceContext;
import com.xddcodec.fs.framework.common.exception.BusinessException;
import com.xddcodec.fs.framework.common.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static com.xddcodec.fs.file.domain.table.FileAiSummaryTableDef.FILE_AI_SUMMARY;

@Slf4j
@Service
public class FileAiSummaryServiceImpl extends ServiceImpl<FileAiSummaryMapper, FileAiSummary> implements FileAiSummaryService {

    private static final Set<String> SUPPORTED_SUFFIXES = Set.of(
            "txt", "md", "markdown", "log", "csv", "json", "xml", "yaml", "yml",
            "properties", "ini", "conf", "java", "js", "jsx", "ts", "tsx", "py",
            "sql", "sh", "bat", "ps1", "html", "css", "scss", "vue"
    );

    @Autowired
    private FileInfoService fileInfoService;

    @Autowired
    private AiSummaryProperties aiSummaryProperties;

    @Override
    public FileAiSummaryVO getSummary(String fileId) {
        FileInfo fileInfo = requireReadableFile(fileId);
        FileAiSummary summary = getStoredSummary(fileId);
        if (summary == null) {
            return emptySummary(fileInfo);
        }
        return toVO(fileInfo, summary);
    }

    @Override
    public FileAiSummaryVO regenerateSummary(String fileId) {
        FileInfo fileInfo = requireReadableFile(fileId);
        ensureSupported(fileInfo);

        String sourceText = readSourceText(fileId);
        if (StrUtil.isBlank(sourceText)) {
            throw new BusinessException("文件内容为空，无法生成摘要");
        }

        SummaryResult result = generateSummary(fileInfo, sourceText);
        FileAiSummary entity = getStoredSummary(fileId);
        LocalDateTime now = LocalDateTime.now();
        if (entity == null) {
            entity = new FileAiSummary();
            entity.setId(IdUtil.fastSimpleUUID());
            entity.setFileId(fileInfo.getId());
            entity.setWorkspaceId(fileInfo.getWorkspaceId());
            entity.setUserId(StpUtil.getLoginIdAsString());
            entity.setCreateTime(now);
        }
        entity.setSummary(result.summary());
        entity.setKeyPoints(String.join("\n", result.keyPoints()));
        entity.setTags(String.join(",", result.tags()));
        entity.setModelName(result.modelName());
        entity.setGeneratedByAi(result.generatedByAi() ? CommonConstant.Y : CommonConstant.N);
        entity.setUpdateTime(now);
        saveOrUpdate(entity);
        return toVO(fileInfo, entity);
    }

    private FileInfo requireReadableFile(String fileId) {
        FileInfo fileInfo = fileInfoService.getById(fileId);
        if (fileInfo == null) {
            throw new BusinessException("文件不存在");
        }
        if (CommonConstant.Y.equals(fileInfo.getIsDir())) {
            throw new BusinessException("文件夹暂不支持 AI 摘要");
        }
        if (CommonConstant.Y.equals(fileInfo.getIsDeleted())) {
            throw new BusinessException("回收站文件暂不支持 AI 摘要");
        }
        String workspaceId = WorkspaceContext.getWorkspaceId();
        if (StrUtil.isNotBlank(workspaceId) && !Objects.equals(workspaceId, fileInfo.getWorkspaceId())) {
            throw new BusinessException("无权访问该文件");
        }
        return fileInfo;
    }

    private void ensureSupported(FileInfo fileInfo) {
        String suffix = normalizeSuffix(fileInfo.getSuffix());
        if (!SUPPORTED_SUFFIXES.contains(suffix)) {
            throw new BusinessException("当前仅支持文本、Markdown、代码、JSON、CSV 等文本类文件摘要");
        }
    }

    private String readSourceText(String fileId) {
        int maxChars = Optional.ofNullable(aiSummaryProperties.getMaxChars()).orElse(12000);
        int maxBytes = Math.max(maxChars * 4, 4096);
        try (InputStream inputStream = fileInfoService.downloadFile(fileId);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int total = 0;
            int len;
            while ((len = inputStream.read(buffer)) != -1 && total < maxBytes) {
                int writable = Math.min(len, maxBytes - total);
                outputStream.write(buffer, 0, writable);
                total += writable;
            }
            String text = outputStream.toString(StandardCharsets.UTF_8);
            return text.length() > maxChars ? text.substring(0, maxChars) : text;
        } catch (Exception e) {
            log.error("读取文件内容失败 fileId={}", fileId, e);
            throw new BusinessException("读取文件内容失败，无法生成摘要");
        }
    }

    private SummaryResult generateSummary(FileInfo fileInfo, String sourceText) {
        if (Boolean.TRUE.equals(aiSummaryProperties.getEnabled()) && StrUtil.isNotBlank(aiSummaryProperties.getApiKey())) {
            try {
                return generateByRemoteModel(fileInfo, sourceText);
            } catch (Exception e) {
                log.warn("AI 摘要调用失败，使用本地摘要兜底 fileId={}", fileInfo.getId(), e);
            }
        }
        return generateLocalSummary(fileInfo, sourceText);
    }

    private SummaryResult generateByRemoteModel(FileInfo fileInfo, String sourceText) {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("model", aiSummaryProperties.getModel());
        payload.put("temperature", 0.2);
        payload.put("messages", List.of(
                Map.of("role", "system", "content", "你是云盘系统中的文件摘要助手。请返回严格 JSON，不要输出 Markdown。"),
                Map.of("role", "user", "content", buildPrompt(fileInfo, sourceText))
        ));
        String response = HttpRequest.post(aiSummaryProperties.getEndpoint())
                .header("Authorization", "Bearer " + aiSummaryProperties.getApiKey())
                .header("Content-Type", "application/json")
                .body(JsonUtils.toJsonString(payload))
                .timeout(Optional.ofNullable(aiSummaryProperties.getTimeoutMs()).orElse(30000))
                .execute()
                .body();

        JsonNode root = JsonUtils.parseTree(response);
        String content = root.get("choices").get(0).get("message").get("content").asText();
        JsonNode resultNode = JsonUtils.parseTree(stripJsonFence(content));
        String summary = resultNode.get("summary").asText();
        List<String> keyPoints = toTextList(resultNode.get("keyPoints"));
        List<String> tags = toTextList(resultNode.get("tags"));
        return new SummaryResult(summary, keyPoints, tags, aiSummaryProperties.getModel(), true);
    }

    private String buildPrompt(FileInfo fileInfo, String sourceText) {
        return """
                请为下面的文件生成中文摘要，并返回 JSON：
                {
                  "summary": "100 字以内的一段摘要",
                  "keyPoints": ["3 到 5 条关键要点"],
                  "tags": ["3 到 5 个标签"]
                }

                文件名：%s
                文件内容：
                %s
                """.formatted(fileInfo.getDisplayName(), sourceText);
    }

    private SummaryResult generateLocalSummary(FileInfo fileInfo, String sourceText) {
        List<String> lines = Arrays.stream(sourceText.split("\\R"))
                .map(String::trim)
                .filter(StrUtil::isNotBlank)
                .limit(8)
                .collect(Collectors.toList());
        String summary = lines.isEmpty()
                ? "该文件暂无可提取的文本内容。"
                : "该文件主要内容包括：" + abbreviate(String.join(" ", lines), 180);
        List<String> keyPoints = lines.stream()
                .limit(5)
                .map(this::normalizePoint)
                .collect(Collectors.toCollection(ArrayList::new));
        while (keyPoints.size() < 3) {
            keyPoints.add("可继续接入大模型生成更准确的语义摘要");
        }
        List<String> tags = buildLocalTags(fileInfo, sourceText);
        return new SummaryResult(summary, keyPoints, tags, "local-rule-summary", false);
    }

    private List<String> buildLocalTags(FileInfo fileInfo, String text) {
        LinkedHashSet<String> tags = new LinkedHashSet<>();
        String suffix = normalizeSuffix(fileInfo.getSuffix());
        if (StrUtil.isNotBlank(suffix)) {
            tags.add(suffix.toUpperCase(Locale.ROOT));
        }
        String lower = text.toLowerCase(Locale.ROOT);
        if (lower.contains("spring") || lower.contains("controller") || lower.contains("service")) {
            tags.add("后端");
        }
        if (lower.contains("select ") || lower.contains("insert ") || lower.contains("create table")) {
            tags.add("数据库");
        }
        if (lower.contains("todo") || lower.contains("fixme")) {
            tags.add("待办");
        }
        tags.add("文本文件");
        return tags.stream().limit(5).collect(Collectors.toList());
    }

    private FileAiSummary getStoredSummary(String fileId) {
        List<FileAiSummary> summaries = list(new QueryWrapper().where(FILE_AI_SUMMARY.FILE_ID.eq(fileId)));
        return summaries.isEmpty() ? null : summaries.get(0);
    }

    private FileAiSummaryVO emptySummary(FileInfo fileInfo) {
        FileAiSummaryVO vo = new FileAiSummaryVO();
        vo.setFileId(fileInfo.getId());
        vo.setFileName(fileInfo.getDisplayName());
        vo.setKeyPoints(List.of());
        vo.setTags(List.of());
        vo.setGeneratedByAi(false);
        return vo;
    }

    private FileAiSummaryVO toVO(FileInfo fileInfo, FileAiSummary summary) {
        FileAiSummaryVO vo = new FileAiSummaryVO();
        vo.setFileId(fileInfo.getId());
        vo.setFileName(fileInfo.getDisplayName());
        vo.setSummary(summary.getSummary());
        vo.setKeyPoints(splitLines(summary.getKeyPoints()));
        vo.setTags(splitTags(summary.getTags()));
        vo.setModelName(summary.getModelName());
        vo.setGeneratedByAi(CommonConstant.Y.equals(summary.getGeneratedByAi()));
        vo.setUpdateTime(summary.getUpdateTime());
        return vo;
    }

    private List<String> splitLines(String value) {
        if (StrUtil.isBlank(value)) {
            return List.of();
        }
        return Arrays.stream(value.split("\\R"))
                .map(String::trim)
                .filter(StrUtil::isNotBlank)
                .collect(Collectors.toList());
    }

    private List<String> splitTags(String value) {
        if (StrUtil.isBlank(value)) {
            return List.of();
        }
        return Arrays.stream(value.split(","))
                .map(String::trim)
                .filter(StrUtil::isNotBlank)
                .collect(Collectors.toList());
    }

    private List<String> toTextList(JsonNode node) {
        if (node == null || !node.isArray()) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        node.forEach(item -> result.add(item.asText()));
        return result;
    }

    private String stripJsonFence(String text) {
        return text.replace("```json", "").replace("```", "").trim();
    }

    private String normalizeSuffix(String suffix) {
        return StrUtil.blankToDefault(suffix, "").replace(".", "").toLowerCase(Locale.ROOT);
    }

    private String normalizePoint(String line) {
        return abbreviate(line.replaceFirst("^[-*#>\\d.\\s]+", ""), 90);
    }

    private String abbreviate(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength) + "...";
    }

    private record SummaryResult(
            String summary,
            List<String> keyPoints,
            List<String> tags,
            String modelName,
            boolean generatedByAi
    ) {
    }
}
