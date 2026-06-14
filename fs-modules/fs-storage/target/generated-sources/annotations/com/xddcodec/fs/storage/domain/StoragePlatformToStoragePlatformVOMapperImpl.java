package com.xddcodec.fs.storage.domain;

import com.xddcodec.fs.storage.domain.vo.StoragePlatformVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:28:49+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class StoragePlatformToStoragePlatformVOMapperImpl implements StoragePlatformToStoragePlatformVOMapper {

    @Override
    public StoragePlatformVO convert(StoragePlatform arg0) {
        if ( arg0 == null ) {
            return null;
        }

        StoragePlatformVO storagePlatformVO = new StoragePlatformVO();

        storagePlatformVO.setId( arg0.getId() );
        storagePlatformVO.setName( arg0.getName() );
        storagePlatformVO.setIdentifier( arg0.getIdentifier() );
        storagePlatformVO.setConfigScheme( arg0.getConfigScheme() );
        storagePlatformVO.setIcon( arg0.getIcon() );
        storagePlatformVO.setLink( arg0.getLink() );
        storagePlatformVO.setDesc( arg0.getDesc() );
        storagePlatformVO.setIsDefault( arg0.getIsDefault() );

        return storagePlatformVO;
    }

    @Override
    public StoragePlatformVO convert(StoragePlatform arg0, StoragePlatformVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setIdentifier( arg0.getIdentifier() );
        arg1.setConfigScheme( arg0.getConfigScheme() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setLink( arg0.getLink() );
        arg1.setDesc( arg0.getDesc() );
        arg1.setIsDefault( arg0.getIsDefault() );

        return arg1;
    }
}
