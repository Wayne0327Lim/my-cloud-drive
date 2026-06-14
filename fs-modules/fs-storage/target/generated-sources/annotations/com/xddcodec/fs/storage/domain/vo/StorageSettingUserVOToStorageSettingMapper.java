package com.xddcodec.fs.storage.domain.vo;

import com.xddcodec.fs.storage.domain.StoragePlatformToStoragePlatformVOMapper;
import com.xddcodec.fs.storage.domain.StorageSetting;
import com.xddcodec.fs.storage.domain.StorageSettingToStorageSettingUserVOMapper;
import io.github.linpeilie.AutoMapperConfig__5;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__5.class,
    uses = {StoragePlatformVOToStoragePlatformMapper.class,StoragePlatformToStoragePlatformVOMapper.class,StorageSettingToStorageSettingUserVOMapper.class},
    imports = {}
)
public interface StorageSettingUserVOToStorageSettingMapper extends BaseMapper<StorageSettingUserVO, StorageSetting> {
}
