package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileUserFavoritesTableDef extends TableDef {

    /**
     * 用户收藏文件实体类

 @Author: xddcode
 @Date: 2025/5/12 13:47
     */
    public static final FileUserFavoritesTableDef FILE_USER_FAVORITES = new FileUserFavoritesTableDef();

    public final QueryColumn FILE_ID = new QueryColumn(this, "file_id");

    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    public final QueryColumn FAVORITE_TIME = new QueryColumn(this, "favorite_time");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{FILE_ID, USER_ID, WORKSPACE_ID, FAVORITE_TIME};

    public FileUserFavoritesTableDef() {
        super("", "file_user_favorites");
    }

    private FileUserFavoritesTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileUserFavoritesTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileUserFavoritesTableDef("", "file_user_favorites", alias));
    }

}
