package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysUserVOToSysUserMapperImpl implements SysUserVOToSysUserMapper {

    @Override
    public SysUser convert(SysUserVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setCreatedAt( arg0.getCreatedAt() );
        sysUser.setUpdatedAt( arg0.getUpdatedAt() );
        sysUser.setId( arg0.getId() );
        sysUser.setUsername( arg0.getUsername() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setNickname( arg0.getNickname() );
        sysUser.setAvatar( arg0.getAvatar() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setLastLoginAt( arg0.getLastLoginAt() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserVO arg0, SysUser arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setUpdatedAt( arg0.getUpdatedAt() );
        arg1.setId( arg0.getId() );
        arg1.setUsername( arg0.getUsername() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setNickname( arg0.getNickname() );
        arg1.setAvatar( arg0.getAvatar() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setLastLoginAt( arg0.getLastLoginAt() );

        return arg1;
    }
}
