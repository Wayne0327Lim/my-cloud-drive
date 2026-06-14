package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileInfo;
import com.xddcodec.fs.file.domain.FileInfoToFileDetailVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileInfoToFileDetailVOMapper.class},
    imports = {}
)
public interface FileDetailVOToFileInfoMapper extends BaseMapper<FileDetailVO, FileInfo> {
}
