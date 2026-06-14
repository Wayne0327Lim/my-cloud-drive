package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileRecycleVOToFileInfoMapperImpl implements FileRecycleVOToFileInfoMapper {

    @Override
    public FileInfo convert(FileRecycleVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileInfo fileInfo = new FileInfo();

        fileInfo.setId( arg0.getId() );
        fileInfo.setDisplayName( arg0.getDisplayName() );
        fileInfo.setSuffix( arg0.getSuffix() );
        fileInfo.setSize( arg0.getSize() );
        fileInfo.setIsDir( arg0.getIsDir() );
        fileInfo.setDeletedTime( arg0.getDeletedTime() );

        return fileInfo;
    }

    @Override
    public FileInfo convert(FileRecycleVO arg0, FileInfo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setDisplayName( arg0.getDisplayName() );
        arg1.setSuffix( arg0.getSuffix() );
        arg1.setSize( arg0.getSize() );
        arg1.setIsDir( arg0.getIsDir() );
        arg1.setDeletedTime( arg0.getDeletedTime() );

        return arg1;
    }
}
