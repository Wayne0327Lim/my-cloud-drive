package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileDetailVO;
import com.xddcodec.fs.file.domain.vo.FileDetailVOToFileInfoMapper;
import com.xddcodec.fs.file.domain.vo.FileRecycleVOToFileInfoMapper;
import com.xddcodec.fs.file.domain.vo.FileVOToFileInfoMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileVOToFileInfoMapper.class,FileRecycleVOToFileInfoMapper.class,FileDetailVOToFileInfoMapper.class,FileInfoToFileVOMapper.class,FileInfoToFileRecycleVOMapper.class},
    imports = {}
)
public interface FileInfoToFileDetailVOMapper extends BaseMapper<FileInfo, FileDetailVO> {
}
