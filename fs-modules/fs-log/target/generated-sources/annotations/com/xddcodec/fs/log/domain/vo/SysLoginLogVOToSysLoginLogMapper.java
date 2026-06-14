package com.xddcodec.fs.log.domain.vo;

import com.xddcodec.fs.log.domain.SysLoginLog;
import com.xddcodec.fs.log.domain.SysLoginLogToSysLoginLogVOMapper;
import io.github.linpeilie.AutoMapperConfig__4;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__4.class,
    uses = {SysLoginLogToSysLoginLogVOMapper.class},
    imports = {}
)
public interface SysLoginLogVOToSysLoginLogMapper extends BaseMapper<SysLoginLogVO, SysLoginLog> {
}
