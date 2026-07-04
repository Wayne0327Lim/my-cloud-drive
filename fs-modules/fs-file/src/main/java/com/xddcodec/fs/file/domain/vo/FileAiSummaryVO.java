package com.xddcodec.fs.file.domain.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class FileAiSummaryVO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2069650454106040417L;

    private String fileId;

    private String fileName;

    private String summary;

    private List<String> keyPoints;

    private List<String> tags;

    private String modelName;

    private Boolean generatedByAi;

    private LocalDateTime updateTime;
}
