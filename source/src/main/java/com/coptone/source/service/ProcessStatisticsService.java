/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service;

import com.coptone.source.entity.util.ProcessStatistics;
import com.coptone.source.mapper.ProcessStatisticsMapper;
import com.coptone.source.util.ReportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 05
 * @Description: 周会议纪要静态类服务层
 * @Version: 1.0
 */
public interface ProcessStatisticsService {
    public String generateWeeklyReport();
    public String formatReport(ProcessStatistics processStatistics);
    public String generateDispatcherReport();
}
