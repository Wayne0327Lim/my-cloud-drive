package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileShareItemTableDef extends TableDef {

    /**
     * 分享文件关联实体类

 @Author: xddcode
 @Date: 2025/10/29 15:13
     */
    public static final FileShareItemTableDef FILE_SHARE_ITEM = new FileShareItemTableDef();

    /**
     * 文件/文件夹ID
     */
    public final QueryColumn FILE_ID = new QueryColumn(this, "file_id");

    /**
     * 分享ID
     */
    public final QueryColumn SHARE_ID = new QueryColumn(this, "share_id");

    /**
     * 创建时间
     */
    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{FILE_ID, SHARE_ID, CREATED_AT};

    public FileShareItemTableDef() {
        super("", "file_share_items");
    }

    private FileShareItemTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileShareItemTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileShareItemTableDef("", "file_share_items", alias));
    }

}
