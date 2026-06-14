package com.xddcodec.fs.file.domain.dto;

import com.xddcodec.fs.file.domain.FileShareAccessRecord;
import com.xddcodec.fs.file.domain.FileShareAccessRecordToCreateFileShareAccessRecordCmdMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileShareAccessRecordToCreateFileShareAccessRecordCmdMapper.class},
    imports = {}
)
public interface CreateFileShareAccessRecordCmdToFileShareAccessRecordMapper extends BaseMapper<CreateFileShareAccessRecordCmd, FileShareAccessRecord> {
}
