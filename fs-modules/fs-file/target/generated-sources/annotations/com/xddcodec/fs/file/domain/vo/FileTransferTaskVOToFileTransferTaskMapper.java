package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileTransferTask;
import com.xddcodec.fs.file.domain.FileTransferTaskToFileTransferTaskVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileTransferTaskToFileTransferTaskVOMapper.class},
    imports = {}
)
public interface FileTransferTaskVOToFileTransferTaskMapper extends BaseMapper<FileTransferTaskVO, FileTransferTask> {
}
