package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileTransferTaskTableDef extends TableDef {

    /**
     * 上传任务表实体类

 @Author: xddcode
 @Date: 2025/11/06 15:22
     */
    public static final FileTransferTaskTableDef FILE_TRANSFER_TASK = new FileTransferTaskTableDef();

    /**
     * 主键ID
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 下载时关联的文件ID
     */
    public final QueryColumn FILE_ID = new QueryColumn(this, "file_id");

    /**
     * 状态
     */
    public final QueryColumn STATUS = new QueryColumn(this, "status");

    /**
     * 文件类型(扩展名)
     */
    public final QueryColumn SUFFIX = new QueryColumn(this, "suffix");

    /**
     * 任务ID
     */
    public final QueryColumn TASK_ID = new QueryColumn(this, "task_id");

    /**
     * 用户ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    /**
     * 文件MD5值
     */
    public final QueryColumn FILE_MD5 = new QueryColumn(this, "file_md5");

    /**
     * 错误信息
     */
    public final QueryColumn ERROR_MSG = new QueryColumn(this, "error_msg");

    /**
     * 文件名
     */
    public final QueryColumn FILE_NAME = new QueryColumn(this, "file_name");

    /**
     * 文件大小(字节)
     */
    public final QueryColumn FILE_SIZE = new QueryColumn(this, "file_size");

    /**
     * 存储标准MIME类型
     */
    public final QueryColumn MIME_TYPE = new QueryColumn(this, "mime_type");

    /**
     * 父目录ID
     */
    public final QueryColumn PARENT_ID = new QueryColumn(this, "parent_id");

    /**
     * 任务类型
     */
    public final QueryColumn TASK_TYPE = new QueryColumn(this, "task_type");

    /**
     * 唯一上传ID
     */
    public final QueryColumn UPLOAD_ID = new QueryColumn(this, "upload_id");

    /**
     * 分片大小(默认5MB)
     */
    public final QueryColumn CHUNK_SIZE = new QueryColumn(this, "chunk_size");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    /**
     * 对象key
     */
    public final QueryColumn OBJECT_KEY = new QueryColumn(this, "object_key");

    /**
     * 开始时间
     */
    public final QueryColumn START_TIME = new QueryColumn(this, "start_time");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 总分片数
     */
    public final QueryColumn TOTAL_CHUNKS = new QueryColumn(this, "total_chunks");

    /**
     * 所属工作空间ID
     */
    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    /**
     * 完成时间
     */
    public final QueryColumn COMPLETE_TIME = new QueryColumn(this, "complete_time");

    /**
     * 已上传分片数
     */
    public final QueryColumn UPLOADED_CHUNKS = new QueryColumn(this, "uploaded_chunks");

    /**
     * 存储平台配置ID
     */
    public final QueryColumn STORAGE_PLATFORM_SETTING_ID = new QueryColumn(this, "storage_platform_setting_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, FILE_ID, STATUS, SUFFIX, TASK_ID, USER_ID, FILE_MD5, ERROR_MSG, FILE_NAME, FILE_SIZE, MIME_TYPE, PARENT_ID, TASK_TYPE, UPLOAD_ID, CHUNK_SIZE, CREATED_AT, OBJECT_KEY, START_TIME, UPDATED_AT, TOTAL_CHUNKS, WORKSPACE_ID, COMPLETE_TIME, UPLOADED_CHUNKS, STORAGE_PLATFORM_SETTING_ID};

    public FileTransferTaskTableDef() {
        super("", "file_transfer_task");
    }

    private FileTransferTaskTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileTransferTaskTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileTransferTaskTableDef("", "file_transfer_task", alias));
    }

}
