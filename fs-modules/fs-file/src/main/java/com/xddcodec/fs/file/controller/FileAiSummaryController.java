package com.xddcodec.fs.file.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.xddcodec.fs.file.domain.vo.FileAiSummaryVO;
import com.xddcodec.fs.file.service.FileAiSummaryService;
import com.xddcodec.fs.framework.common.domain.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/file")
@Tag(name = "AI 文件摘要", description = "文件 AI 摘要生成与查询")
public class FileAiSummaryController {

    @Autowired
    private FileAiSummaryService fileAiSummaryService;

    @GetMapping("/{fileId}/summary")
    @Operation(summary = "获取文件摘要", description = "查询文件已有 AI 摘要")
    @SaCheckPermission("file:read")
    public Result<FileAiSummaryVO> getSummary(@PathVariable String fileId) {
        return Result.ok(fileAiSummaryService.getSummary(fileId));
    }

    @PostMapping("/{fileId}/summary/regenerate")
    @Operation(summary = "重新生成文件摘要", description = "基于文件内容重新生成 AI 摘要")
    @SaCheckPermission("file:read")
    public Result<FileAiSummaryVO> regenerateSummary(@PathVariable String fileId) {
        return Result.ok(fileAiSummaryService.regenerateSummary(fileId));
    }
}
