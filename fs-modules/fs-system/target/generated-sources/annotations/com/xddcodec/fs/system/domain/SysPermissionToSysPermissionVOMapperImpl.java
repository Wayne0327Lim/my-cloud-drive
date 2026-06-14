package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.SysPermissionVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysPermissionToSysPermissionVOMapperImpl implements SysPermissionToSysPermissionVOMapper {

    @Override
    public SysPermissionVO convert(SysPermission arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysPermissionVO sysPermissionVO = new SysPermissionVO();

        sysPermissionVO.setId( arg0.getId() );
        sysPermissionVO.setPermissionCode( arg0.getPermissionCode() );
        sysPermissionVO.setPermissionName( arg0.getPermissionName() );
        sysPermissionVO.setModule( arg0.getModule() );
        sysPermissionVO.setDescription( arg0.getDescription() );
        sysPermissionVO.setSort( arg0.getSort() );

        return sysPermissionVO;
    }

    @Override
    public SysPermissionVO convert(SysPermission arg0, SysPermissionVO arg1) {
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
