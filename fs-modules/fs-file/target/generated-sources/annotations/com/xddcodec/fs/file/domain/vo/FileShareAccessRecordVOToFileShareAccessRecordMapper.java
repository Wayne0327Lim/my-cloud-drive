package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileShareAccessRecord;
import com.xddcodec.fs.file.domain.FileShareAccessRecordToFileShareAccessRecordVOMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileShareAccessRecordToFileShareAccessRecordVOMapper.class},
    imports = {}
)
public interface FileShareAccessRecordVOToFileShareAccessRecordMapper extends BaseMapper<FileShareAccessRecordVO, FileShareAccessRecord> {
}
