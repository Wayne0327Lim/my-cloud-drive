package com.xddcodec.fs.system.domain.vo;

import com.xddcodec.fs.system.domain.SysUser;
import com.xddcodec.fs.system.domain.SysUserToLoginResultMapper;
import io.github.linpeilie.AutoMapperConfig__6;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__6.class,
    uses = {SysUserToLoginResultMapper.class},
    imports = {}
)
public interface LoginResultToSysUserMapper extends BaseMapper<LoginResult, SysUser> {
}
