package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysPermission;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysPermissionVOToSysPermissionMapperImpl implements SysPermissionVOToSysPermissionMapper {

    @Override
    public SysPermission convert(SysPermissionVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPermission sysPermission = new SysPermission();

        sysPermission.setId( arg0.getId() );
        sysPermission.setPermissionCode( arg0.getPermissionCode() );
        sysPermission.setPermissionName( arg0.getPermissionName() );
        sysPermission.setModule( arg0.getModule() );
        sysPermission.setDescription( arg0.getDescription() );
        sysPermission.setSort( arg0.getSort() );

        return sysPermission;
    }

    @Override
    public SysPermission convert(SysPermissionVO arg0, SysPermission arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setPermissionCode( arg0.getPermissionCode() );
        arg1.setPermissionName( arg0.getPermissionName() );
        arg1.setModule( arg0.getModule() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setSort( arg0.getSort() );

        return arg1;
    }
}
