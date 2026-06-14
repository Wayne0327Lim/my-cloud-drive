package com.xddcodec.fs.file.domain.vo;

import com.xddcodec.fs.file.domain.FileTransferTask;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileTransferTaskVOToFileTransferTaskMapperImpl implements FileTransferTaskVOToFileTransferTaskMapper {

    @Override
    public FileTransferTask convert(FileTransferTaskVO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileTransferTask fileTransferTask = new FileTransferTask();

        fileTransferTask.setTaskId( arg0.getTaskId() );
        fileTransferTask.setUserId( arg0.getUserId() );
        fileTransferTask.setParentId( arg0.getParentId() );
        fileTransferTask.setObjectKey( arg0.getObjectKey() );
        fileTransferTask.setFileName( arg0.getFileName() );
        fileTransferTask.setFileSize( arg0.getFileSize() );
        fileTransferTask.setSuffix( arg0.getSuffix() );
        fileTransferTask.setTotalChunks( arg0.getTotalChunks() );
        fileTransferTask.setTaskType( arg0.getTaskType() );
        fileTransferTask.setUploadedChunks( arg0.getUploadedChunks() );
        fileTransferTask.setChunkSize( arg0.getChunkSize() );
        fileTransferTask.setStoragePlatformSettingId( arg0.getStoragePlatformSettingId() );
        fileTransferTask.setStatus( arg0.getStatus() );
        fileTransferTask.setErrorMsg( arg0.getErrorMsg() );
        fileTransferTask.setStartTime( arg0.getStartTime() );
        fileTransferTask.setCompleteTime( arg0.getCompleteTime() );

        return fileTransferTask;
    }

    @Override
    public FileTransferTask convert(FileTransferTaskVO arg0, FileTransferTask arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setTaskId( arg0.getTaskId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setObjectKey( arg0.getObjectKey() );
        arg1.setFileName( arg0.getFileName() );
        arg1.setFileSize( arg0.getFileSize() );
        arg1.setSuffix( arg0.getSuffix() );
        arg1.setTotalChunks( arg0.getTotalChunks() );
        arg1.setTaskType( arg0.getTaskType() );
        arg1.setUploadedChunks( arg0.getUploadedChunks() );
        arg1.setChunkSize( arg0.getChunkSize() );
        arg1.setStoragePlatformSettingId( arg0.getStoragePlatformSettingId() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setErrorMsg( arg0.getErrorMsg() );
        arg1.setStartTime( arg0.getStartTime() );
        arg1.setCompleteTime( arg0.getCompleteTime() );

        return arg1;
    }
}
