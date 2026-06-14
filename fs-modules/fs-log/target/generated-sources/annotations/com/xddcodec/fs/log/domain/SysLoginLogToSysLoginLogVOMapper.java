package com.xddcodec.fs.log.domain;

import com.xddcodec.fs.log.domain.vo.SysLoginLogVO;
import com.xddcodec.fs.log.domain.vo.SysLoginLogVOToSysLoginLogMapper;
import io.github.linpeilie.AutoMapperConfig__4;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__4.class,
    uses = {SysLoginLogVOToSysLoginLogMapper.class},
    imports = {}
)
public interface SysLoginLogToSysLoginLogVOMapper extends BaseMapper<SysLoginLog, SysLoginLogVO> {
}
