/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.controller;

import com.coptone.source.entity.wuyouco.util.ProcessStatistics;
import com.coptone.source.request.BaseRequest;
import com.coptone.source.response.BaseResponse;
import com.coptone.source.service.ProcessStatisticsService;
import com.coptone.source.util.ReportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 05
 * @Description: 周会议纪要控制层
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api")
public class ReportController {
    @Autowired
    private ProcessStatisticsService processStatisticsService;
    @PostMapping("/getFridayReport")
    public BaseResponse<String> generateWeeklyFridayReport(@RequestBody BaseRequest<ReportTemplate> request){
        try {
//            ReportTemplate template = request.getData();
            String reportContent = processStatisticsService.generateWeeklyReport();
            return BaseResponse.success(reportContent);
        }catch (Exception e){
            return BaseResponse.fail(400,e.getMessage());
        }
    }
    @PostMapping("/getDispatcherReport")
    public BaseResponse<String> generateWeeklyMondayReport(@RequestBody BaseRequest<ReportTemplate> request){
        try{
            ReportTemplate template = request.getData();
            String reportContent = processStatisticsService.generateFridayDispatcherReport(template);
            return BaseResponse.success(reportContent);
        }catch (Exception e){
            return new BaseResponse<>(400, BaseResponse.StatusType.FAILED,"请求失败",e.getMessage());
        }
    }
}
