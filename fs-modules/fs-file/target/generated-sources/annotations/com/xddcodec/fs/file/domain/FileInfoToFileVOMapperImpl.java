package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileInfoToFileVOMapperImpl implements FileInfoToFileVOMapper {

    @Override
    public FileVO convert(FileInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileVO fileVO = new FileVO();

        fileVO.setId( arg0.getId() );
        fileVO.setObjectKey( arg0.getObjectKey() );
        fileVO.setOriginalName( arg0.getOriginalName() );
        fileVO.setDisplayName( arg0.getDisplayName() );
        fileVO.setSuffix( arg0.getSuffix() );
        fileVO.setSize( arg0.getSize() );
        fileVO.setMimeType( arg0.getMimeType() );
        fileVO.setIsDir( arg0.getIsDir() );
        fileVO.setParentId( arg0.getParentId() );
        fileVO.setUserId( arg0.getUserId() );
        fileVO.setUploadTime( arg0.getUploadTime() );
        fileVO.setUpdateTime( arg0.getUpdateTime() );
        fileVO.setLastAccessTime( arg0.getLastAccessTime() );

        return fileVO;
    }

    @Override
    public FileVO convert(FileInfo arg0, FileVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setObjectKey( arg0.getObjectKey() );
        arg1.setOriginalName( arg0.getOriginalName() );
        arg1.setDisplayName( arg0.getDisplayName() );
        arg1.setSuffix( arg0.getSuffix() );
        arg1.setSize( arg0.getSize() );
        arg1.setMimeType( arg0.getMimeType() );
        arg1.setIsDir( arg0.getIsDir() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setUploadTime( arg0.getUploadTime() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setLastAccessTime( arg0.getLastAccessTime() );

        return arg1;
    }
}
