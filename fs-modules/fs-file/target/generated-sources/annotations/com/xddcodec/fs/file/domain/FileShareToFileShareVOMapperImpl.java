package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileShareVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileShareToFileShareVOMapperImpl implements FileShareToFileShareVOMapper {

    @Override
    public FileShareVO convert(FileShare arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileShareVO fileShareVO = new FileShareVO();

        fileShareVO.setId( arg0.getId() );
        fileShareVO.setShareName( arg0.getShareName() );
        fileShareVO.setShareCode( arg0.getShareCode() );
        fileShareVO.setExpireTime( arg0.getExpireTime() );
        fileShareVO.setScope( arg0.getScope() );
        fileShareVO.setViewCount( arg0.getViewCount() );
        fileShareVO.setDownloadCount( arg0.getDownloadCount() );
        fileShareVO.setMaxViewCount( arg0.getMaxViewCount() );
        fileShareVO.setMaxDownloadCount( arg0.getMaxDownloadCount() );
        fileShareVO.setCreatedAt( arg0.getCreatedAt() );

        return fileShareVO;
    }

    @Override
    public FileShareVO convert(FileShare arg0, FileShareVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setShareName( arg0.getShareName() );
        arg1.setShareCode( arg0.getShareCode() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setScope( arg0.getScope() );
        arg1.setViewCount( arg0.getViewCount() );
        arg1.setDownloadCount( arg0.getDownloadCount() );
        arg1.setMaxViewCount( arg0.getMaxViewCount() );
        arg1.setMaxDownloadCount( arg0.getMaxDownloadCount() );
        arg1.setCreatedAt( arg0.getCreatedAt() );

        return arg1;
    }
}
