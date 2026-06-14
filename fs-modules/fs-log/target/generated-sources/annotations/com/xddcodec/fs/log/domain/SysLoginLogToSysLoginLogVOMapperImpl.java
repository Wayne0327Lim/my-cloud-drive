package com.xddcodec.fs.log.domain;

import com.xddcodec.fs.log.domain.vo.SysLoginLogVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:28+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysLoginLogToSysLoginLogVOMapperImpl implements SysLoginLogToSysLoginLogVOMapper {

    @Override
    public SysLoginLogVO convert(SysLoginLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLoginLogVO sysLoginLogVO = new SysLoginLogVO();

        sysLoginLogVO.setId( arg0.getId() );
        sysLoginLogVO.setUserId( arg0.getUserId() );
        sysLoginLogVO.setUsername( arg0.getUsername() );
        sysLoginLogVO.setLoginIp( arg0.getLoginIp() );
        sysLoginLogVO.setLoginAddress( arg0.getLoginAddress() );
        sysLoginLogVO.setLoginType( arg0.getLoginType() );
        sysLoginLogVO.setBrowser( arg0.getBrowser() );
        sysLoginLogVO.setOs( arg0.getOs() );
        sysLoginLogVO.setStatus( arg0.getStatus() );
        sysLoginLogVO.setMsg( arg0.getMsg() );
        sysLoginLogVO.setLoginTime( arg0.getLoginTime() );

        return sysLoginLogVO;
    }

    @Override
    public SysLoginLogVO convert(SysLoginLog arg0, SysLoginLogVO arg1) {
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
