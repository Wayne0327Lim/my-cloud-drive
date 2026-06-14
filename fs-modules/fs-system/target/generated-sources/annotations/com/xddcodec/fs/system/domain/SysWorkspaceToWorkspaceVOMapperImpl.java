package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.WorkspaceVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:54+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysWorkspaceToWorkspaceVOMapperImpl implements SysWorkspaceToWorkspaceVOMapper {

    @Override
    public WorkspaceVO convert(SysWorkspace arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WorkspaceVO workspaceVO = new WorkspaceVO();

        workspaceVO.setId( arg0.getId() );
        workspaceVO.setName( arg0.getName() );
        workspaceVO.setSlug( arg0.getSlug() );
        workspaceVO.setDescription( arg0.getDescription() );
        workspaceVO.setOwnerId( arg0.getOwnerId() );
        workspaceVO.setMemberCount( arg0.getMemberCount() );
        workspaceVO.setCreatedAt( arg0.getCreatedAt() );
        workspaceVO.setUpdatedAt( arg0.getUpdatedAt() );

        return workspaceVO;
    }

    @Override
    public WorkspaceVO convert(SysWorkspace arg0, WorkspaceVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setSlug( arg0.getSlug() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setOwnerId( arg0.getOwnerId() );
        arg1.setMemberCount( arg0.getMemberCount() );
        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setUpdatedAt( arg0.getUpdatedAt() );

        return arg1;
    }
}
