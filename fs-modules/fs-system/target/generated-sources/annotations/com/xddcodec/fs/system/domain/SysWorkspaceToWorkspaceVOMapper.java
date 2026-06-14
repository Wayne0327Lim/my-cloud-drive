package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.WorkspaceVO;
import com.xddcodec.fs.system.domain.vo.WorkspaceVOToSysWorkspaceMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {WorkspaceVOToSysWorkspaceMapper.class},
    imports = {}
)
public interface SysWorkspaceToWorkspaceVOMapper extends BaseMapper<SysWorkspace, WorkspaceVO> {
}
