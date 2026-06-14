package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysWorkspaceInvitation;
import com.xddcodec.fs.system.domain.SysWorkspaceInvitationToWorkspaceInvitationVOMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysWorkspaceInvitationToWorkspaceInvitationVOMapper.class},
    imports = {}
)
public interface WorkspaceInvitationVOToSysWorkspaceInvitationMapper extends BaseMapper<WorkspaceInvitationVO, SysWorkspaceInvitation> {
}
