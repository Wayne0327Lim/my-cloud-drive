package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysWorkspaceInvitationTableDef extends TableDef {

    /**
     * 工作空间邀请表

 @Author: xddcode
 @Date: 2026/3/30 10:11
     */
    public static final SysWorkspaceInvitationTableDef SYS_WORKSPACE_INVITATION = new SysWorkspaceInvitationTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 邀请邮箱
     */
    public final QueryColumn EMAIL = new QueryColumn(this, "email");

    /**
     * 邀请令牌
     */
    public final QueryColumn TOKEN = new QueryColumn(this, "token");

    /**
     * 角色ID
     */
    public final QueryColumn ROLE_ID = new QueryColumn(this, "role_id");

    /**
     * 邀请状态: 0-待接受 1-已接受 2-已过期 3-已取消
     */
    public final QueryColumn STATUS = new QueryColumn(this, "status");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    /**
     * 邀请过期时间
     */
    public final QueryColumn EXPIRES_AT = new QueryColumn(this, "expires_at");

    /**
     * 邀请人ID
     */
    public final QueryColumn INVITED_BY = new QueryColumn(this, "invited_by");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 接受时间
     */
    public final QueryColumn ACCEPTED_AT = new QueryColumn(this, "accepted_at");

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
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, EMAIL, TOKEN, ROLE_ID, STATUS, CREATED_AT, EXPIRES_AT, INVITED_BY, UPDATED_AT, ACCEPTED_AT, WORKSPACE_ID};

    public SysWorkspaceInvitationTableDef() {
        super("", "sys_workspace_invitation");
    }

    private SysWorkspaceInvitationTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysWorkspaceInvitationTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysWorkspaceInvitationTableDef("", "sys_workspace_invitation", alias));
    }

}
