package com.xddcodec.fs.storage.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class StoragePlatformTableDef extends TableDef {

    /**
     * 存储平台表

 @Author: xddcode
 @Date: 2024/10/25 14:30
     */
    public static final StoragePlatformTableDef STORAGE_PLATFORM = new StoragePlatformTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 存储平台描述
     */
    public final QueryColumn DESC = new QueryColumn(this, "desc");

    /**
     * 存储平台图标
     */
    public final QueryColumn ICON = new QueryColumn(this, "icon");

    /**
     * 存储平台链接
     */
    public final QueryColumn LINK = new QueryColumn(this, "link");

    /**
     * 存储平台名称
     */
    public final QueryColumn NAME = new QueryColumn(this, "name");

    /**
     * 是否默认存储平台 0-否 1-是
     */
    public final QueryColumn IS_DEFAULT = new QueryColumn(this, "is_default");

    /**
     * 存储平台标识符
     */
    public final QueryColumn IDENTIFIER = new QueryColumn(this, "identifier");

    /**
     * 存储平台配置描述schema
     */
    public final QueryColumn CONFIG_SCHEME = new QueryColumn(this, "config_scheme");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, DESC, ICON, LINK, NAME, IS_DEFAULT, IDENTIFIER, CONFIG_SCHEME};

    public StoragePlatformTableDef() {
        super("", "storage_platform");
    }

    private StoragePlatformTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public StoragePlatformTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new StoragePlatformTableDef("", "storage_platform", alias));
    }

}
