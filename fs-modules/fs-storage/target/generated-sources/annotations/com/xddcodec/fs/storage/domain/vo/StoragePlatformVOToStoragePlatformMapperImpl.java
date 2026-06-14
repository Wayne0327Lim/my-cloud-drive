package com.xddcodec.fs.storage.domain.vo;

import com.xddcodec.fs.storage.domain.StoragePlatform;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:49+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class StoragePlatformVOToStoragePlatformMapperImpl implements StoragePlatformVOToStoragePlatformMapper {

    @Override
    public StoragePlatform convert(StoragePlatformVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        StoragePlatform storagePlatform = new StoragePlatform();

        storagePlatform.setId( arg0.getId() );
        storagePlatform.setName( arg0.getName() );
        storagePlatform.setIdentifier( arg0.getIdentifier() );
        storagePlatform.setConfigScheme( arg0.getConfigScheme() );
        storagePlatform.setIcon( arg0.getIcon() );
        storagePlatform.setLink( arg0.getLink() );
        storagePlatform.setIsDefault( arg0.getIsDefault() );
        storagePlatform.setDesc( arg0.getDesc() );

        return storagePlatform;
    }

    @Override
    public StoragePlatform convert(StoragePlatformVO arg0, StoragePlatform arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setIdentifier( arg0.getIdentifier() );
        arg1.setConfigScheme( arg0.getConfigScheme() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setLink( arg0.getLink() );
        arg1.setIsDefault( arg0.getIsDefault() );
        arg1.setDesc( arg0.getDesc() );

        return arg1;
    }
}
