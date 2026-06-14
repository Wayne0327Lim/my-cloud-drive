package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.dto.CreateFileShareAccessRecordCmdToFileShareAccessRecordMapper;
import com.xddcodec.fs.file.domain.vo.FileShareAccessRecordVO;
import com.xddcodec.fs.file.domain.vo.FileShareAccessRecordVOToFileShareAccessRecordMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileShareAccessRecordVOToFileShareAccessRecordMapper.class,CreateFileShareAccessRecordCmdToFileShareAccessRecordMapper.class,FileShareAccessRecordToCreateFileShareAccessRecordCmdMapper.class},
    imports = {}
)
public interface FileShareAccessRecordToFileShareAccessRecordVOMapper extends BaseMapper<FileShareAccessRecord, FileShareAccessRecordVO> {
}
