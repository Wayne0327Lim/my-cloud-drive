package com.xddcodec.fs.storage.domain;

import com.xddcodec.fs.storage.domain.vo.StoragePlatformVO;
import com.xddcodec.fs.storage.domain.vo.StoragePlatformVOToStoragePlatformMapper;
import io.github.linpeilie.AutoMapperConfig__5;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__5.class,
    uses = {StoragePlatformVOToStoragePlatformMapper.class},
    imports = {}
)
public interface StoragePlatformToStoragePlatformVOMapper extends BaseMapper<StoragePlatform, StoragePlatformVO> {
}
