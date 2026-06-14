package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.SysRoleVO;
import com.xddcodec.fs.system.domain.vo.SysRoleVOToSysRoleMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysRoleVOToSysRoleMapper.class},
    imports = {}
)
public interface SysRoleToSysRoleVOMapper extends BaseMapper<SysRole, SysRoleVO> {
  @Mapping(
      target = "description",
      source = "description"
  )
  SysRoleVO convert(SysRole source);

  @Mapping(
      target = "description",
      source = "description"
  )
  SysRoleVO convert(SysRole source, @MappingTarget SysRoleVO target);
}
