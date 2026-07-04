package com.xddcodec.fs.file.service;

import com.mybatisflex.core.service.IService;
import com.xddcodec.fs.file.domain.FileAiSummary;
import com.xddcodec.fs.file.domain.vo.FileAiSummaryVO;

public interface FileAiSummaryService extends IService<FileAiSummary> {

    FileAiSummaryVO getSummary(String fileId);

    FileAiSummaryVO regenerateSummary(String fileId);
}
