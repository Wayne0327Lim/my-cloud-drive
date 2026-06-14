package com.xddcodec.fs.storage.domain;

import com.xddcodec.fs.storage.domain.vo.StorageSettingUserVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:49+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class StorageSettingToStorageSettingUserVOMapperImpl implements StorageSettingToStorageSettingUserVOMapper {

    @Override
    public StorageSettingUserVO convert(StorageSetting arg0) {
        if ( arg0 == null ) {
            return null;
        }

        StorageSettingUserVO storageSettingUserVO = new StorageSettingUserVO();

        storageSettingUserVO.setId( arg0.getId() );
        storageSettingUserVO.setConfigData( arg0.getConfigData() );
        storageSettingUserVO.setEnabled( arg0.getEnabled() );
        storageSettingUserVO.setWorkspaceId( arg0.getWorkspaceId() );
        storageSettingUserVO.setRemark( arg0.getRemark() );

        return storageSettingUserVO;
    }

    @Override
    public StorageSettingUserVO convert(StorageSetting arg0, StorageSettingUserVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setConfigData( arg0.getConfigData() );
        arg1.setEnabled( arg0.getEnabled() );
        arg1.setWorkspaceId( arg0.getWorkspaceId() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
