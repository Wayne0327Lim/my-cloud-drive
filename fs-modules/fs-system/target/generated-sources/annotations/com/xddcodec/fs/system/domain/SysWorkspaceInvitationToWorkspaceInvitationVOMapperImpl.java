package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.WorkspaceInvitationVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SysWorkspaceInvitationToWorkspaceInvitationVOMapperImpl implements SysWorkspaceInvitationToWorkspaceInvitationVOMapper {

    @Override
    public WorkspaceInvitationVO convert(SysWorkspaceInvitation arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WorkspaceInvitationVO workspaceInvitationVO = new WorkspaceInvitationVO();

        workspaceInvitationVO.setId( arg0.getId() );
        workspaceInvitationVO.setWorkspaceId( arg0.getWorkspaceId() );
        workspaceInvitationVO.setEmail( arg0.getEmail() );
        workspaceInvitationVO.setRoleId( arg0.getRoleId() );
        workspaceInvitationVO.setRoleName( arg0.getRoleName() );
        workspaceInvitationVO.setInvitedBy( arg0.getInvitedBy() );
        workspaceInvitationVO.setStatus( arg0.getStatus() );
        workspaceInvitationVO.setExpiresAt( arg0.getExpiresAt() );
        workspaceInvitationVO.setAcceptedAt( arg0.getAcceptedAt() );
        workspaceInvitationVO.setCreatedAt( arg0.getCreatedAt() );

        return workspaceInvitationVO;
    }

    @Override
    public WorkspaceInvitationVO convert(SysWorkspaceInvitation arg0, WorkspaceInvitationVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setWorkspaceId( arg0.getWorkspaceId() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setRoleName( arg0.getRoleName() );
        arg1.setInvitedBy( arg0.getInvitedBy() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setExpiresAt( arg0.getExpiresAt() );
        arg1.setAcceptedAt( arg0.getAcceptedAt() );
        arg1.setCreatedAt( arg0.getCreatedAt() );

        return arg1;
    }
}
