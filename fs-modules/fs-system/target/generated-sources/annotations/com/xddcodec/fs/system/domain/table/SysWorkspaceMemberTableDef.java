package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysWorkspaceMemberTableDef extends TableDef {

    /**
     * 工作空间成员表

 @Author: xddcode
 @Date: 2026/3/30 10:11
     */
    public static final SysWorkspaceMemberTableDef SYS_WORKSPACE_MEMBER = new SysWorkspaceMemberTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 该成员在此工作空间的角色ID
     */
    public final QueryColumn ROLE_ID = new QueryColumn(this, "role_id");

    /**
     * 用户ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    /**
     * 加入时间
     */
    public final QueryColumn JOINED_AT = new QueryColumn(this, "joined_at");

    /**
     * 更新时间
     */
    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 工作空间ID
     */
    public final QueryColumn WORKSPACE_ID = new QueryColumn(this, "workspace_id");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, ROLE_ID, USER_ID, JOINED_AT, UPDATED_AT, WORKSPACE_ID};

    public SysWorkspaceMemberTableDef() {
        super("", "sys_workspace_member");
    }

    private SysWorkspaceMemberTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysWorkspaceMemberTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysWorkspaceMemberTableDef("", "sys_workspace_member", alias));
    }

}
