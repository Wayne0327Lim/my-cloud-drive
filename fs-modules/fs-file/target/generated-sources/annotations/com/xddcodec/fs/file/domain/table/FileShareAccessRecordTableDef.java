package com.xddcodec.fs.file.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class FileShareAccessRecordTableDef extends TableDef {

    /**
     * 分享访问记录表

 @Author: xddcode
 @Date: 2025/10/29 15:13
     */
    public static final FileShareAccessRecordTableDef FILE_SHARE_ACCESS_RECORD = new FileShareAccessRecordTableDef();

    /**
     * 分享ID
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 访问操作系统
     */
    public final QueryColumn OS = new QueryColumn(this, "os");

    /**
     * 访问浏览器
     */
    public final QueryColumn BROWSER = new QueryColumn(this, "browser");

    /**
     * 分享ID
     */
    public final QueryColumn SHARE_ID = new QueryColumn(this, "share_id");

    /**
     * 访问IP
     */
    public final QueryColumn ACCESS_IP = new QueryColumn(this, "access_ip");

    /**
     * 访问时间
     */
    public final QueryColumn ACCESS_TIME = new QueryColumn(this, "access_time");

    /**
     * 访问地址
     */
    public final QueryColumn ACCESS_ADDRESS = new QueryColumn(this, "access_address");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, OS, BROWSER, SHARE_ID, ACCESS_IP, ACCESS_TIME, ACCESS_ADDRESS};

    public FileShareAccessRecordTableDef() {
        super("", "file_share_access_record");
    }

    private FileShareAccessRecordTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public FileShareAccessRecordTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new FileShareAccessRecordTableDef("", "file_share_access_record", alias));
    }

}
