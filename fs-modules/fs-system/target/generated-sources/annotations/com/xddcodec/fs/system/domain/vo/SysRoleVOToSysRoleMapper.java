package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysRole;
import com.xddcodec.fs.system.domain.SysRoleToSysRoleVOMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysRoleToSysRoleVOMapper.class},
    imports = {}
)
public interface SysRoleVOToSysRoleMapper extends BaseMapper<SysRoleVO, SysRole> {
  @Mapping(
      target = "description",
      source = "description"
  )
  SysRole convert(SysRoleVO source);

  @Mapping(
      target = "description",
      source = "description"
  )
  SysRole convert(SysRoleVO source, @MappingTarget SysRole target);
}
