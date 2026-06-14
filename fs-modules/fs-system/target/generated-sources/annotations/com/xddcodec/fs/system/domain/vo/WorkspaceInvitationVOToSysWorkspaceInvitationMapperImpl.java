package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysWorkspaceInvitation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:55+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class WorkspaceInvitationVOToSysWorkspaceInvitationMapperImpl implements WorkspaceInvitationVOToSysWorkspaceInvitationMapper {

    @Override
    public SysWorkspaceInvitation convert(WorkspaceInvitationVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysWorkspaceInvitation sysWorkspaceInvitation = new SysWorkspaceInvitation();

        sysWorkspaceInvitation.setCreatedAt( arg0.getCreatedAt() );
        sysWorkspaceInvitation.setId( arg0.getId() );
        sysWorkspaceInvitation.setWorkspaceId( arg0.getWorkspaceId() );
        sysWorkspaceInvitation.setEmail( arg0.getEmail() );
        sysWorkspaceInvitation.setRoleId( arg0.getRoleId() );
        sysWorkspaceInvitation.setInvitedBy( arg0.getInvitedBy() );
        sysWorkspaceInvitation.setStatus( arg0.getStatus() );
        sysWorkspaceInvitation.setExpiresAt( arg0.getExpiresAt() );
        sysWorkspaceInvitation.setAcceptedAt( arg0.getAcceptedAt() );
        sysWorkspaceInvitation.setRoleName( arg0.getRoleName() );

        return sysWorkspaceInvitation;
    }

    @Override
    public SysWorkspaceInvitation convert(WorkspaceInvitationVO arg0, SysWorkspaceInvitation arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setId( arg0.getId() );
        arg1.setWorkspaceId( arg0.getWorkspaceId() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setInvitedBy( arg0.getInvitedBy() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setExpiresAt( arg0.getExpiresAt() );
        arg1.setAcceptedAt( arg0.getAcceptedAt() );
        arg1.setRoleName( arg0.getRoleName() );

        return arg1;
    }
}
