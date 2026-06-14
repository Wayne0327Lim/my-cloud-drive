package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.LoginResult;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:54+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysUserToLoginResultMapperImpl implements SysUserToLoginResultMapper {

    @Override
    public LoginResult convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LoginResult loginResult = new LoginResult();

        loginResult.setId( arg0.getId() );
        loginResult.setUsername( arg0.getUsername() );

        return loginResult;
    }

    @Override
    public LoginResult convert(SysUser arg0, LoginResult arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUsername( arg0.getUsername() );

        return arg1;
    }
}
