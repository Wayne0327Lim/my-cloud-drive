package com.xddcodec.fs.system.domain.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class SysUserTransferSettingTableDef extends TableDef {

    /**
     * 用户传输设置实体类

 @Author: xddcode
 @Date: 2025/11/11 14:35
     */
    public static final SysUserTransferSettingTableDef SYS_USER_TRANSFER_SETTING = new SysUserTransferSettingTableDef();

    /**
     * 自增id
     */
    public final QueryColumn ID = new QueryColumn(this, "id");

    /**
     * 用户ID
     */
    public final QueryColumn USER_ID = new QueryColumn(this, "user_id");

    /**
     * 分片大小（字节），默认 5MB
     */
    public final QueryColumn CHUNK_SIZE = new QueryColumn(this, "chunk_size");

    public final QueryColumn CREATED_AT = new QueryColumn(this, "created_at");

    public final QueryColumn UPDATED_AT = new QueryColumn(this, "updated_at");

    /**
     * 文件下载位置
     */
    public final QueryColumn DOWNLOAD_LOCATION = new QueryColumn(this, "download_location");

    /**
     * 下载速率限制 单位：MB/S
     */
    public final QueryColumn DOWNLOAD_SPEED_LIMIT = new QueryColumn(this, "download_speed_limit");

    /**
     * 并发上传数量
     */
    public final QueryColumn CONCURRENT_UPLOAD_QUANTITY = new QueryColumn(this, "concurrent_upload_quantity");

    /**
     * 是否默认该路径为下载路径，如果否则每次下载询问保存地址
     */
    public final QueryColumn IS_DEFAULT_DOWNLOAD_LOCATION = new QueryColumn(this, "is_default_download_location");

    /**
     * 并发下载数量
     */
    public final QueryColumn CONCURRENT_DOWNLOAD_QUANTITY = new QueryColumn(this, "concurrent_download_quantity");

    /**
     * 所有字段。
     */
    public final QueryColumn ALL_COLUMNS = new QueryColumn(this, "*");

    /**
     * 默认字段，不包含逻辑删除或者 large 等字段。
     */
    public final QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, USER_ID, CHUNK_SIZE, CREATED_AT, UPDATED_AT, DOWNLOAD_LOCATION, DOWNLOAD_SPEED_LIMIT, CONCURRENT_UPLOAD_QUANTITY, IS_DEFAULT_DOWNLOAD_LOCATION, CONCURRENT_DOWNLOAD_QUANTITY};

    public SysUserTransferSettingTableDef() {
        super("", "sys_user_transfer_setting");
    }

    private SysUserTransferSettingTableDef(String schema, String name, String alisa) {
        super(schema, name, alisa);
    }

    public SysUserTransferSettingTableDef as(String alias) {
        String key = getNameWithSchema() + "." + alias;
        return getCache(key, k -> new SysUserTransferSettingTableDef("", "sys_user_transfer_setting", alias));
    }

}
