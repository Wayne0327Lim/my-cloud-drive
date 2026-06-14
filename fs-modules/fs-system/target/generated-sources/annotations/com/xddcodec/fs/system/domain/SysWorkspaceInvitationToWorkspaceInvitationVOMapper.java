package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.WorkspaceInvitationVO;
import com.xddcodec.fs.system.domain.vo.WorkspaceInvitationVOToSysWorkspaceInvitationMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {WorkspaceInvitationVOToSysWorkspaceInvitationMapper.class},
    imports = {}
)
public interface SysWorkspaceInvitationToWorkspaceInvitationVOMapper extends BaseMapper<SysWorkspaceInvitation, WorkspaceInvitationVO> {
}
