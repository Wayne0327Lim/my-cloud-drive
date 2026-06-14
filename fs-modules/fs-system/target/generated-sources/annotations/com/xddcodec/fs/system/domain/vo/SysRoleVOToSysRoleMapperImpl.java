package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:54+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysRoleVOToSysRoleMapperImpl implements SysRoleVOToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleVO source) {
        if ( source == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setDescription( source.getDescription() );
        sysRole.setCreatedAt( source.getCreatedAt() );
        sysRole.setUpdatedAt( source.getUpdatedAt() );
        sysRole.setId( source.getId() );
        sysRole.setRoleCode( source.getRoleCode() );
        sysRole.setRoleName( source.getRoleName() );
        sysRole.setRoleType( source.getRoleType() );

        return sysRole;
    }

    @Override
    public SysRole convert(SysRoleVO source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        target.setDescription( source.getDescription() );
        target.setCreatedAt( source.getCreatedAt() );
        target.setUpdatedAt( source.getUpdatedAt() );
        target.setId( source.getId() );
        target.setRoleCode( source.getRoleCode() );
        target.setRoleName( source.getRoleName() );
        target.setRoleType( source.getRoleType() );

        return target;
    }
}
