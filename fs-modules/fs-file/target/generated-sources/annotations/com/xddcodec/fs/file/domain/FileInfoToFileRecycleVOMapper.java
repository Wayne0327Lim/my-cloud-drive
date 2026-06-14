package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileDetailVOToFileInfoMapper;
import com.xddcodec.fs.file.domain.vo.FileRecycleVO;
import com.xddcodec.fs.file.domain.vo.FileRecycleVOToFileInfoMapper;
import com.xddcodec.fs.file.domain.vo.FileVOToFileInfoMapper;
import io.github.linpeilie.AutoMapperConfig__7;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__7.class,
    uses = {FileVOToFileInfoMapper.class,FileRecycleVOToFileInfoMapper.class,FileDetailVOToFileInfoMapper.class,FileInfoToFileVOMapper.class,FileInfoToFileDetailVOMapper.class},
    imports = {}
)
public interface FileInfoToFileRecycleVOMapper extends BaseMapper<FileInfo, FileRecycleVO> {
}
