package com.xddcodec.fs.storage.domain.vo;

import com.xddcodec.fs.storage.domain.StorageSetting;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:49+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class StorageSettingUserVOToStorageSettingMapperImpl implements StorageSettingUserVOToStorageSettingMapper {

    @Override
    public StorageSetting convert(StorageSettingUserVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        StorageSetting storageSetting = new StorageSetting();

        storageSetting.setId( arg0.getId() );
        storageSetting.setConfigData( arg0.getConfigData() );
        storageSetting.setEnabled( arg0.getEnabled() );
        storageSetting.setWorkspaceId( arg0.getWorkspaceId() );
        storageSetting.setRemark( arg0.getRemark() );

        return storageSetting;
    }

    @Override
    public StorageSetting convert(StorageSettingUserVO arg0, StorageSetting arg1) {
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
