package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.SysPermissionVO;
import com.xddcodec.fs.system.domain.vo.SysPermissionVOToSysPermissionMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysPermissionVOToSysPermissionMapper.class},
    imports = {}
)
public interface SysPermissionToSysPermissionVOMapper extends BaseMapper<SysPermission, SysPermissionVO> {
}
