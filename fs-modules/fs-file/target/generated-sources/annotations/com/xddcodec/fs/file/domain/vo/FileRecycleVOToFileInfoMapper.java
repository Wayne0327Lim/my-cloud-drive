package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileInfo;
import com.xddcodec.fs.file.domain.FileInfoToFileRecycleVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileInfoToFileRecycleVOMapper.class},
    imports = {}
)
public interface FileRecycleVOToFileInfoMapper extends BaseMapper<FileRecycleVO, FileInfo> {
}
