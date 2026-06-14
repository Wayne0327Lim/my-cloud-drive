package com.xddcodec.fs.storage.domain.vo;

import com.xddcodec.fs.storage.domain.StoragePlatform;
import com.xddcodec.fs.storage.domain.StoragePlatformToStoragePlatformVOMapper;
import io.github.linpeilie.AutoMapperConfig__5;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__5.class,
    uses = {StoragePlatformToStoragePlatformVOMapper.class},
    imports = {}
)
public interface StoragePlatformVOToStoragePlatformMapper extends BaseMapper<StoragePlatformVO, StoragePlatform> {
}
