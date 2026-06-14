package com.xddcodec.fs.log.domain.vo;

import com.xddcodec.fs.log.domain.SysLoginLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:28+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysLoginLogVOToSysLoginLogMapperImpl implements SysLoginLogVOToSysLoginLogMapper {

    @Override
    public SysLoginLog convert(SysLoginLogVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLoginLog sysLoginLog = new SysLoginLog();

        sysLoginLog.setId( arg0.getId() );
        sysLoginLog.setUserId( arg0.getUserId() );
        sysLoginLog.setUsername( arg0.getUsername() );
        sysLoginLog.setLoginIp( arg0.getLoginIp() );
        sysLoginLog.setLoginAddress( arg0.getLoginAddress() );
        sysLoginLog.setLoginType( arg0.getLoginType() );
        sysLoginLog.setBrowser( arg0.getBrowser() );
        sysLoginLog.setOs( arg0.getOs() );
        sysLoginLog.setStatus( arg0.getStatus() );
        sysLoginLog.setMsg( arg0.getMsg() );
        sysLoginLog.setLoginTime( arg0.getLoginTime() );

        return sysLoginLog;
    }

    @Override
    public SysLoginLog convert(SysLoginLogVO arg0, SysLoginLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setUsername( arg0.getUsername() );
        arg1.setLoginIp( arg0.getLoginIp() );
        arg1.setLoginAddress( arg0.getLoginAddress() );
        arg1.setLoginType( arg0.getLoginType() );
        arg1.setBrowser( arg0.getBrowser() );
        arg1.setOs( arg0.getOs() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setMsg( arg0.getMsg() );
        arg1.setLoginTime( arg0.getLoginTime() );

        return arg1;
    }
}
