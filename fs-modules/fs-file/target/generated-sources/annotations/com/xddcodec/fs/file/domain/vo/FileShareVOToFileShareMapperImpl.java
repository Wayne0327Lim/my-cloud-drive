package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileShare;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileShareVOToFileShareMapperImpl implements FileShareVOToFileShareMapper {

    @Override
    public FileShare convert(FileShareVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileShare fileShare = new FileShare();

        fileShare.setCreatedAt( arg0.getCreatedAt() );
        fileShare.setId( arg0.getId() );
        fileShare.setShareName( arg0.getShareName() );
        fileShare.setShareCode( arg0.getShareCode() );
        fileShare.setExpireTime( arg0.getExpireTime() );
        fileShare.setScope( arg0.getScope() );
        fileShare.setViewCount( arg0.getViewCount() );
        fileShare.setDownloadCount( arg0.getDownloadCount() );
        fileShare.setMaxViewCount( arg0.getMaxViewCount() );
        fileShare.setMaxDownloadCount( arg0.getMaxDownloadCount() );

        return fileShare;
    }

    @Override
    public FileShare convert(FileShareVO arg0, FileShare arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreatedAt( arg0.getCreatedAt() );
        arg1.setId( arg0.getId() );
        arg1.setShareName( arg0.getShareName() );
        arg1.setShareCode( arg0.getShareCode() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setScope( arg0.getScope() );
        arg1.setViewCount( arg0.getViewCount() );
        arg1.setDownloadCount( arg0.getDownloadCount() );
        arg1.setMaxViewCount( arg0.getMaxViewCount() );
        arg1.setMaxDownloadCount( arg0.getMaxDownloadCount() );

        return arg1;
    }
}
