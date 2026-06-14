package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileShareAccessRecordVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:07+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileShareAccessRecordToFileShareAccessRecordVOMapperImpl implements FileShareAccessRecordToFileShareAccessRecordVOMapper {

    @Override
    public FileShareAccessRecordVO convert(FileShareAccessRecord arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileShareAccessRecordVO fileShareAccessRecordVO = new FileShareAccessRecordVO();

        fileShareAccessRecordVO.setId( arg0.getId() );
        fileShareAccessRecordVO.setShareId( arg0.getShareId() );
        fileShareAccessRecordVO.setAccessIp( arg0.getAccessIp() );
        fileShareAccessRecordVO.setAccessAddress( arg0.getAccessAddress() );
        fileShareAccessRecordVO.setBrowser( arg0.getBrowser() );
        fileShareAccessRecordVO.setOs( arg0.getOs() );
        fileShareAccessRecordVO.setAccessTime( arg0.getAccessTime() );

        return fileShareAccessRecordVO;
    }

    @Override
    public FileShareAccessRecordVO convert(FileShareAccessRecord arg0, FileShareAccessRecordVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setShareId( arg0.getShareId() );
        arg1.setAccessIp( arg0.getAccessIp() );
        arg1.setAccessAddress( arg0.getAccessAddress() );
        arg1.setBrowser( arg0.getBrowser() );
        arg1.setOs( arg0.getOs() );
        arg1.setAccessTime( arg0.getAccessTime() );

        return arg1;
    }
}
