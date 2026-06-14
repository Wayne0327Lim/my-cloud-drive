package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileInfo;
import com.xddcodec.fs.file.domain.FileInfoToFileVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileInfoToFileVOMapper.class},
    imports = {}
)
public interface FileVOToFileInfoMapper extends BaseMapper<FileVO, FileInfo> {
}
