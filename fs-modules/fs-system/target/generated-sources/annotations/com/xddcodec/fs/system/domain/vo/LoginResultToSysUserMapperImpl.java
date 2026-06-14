package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:54+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class LoginResultToSysUserMapperImpl implements LoginResultToSysUserMapper {

    @Override
    public SysUser convert(LoginResult arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setId( arg0.getId() );
        sysUser.setUsername( arg0.getUsername() );

        return sysUser;
    }

    @Override
    public SysUser convert(LoginResult arg0, SysUser arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUsername( arg0.getUsername() );

        return arg1;
    }
}
