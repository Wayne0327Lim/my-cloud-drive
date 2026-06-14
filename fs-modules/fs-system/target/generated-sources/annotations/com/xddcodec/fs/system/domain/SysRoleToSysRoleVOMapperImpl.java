package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.SysRoleVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysRoleToSysRoleVOMapperImpl implements SysRoleToSysRoleVOMapper {

    @Override
    public SysRoleVO convert(SysRole source) {
        if ( source == null ) {
            return null;
        }

        SysRoleVO sysRoleVO = new SysRoleVO();

        sysRoleVO.setDescription( source.getDescription() );
        sysRoleVO.setId( source.getId() );
        sysRoleVO.setRoleCode( source.getRoleCode() );
        sysRoleVO.setRoleName( source.getRoleName() );
        sysRoleVO.setRoleType( source.getRoleType() );
        sysRoleVO.setCreatedAt( source.getCreatedAt() );
        sysRoleVO.setUpdatedAt( source.getUpdatedAt() );

        return sysRoleVO;
    }

    @Override
    public SysRoleVO convert(SysRole source, SysRoleVO target) {
        if ( source == null ) {
            return target;
        }

        target.setDescription( source.getDescription() );
        target.setId( source.getId() );
        target.setRoleCode( source.getRoleCode() );
        target.setRoleName( source.getRoleName() );
        target.setRoleType( source.getRoleType() );
        target.setCreatedAt( source.getCreatedAt() );
        target.setUpdatedAt( source.getUpdatedAt() );

        return target;
    }
}
