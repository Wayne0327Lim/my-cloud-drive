package com.xddcodec.fs.file.domain.dto;

import com.xddcodec.fs.file.domain.FileShareAccessRecord;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class CreateFileShareAccessRecordCmdToFileShareAccessRecordMapperImpl implements CreateFileShareAccessRecordCmdToFileShareAccessRecordMapper {

    @Override
    public FileShareAccessRecord convert(CreateFileShareAccessRecordCmd arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileShareAccessRecord fileShareAccessRecord = new FileShareAccessRecord();

        fileShareAccessRecord.setShareId( arg0.getShareId() );
        fileShareAccessRecord.setAccessIp( arg0.getAccessIp() );
        fileShareAccessRecord.setAccessAddress( arg0.getAccessAddress() );
        fileShareAccessRecord.setBrowser( arg0.getBrowser() );
        fileShareAccessRecord.setOs( arg0.getOs() );

        return fileShareAccessRecord;
    }

    @Override
    public FileShareAccessRecord convert(CreateFileShareAccessRecordCmd arg0, FileShareAccessRecord arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setShareId( arg0.getShareId() );
        arg1.setAccessIp( arg0.getAccessIp() );
        arg1.setAccessAddress( arg0.getAccessAddress() );
        arg1.setBrowser( arg0.getBrowser() );
        arg1.setOs( arg0.getOs() );

        return arg1;
    }
}
