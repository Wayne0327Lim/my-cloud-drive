package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileInfoTableDef extends TableDef {

    /**
     * 文件资源实体类

 @Author: xddcode
 @Date: 2025/5/8 9:18
     */
    public static final FileInfoTableDef FILE_INFO = new FileInfoTableDef();

    /**
     * 主键ID
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 大小
     */
    public final QueryColumn SIZE = new QueryColumn(this, "size");

    /**
     * 是否目录（0-否 1-是，对应 smallint 列）
     */
    public final QueryColumn IS_DIR = new QueryColumn(this, "is_dir");

    /**
     * 后缀名
     */
    public final QueryColumn SUFFIX = new QueryColumn(this, "suffix");

    /**
     * 用户ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    /**
     * 存储标准MIME类型
     */
    public final QueryColumn MIME_TYPE = new QueryColumn(this, "mime_type");

    /**
     * 父目录ID
     */
    public final QueryColumn PARENT_ID = new QueryColumn(this, "parent_id");

    /**
     * 软删除标记，回收站标识 0：未删除 1：已删除（对应 smallint 列）
     */
    public final QueryColumn IS_DELETED = new QueryColumn(this, "is_deleted");

    /**
     * 资源名称
     */
    public final QueryColumn OBJECT_KEY = new QueryColumn(this, "object_key");

    /**
     * 用于秒传和文件校验
     */
    public final QueryColumn CONTENT_MD5 = new QueryColumn(this, "content_md5");

    /**
     * 修改时间
     */
    public final QueryColumn UPDATE_TIME = new QueryColumn(this, "update_time");

    /**
     * 上传时间
     */
    public final QueryColumn UPLOAD_TIME = new QueryColumn(this, "upload_time");

    /**
     * 删除时间
     */
    public final QueryColumn DELETED_TIME = new QueryColumn(this, "deleted_time");

    /**
     * 资源别名
     */
    public final QueryColumn DISPLAY_NAME = new QueryColumn(this, "display_name");

    /**
     * 所属工作空间ID
     */
    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    /**
     * 资源原始名称
     */
    public final QueryColumn ORIGINAL_NAME = new QueryColumn(this, "original_name");

    /**
     * 最后访问时间
     */
    public final QueryColumn LAST_ACCESS_TIME = new QueryColumn(this, "last_access_time");

    /**
     * 存储平台标识符
     */
    public final QueryColumn STORAGE_PLATFORM_SETTING_ID = new QueryColumn(this, "storage_platform_setting_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SIZE, IS_DIR, SUFFIX, USER_ID, MIME_TYPE, PARENT_ID, IS_DELETED, OBJECT_KEY, CONTENT_MD5, UPDATE_TIME, UPLOAD_TIME, DELETED_TIME, DISPLAY_NAME, WORKSPACE_ID, ORIGINAL_NAME, LAST_ACCESS_TIME, STORAGE_PLATFORM_SETTING_ID};

    public FileInfoTableDef() {
        super("", "file_info");
    }

    private FileInfoTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileInfoTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileInfoTableDef("", "file_info", alias));
    }

}
