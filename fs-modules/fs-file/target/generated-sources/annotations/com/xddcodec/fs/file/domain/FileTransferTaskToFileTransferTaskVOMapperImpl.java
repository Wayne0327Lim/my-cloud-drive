package com.xddcodec.fs.file.domain;

import com.xddcodec.fs.file.domain.vo.FileTransferTaskVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-14T17:29:06+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FileTransferTaskToFileTransferTaskVOMapperImpl implements FileTransferTaskToFileTransferTaskVOMapper {

    @Override
    public FileTransferTaskVO convert(FileTransferTask arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FileTransferTaskVO fileTransferTaskVO = new FileTransferTaskVO();

        fileTransferTaskVO.setTaskId( arg0.getTaskId() );
        fileTransferTaskVO.setTaskType( arg0.getTaskType() );
        fileTransferTaskVO.setUserId( arg0.getUserId() );
        fileTransferTaskVO.setParentId( arg0.getParentId() );
        fileTransferTaskVO.setObjectKey( arg0.getObjectKey() );
        fileTransferTaskVO.setFileName( arg0.getFileName() );
        fileTransferTaskVO.setFileSize( arg0.getFileSize() );
        fileTransferTaskVO.setSuffix( arg0.getSuffix() );
        fileTransferTaskVO.setTotalChunks( arg0.getTotalChunks() );
        fileTransferTaskVO.setUploadedChunks( arg0.getUploadedChunks() );
        fileTransferTaskVO.setChunkSize( arg0.getChunkSize() );
        fileTransferTaskVO.setStoragePlatformSettingId( arg0.getStoragePlatformSettingId() );
        fileTransferTaskVO.setStatus( arg0.getStatus() );
        fileTransferTaskVO.setErrorMsg( arg0.getErrorMsg() );
        fileTransferTaskVO.setStartTime( arg0.getStartTime() );
        fileTransferTaskVO.setCompleteTime( arg0.getCompleteTime() );

        return fileTransferTaskVO;
    }

    @Override
    public FileTransferTaskVO convert(FileTransferTask arg0, FileTransferTaskVO arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setTaskId( arg0.getTaskId() );
        arg1.setTaskType( arg0.getTaskType() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setObjectKey( arg0.getObjectKey() );
        arg1.setFileName( arg0.getFileName() );
        arg1.setFileSize( arg0.getFileSize() );
        arg1.setSuffix( arg0.getSuffix() );
        arg1.setTotalChunks( arg0.getTotalChunks() );
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
