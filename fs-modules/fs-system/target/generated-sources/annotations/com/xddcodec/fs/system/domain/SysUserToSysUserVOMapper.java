package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.LoginResultToSysUserMapper;
import com.xddcodec.fs.system.domain.vo.SysUserVO;
import com.xddcodec.fs.system.domain.vo.SysUserVOToSysUserMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {LoginResultToSysUserMapper.class,SysUserVOToSysUserMapper.class,SysUserToLoginResultMapper.class},
    imports = {}
)
public interface SysUserToSysUserVOMapper extends BaseMapper<SysUser, SysUserVO> {
}
