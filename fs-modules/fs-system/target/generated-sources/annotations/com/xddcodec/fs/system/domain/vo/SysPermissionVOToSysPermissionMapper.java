package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysPermission;
import com.xddcodec.fs.system.domain.SysPermissionToSysPermissionVOMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysPermissionToSysPermissionVOMapper.class},
    imports = {}
)
public interface SysPermissionVOToSysPermissionMapper extends BaseMapper<SysPermissionVO, SysPermission> {
}
