package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysPermissionTableDef extends TableDef {

    /**
     * 权限实体类

 @Author: xddcode
 @Date: 2026/3/30 10:11
     */
    public static final SysPermissionTableDef SYS_PERMISSION = new SysPermissionTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 排序
     */
    public final QueryColumn SORT = new QueryColumn(this, "sort");

    /**
     * 模块
     */
    public final QueryColumn MODULE = new QueryColumn(this, "module");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 权限描述
     */
    public final QueryColumn DESCRIPTION = new QueryColumn(this, "description");

    /**
     * 权限编码
     */
    public final QueryColumn PERMISSION_CODE = new QueryColumn(this, "permission_code");

    /**
     * 权限名称
     */
    public final QueryColumn PERMISSION_NAME = new QueryColumn(this, "permission_name");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, SORT, MODULE, CREATED_AT, UPDATED_AT, DESCRIPTION, PERMISSION_CODE, PERMISSION_NAME};

    public SysPermissionTableDef() {
        super("", "sys_permission");
    }

    private SysPermissionTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysPermissionTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysPermissionTableDef("", "sys_permission", alias));
    }

}
