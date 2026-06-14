package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysWorkspace;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:54+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class WorkspaceVOToSysWorkspaceMapperImpl implements WorkspaceVOToSysWorkspaceMapper {

    @Override
    public SysWorkspace convert(WorkspaceVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysWorkspace sysWorkspace = new SysWorkspace();

        sysWorkspace.setCreatedAt( arg0.getCreatedAt() );
        sysWorkspace.setUpdatedAt( arg0.getUpdatedAt() );
        sysWorkspace.setId( arg0.getId() );
        sysWorkspace.setName( arg0.getName() );
        sysWorkspace.setSlug( arg0.getSlug() );
        sysWorkspace.setDescription( arg0.getDescription() );
        sysWorkspace.setOwnerId( arg0.getOwnerId() );
        sysWorkspace.setMemberCount( arg0.getMemberCount() );

        return sysWorkspace;
    }

    @Override
    public SysWorkspace convert(WorkspaceVO arg0, SysWorkspace arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setUpdatedAt( arg0.getUpdatedAt() );
        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setSlug( arg0.getSlug() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setOwnerId( arg0.getOwnerId() );
        arg1.setMemberCount( arg0.getMemberCount() );

        return arg1;
    }
}
