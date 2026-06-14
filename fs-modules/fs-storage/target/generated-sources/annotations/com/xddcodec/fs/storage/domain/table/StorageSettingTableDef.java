package com.xddcodec.fs.storage.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class StorageSettingTableDef extends TableDef {

    /**
     * 存储平台配置表

 @Author: xddcode
 @Date: 2024/10/25 14:30
     */
    public static final StorageSettingTableDef STORAGE_SETTING = new StorageSettingTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 备注
     */
    public final QueryColumn REMARK = new QueryColumn(this, "remark");

    /**
     * 是否逻辑删除 0-否 1-是
     */
    public final QueryColumn DELETED = new QueryColumn(this, "deleted");

    /**
     * 是否启用 0-否 1-是
     */
    public final QueryColumn ENABLED = new QueryColumn(this, "enabled");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 配置数据
     */
    public final QueryColumn CONFIG_DATA = new QueryColumn(this, "config_data");

    /**
     * 所属工作空间ID
     */
    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    /**
     * 存储平台标识符
     */
    public final QueryColumn PLATFORM_IDENTIFIER = new QueryColumn(this, "platform_identifier");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, REMARK, ENABLED, CREATED_AT, UPDATED_AT, CONFIG_DATA, WORKSPACE_ID, PLATFORM_IDENTIFIER};

    public StorageSettingTableDef() {
        super("", "storage_settings");
    }

    private StorageSettingTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public StorageSettingTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new StorageSettingTableDef("", "storage_settings", alias));
    }

}
