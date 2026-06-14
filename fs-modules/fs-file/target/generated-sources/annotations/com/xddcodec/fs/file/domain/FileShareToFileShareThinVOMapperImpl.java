package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileShareThinVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:07+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileShareToFileShareThinVOMapperImpl implements FileShareToFileShareThinVOMapper {

    @Override
    public FileShareThinVO convert(FileShare arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileShareThinVO fileShareThinVO = new FileShareThinVO();

        fileShareThinVO.setId( arg0.getId() );
        fileShareThinVO.setShareName( arg0.getShareName() );
        fileShareThinVO.setExpireTime( arg0.getExpireTime() );
        fileShareThinVO.setScope( arg0.getScope() );

        return fileShareThinVO;
    }

    @Override
    public FileShareThinVO convert(FileShare arg0, FileShareThinVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setShareName( arg0.getShareName() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setScope( arg0.getScope() );

        return arg1;
    }
}
