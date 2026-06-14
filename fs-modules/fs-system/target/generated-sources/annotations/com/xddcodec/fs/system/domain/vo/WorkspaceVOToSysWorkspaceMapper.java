package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysWorkspace;
import com.xddcodec.fs.system.domain.SysWorkspaceToWorkspaceVOMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysWorkspaceToWorkspaceVOMapper.class},
    imports = {}
)
public interface WorkspaceVOToSysWorkspaceMapper extends BaseMapper<WorkspaceVO, SysWorkspace> {
}
