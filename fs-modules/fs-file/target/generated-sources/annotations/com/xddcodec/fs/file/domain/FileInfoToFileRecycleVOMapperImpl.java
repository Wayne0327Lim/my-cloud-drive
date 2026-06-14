package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileRecycleVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileInfoToFileRecycleVOMapperImpl implements FileInfoToFileRecycleVOMapper {

    @Override
    public FileRecycleVO convert(FileInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileRecycleVO fileRecycleVO = new FileRecycleVO();

        fileRecycleVO.setId( arg0.getId() );
        fileRecycleVO.setDisplayName( arg0.getDisplayName() );
        fileRecycleVO.setSuffix( arg0.getSuffix() );
        fileRecycleVO.setSize( arg0.getSize() );
        fileRecycleVO.setIsDir( arg0.getIsDir() );
        fileRecycleVO.setDeletedTime( arg0.getDeletedTime() );

        return fileRecycleVO;
    }

    @Override
    public FileRecycleVO convert(FileInfo arg0, FileRecycleVO arg1) {
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
