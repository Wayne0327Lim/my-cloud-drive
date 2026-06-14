package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileTransferTaskVO;
import com.xddcodec.fs.file.domain.vo.FileTransferTaskVOToFileTransferTaskMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileTransferTaskVOToFileTransferTaskMapper.class},
    imports = {}
)
public interface FileTransferTaskToFileTransferTaskVOMapper extends BaseMapper<FileTransferTask, FileTransferTaskVO> {
}
