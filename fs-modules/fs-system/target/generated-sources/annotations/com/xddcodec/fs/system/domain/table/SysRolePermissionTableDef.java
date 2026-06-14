package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysRolePermissionTableDef extends TableDef {

    /**
     * 角色权限关联实体类

 @Author: xddcode
 @Date: 2026/3/30 10:11
     */
    public static final SysRolePermissionTableDef SYS_ROLE_PERMISSION = new SysRolePermissionTableDef();

    public final QueryColumn ID = new QueryColumn(this, "id");

    public final QueryColumn ROLE_ID = new QueryColumn(this, "role_id");

    public final QueryColumn ROLE_CODE = new QueryColumn(this, "role_code");

    public final QueryColumn PERMISSION_CODE = new QueryColumn(this, "permission_code");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, ROLE_ID, ROLE_CODE, PERMISSION_CODE};

    public SysRolePermissionTableDef() {
        super("", "sys_role_permission");
    }

    private SysRolePermissionTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysRolePermissionTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysRolePermissionTableDef("", "sys_role_permission", alias));
    }

}
