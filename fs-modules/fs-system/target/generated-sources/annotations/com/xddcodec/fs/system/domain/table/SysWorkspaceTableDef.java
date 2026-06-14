package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysWorkspaceTableDef extends TableDef {

    /**
     * 工作空间实体类

 @Author: xddcode
 @Date: 2026/3/30 10:11
     */
    public static final SysWorkspaceTableDef SYS_WORKSPACE = new SysWorkspaceTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 工作空间名称
     */
    public final QueryColumn NAME = new QueryColumn(this, "name");

    /**
     * URL友好的唯一标识
     */
    public final QueryColumn SLUG = new QueryColumn(this, "slug");

    /**
     * 所有者id
     */
    public final QueryColumn OWNER_ID = new QueryColumn(this, "owner_id");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 描述
     */
    public final QueryColumn DESCRIPTION = new QueryColumn(this, "description");

    /**
     * 成员数量
     */
    public final QueryColumn MEMBER_COUNT = new QueryColumn(this, "member_count");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, NAME, SLUG, OWNER_ID, CREATED_AT, UPDATED_AT, DESCRIPTION, MEMBER_COUNT};

    public SysWorkspaceTableDef() {
        super("", "sys_workspace");
    }

    private SysWorkspaceTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysWorkspaceTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysWorkspaceTableDef("", "sys_workspace", alias));
    }

}
