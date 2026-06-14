package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileDetailVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileInfoToFileDetailVOMapperImpl implements FileInfoToFileDetailVOMapper {

    @Override
    public FileDetailVO convert(FileInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileDetailVO fileDetailVO = new FileDetailVO();

        fileDetailVO.setId( arg0.getId() );
        fileDetailVO.setDisplayName( arg0.getDisplayName() );
        fileDetailVO.setSuffix( arg0.getSuffix() );
        fileDetailVO.setSize( arg0.getSize() );
        fileDetailVO.setIsDir( arg0.getIsDir() );
        fileDetailVO.setUploadTime( arg0.getUploadTime() );
        fileDetailVO.setLastAccessTime( arg0.getLastAccessTime() );

        return fileDetailVO;
    }

    @Override
    public FileDetailVO convert(FileInfo arg0, FileDetailVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setDisplayName( arg0.getDisplayName() );
        arg1.setSuffix( arg0.getSuffix() );
        arg1.setSize( arg0.getSize() );
        arg1.setIsDir( arg0.getIsDir() );
        arg1.setUploadTime( arg0.getUploadTime() );
        arg1.setLastAccessTime( arg0.getLastAccessTime() );

        return arg1;
    }
}
