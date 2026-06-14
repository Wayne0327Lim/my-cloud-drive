package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileShare;
import com.xddcodec.fs.file.domain.FileShareToFileShareThinVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileShareToFileShareThinVOMapper.class},
    imports = {}
)
public interface FileShareThinVOToFileShareMapper extends BaseMapper<FileShareThinVO, FileShare> {
}
