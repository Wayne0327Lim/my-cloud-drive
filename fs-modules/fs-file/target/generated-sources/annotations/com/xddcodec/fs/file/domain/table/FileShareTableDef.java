package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileShareTableDef extends TableDef {

    /**
     * 文件分享实体类

 @Author: xddcode
 @Date: 2025/10/29 15:13
     */
    public static final FileShareTableDef FILE_SHARE = new FileShareTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 权限范围: preview,download  (逗号分隔)
     */
    public final QueryColumn SCOPE = new QueryColumn(this, "scope");

    /**
     * 分享人ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    /**
     * 提取码（可选）
     */
    public final QueryColumn SHARE_CODE = new QueryColumn(this, "share_code");

    /**
     * 分享名称（默认取第一个文件名）
     */
    public final QueryColumn SHARE_NAME = new QueryColumn(this, "share_name");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 查看次数
     */
    public final QueryColumn VIEW_COUNT = new QueryColumn(this, "view_count");

    /**
     * 过期时间
     */
    public final QueryColumn EXPIRE_TIME = new QueryColumn(this, "expire_time");

    /**
     * 所属工作空间ID
     */
    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    /**
     * 最大查看次数（NULL表示无限制）
     */
    public final QueryColumn MAX_VIEW_COUNT = new QueryColumn(this, "max_view_count");

    /**
     * 下载次数
     */
    public final QueryColumn DOWNLOAD_COUNT = new QueryColumn(this, "download_count");

    /**
     * 最大下载次数（NULL表示无限制）
     */
    public final QueryColumn MAX_DOWNLOAD_COUNT = new QueryColumn(this, "max_download_count");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SCOPE, USER_ID, CREATED_AT, SHARE_CODE, SHARE_NAME, UPDATED_AT, VIEW_COUNT, EXPIRE_TIME, WORKSPACE_ID, MAX_VIEW_COUNT, DOWNLOAD_COUNT, MAX_DOWNLOAD_COUNT};

    public FileShareTableDef() {
        super("", "file_shares");
    }

    private FileShareTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileShareTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileShareTableDef("", "file_shares", alias));
    }

}
