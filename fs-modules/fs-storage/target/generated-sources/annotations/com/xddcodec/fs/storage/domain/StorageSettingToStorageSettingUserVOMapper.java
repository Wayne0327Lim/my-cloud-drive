package com.xddcodec.fs.storage.domain;

import com.xddcodec.fs.storage.domain.vo.StoragePlatformVOToStoragePlatformMapper;
import com.xddcodec.fs.storage.domain.vo.StorageSettingUserVO;
import com.xddcodec.fs.storage.domain.vo.StorageSettingUserVOToStorageSettingMapper;
import io.github.linpeilie.AutoMapperConfig__5;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__5.class,
    uses = {StoragePlatformVOToStoragePlatformMapper.class,StoragePlatformToStoragePlatformVOMapper.class,StorageSettingUserVOToStorageSettingMapper.class},
    imports = {}
)
public interface StorageSettingToStorageSettingUserVOMapper extends BaseMapper<StorageSetting, StorageSettingUserVO> {
}
