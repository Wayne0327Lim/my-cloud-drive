package com.xddcodec.fs.system.domain;

import com.xddcodec.fs.system.domain.vo.LoginResult;
import com.xddcodec.fs.system.domain.vo.LoginResultToSysUserMapper;
import com.xddcodec.fs.system.domain.vo.SysUserVOToSysUserMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {LoginResultToSysUserMapper.class,SysUserVOToSysUserMapper.class,SysUserToSysUserVOMapper.class},
    imports = {}
)
public interface SysUserToLoginResultMapper extends BaseMapper<SysUser, LoginResult> {
}
