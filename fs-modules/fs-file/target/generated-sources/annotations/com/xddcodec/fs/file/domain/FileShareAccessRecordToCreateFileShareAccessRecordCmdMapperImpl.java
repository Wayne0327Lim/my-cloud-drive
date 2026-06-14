package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.dto.CreateFileShareAccessRecordCmd;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileShareAccessRecordToCreateFileShareAccessRecordCmdMapperImpl implements FileShareAccessRecordToCreateFileShareAccessRecordCmdMapper {

    @Override
    public CreateFileShareAccessRecordCmd convert(FileShareAccessRecord arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CreateFileShareAccessRecordCmd createFileShareAccessRecordCmd = new CreateFileShareAccessRecordCmd();

        createFileShareAccessRecordCmd.setShareId( arg0.getShareId() );
        createFileShareAccessRecordCmd.setAccessIp( arg0.getAccessIp() );
        createFileShareAccessRecordCmd.setAccessAddress( arg0.getAccessAddress() );
        createFileShareAccessRecordCmd.setBrowser( arg0.getBrowser() );
        createFileShareAccessRecordCmd.setOs( arg0.getOs() );

        return createFileShareAccessRecordCmd;
    }

    @Override
    public CreateFileShareAccessRecordCmd convert(FileShareAccessRecord arg0, CreateFileShareAccessRecordCmd arg1) {
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
