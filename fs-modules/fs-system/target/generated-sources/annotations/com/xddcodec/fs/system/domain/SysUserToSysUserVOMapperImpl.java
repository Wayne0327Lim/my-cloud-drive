package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.SysUserVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysUserToSysUserVOMapperImpl implements SysUserToSysUserVOMapper {

    @Override
    public SysUserVO convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserVO sysUserVO = new SysUserVO();

        sysUserVO.setId( arg0.getId() );
        sysUserVO.setUsername( arg0.getUsername() );
        sysUserVO.setNickname( arg0.getNickname() );
        sysUserVO.setAvatar( arg0.getAvatar() );
        sysUserVO.setEmail( arg0.getEmail() );
        sysUserVO.setStatus( arg0.getStatus() );
        sysUserVO.setCreatedAt( arg0.getCreatedAt() );
        sysUserVO.setUpdatedAt( arg0.getUpdatedAt() );
        sysUserVO.setLastLoginAt( arg0.getLastLoginAt() );

        return sysUserVO;
    }

    @Override
    public SysUserVO convert(SysUser arg0, SysUserVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUsername( arg0.getUsername() );
        arg1.setNickname( arg0.getNickname() );
        arg1.setAvatar( arg0.getAvatar() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setUpdatedAt( arg0.getUpdatedAt() );
        arg1.setLastLoginAt( arg0.getLastLoginAt() );

        return arg1;
    }
}
