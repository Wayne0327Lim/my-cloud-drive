package com.xddcodec.fs.file.domain;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table("file_ai_summary")
public class FileAiSummary implements Serializable {

    @Serial
    private static final long serialVersionUID = 7256419209341790431L;

    @Id(keyType = KeyType.None)
    private String id;

    private String fileId;

    private String workspaceId;

    private String userId;

    private String summary;

    private String keyPoints;

    private String tags;

    private String modelName;

    private Integer generatedByAi;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
