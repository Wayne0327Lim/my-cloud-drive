package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileShareThinVO;
import com.xddcodec.fs.file.domain.vo.FileShareThinVOToFileShareMapper;
import com.xddcodec.fs.file.domain.vo.FileShareVOToFileShareMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileShareThinVOToFileShareMapper.class,FileShareVOToFileShareMapper.class,FileShareToFileShareVOMapper.class},
    imports = {}
)
public interface FileShareToFileShareThinVOMapper extends BaseMapper<FileShare, FileShareThinVO> {
}
