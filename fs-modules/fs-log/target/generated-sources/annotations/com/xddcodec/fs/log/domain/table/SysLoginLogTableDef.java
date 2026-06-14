package com.xddcodec.fs.log.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysLoginLogTableDef extends TableDef {

    /**
     * 登录日志表实体

 @Author: xddcodec
 @Date: 2025/9/25 14:35
     */
    public static final SysLoginLogTableDef SYS_LOGIN_LOG = new SysLoginLogTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 操作系统
     */
    public final QueryColumn OS = new QueryColumn(this, "os");

    /**
     * 提示消息
     */
    public final QueryColumn MSG = new QueryColumn(this, "msg");

    /**
     * 登录状态 0成功 1失败
     */
    public final QueryColumn STATUS = new QueryColumn(this, "status");

    /**
     * 用户ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    /**
     * 浏览器类型
     */
    public final QueryColumn BROWSER = new QueryColumn(this, "browser");

    /**
     * 登录IP地址
     */
    public final QueryColumn LOGIN_IP = new QueryColumn(this, "login_ip");

    /**
     * 用户名
     */
    public final QueryColumn USERNAME = new QueryColumn(this, "username");

    /**
     * 登录时间
     */
    public final QueryColumn LOGIN_TIME = new QueryColumn(this, "login_time");

    /**
     * 登录方式
     */
    public final QueryColumn LOGIN_TYPE = new QueryColumn(this, "login_type");

    /**
     * 登录地址
     */
    public final QueryColumn LOGIN_ADDRESS = new QueryColumn(this, "login_address");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, OS, MSG, STATUS, USER_ID, BROWSER, LOGIN_IP, USERNAME, LOGIN_TIME, LOGIN_TYPE, LOGIN_ADDRESS};

    public SysLoginLogTableDef() {
        super("", "sys_login_log");
    }

    private SysLoginLogTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysLoginLogTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysLoginLogTableDef("", "sys_login_log", alias));
    }

}
