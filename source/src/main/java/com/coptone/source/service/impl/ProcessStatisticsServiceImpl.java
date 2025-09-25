/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service.impl;

import com.coptone.source.entity.wuyouco.util.ProcessStatistics;
import com.coptone.source.mapper.ProcessStatisticsMapper;
import com.coptone.source.service.ProcessStatisticsService;
import com.coptone.source.util.ReportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.coptone.source.util.formatCalculator.formatCount;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 05
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProcessStatisticsServiceImpl implements ProcessStatisticsService {
    @Autowired
    private ProcessStatisticsMapper statisticsMapper;
    @Override
    public String generateWeeklyReport() {
        ProcessStatistics statistics = statisticsMapper.selectWeeklyStatistics();
        Integer totalSites = statisticsMapper.selectTotalSites();
        statistics.setTotalSites(totalSites);
        return formatReport(statistics);
    }
    @Override
    public String generateFridayDispatcherReport(ReportTemplate reportTemplate) {
        ProcessStatistics statistics = statisticsMapper.selectFridayDispatcherStatistics(reportTemplate.getUsername());
        return formatFridayDispatcherReport(statistics);
    }

    @Override
    public String formatFridayDispatcherReport(ProcessStatistics processStatistics) {
        List<List<Item>> sections = List.of(
                Arrays.asList(
                        new Item(processStatistics.getDispatchSiteCount(), "共指派工地%s个", "无指派工地"),
                        new Item(processStatistics.getDispatchCount(), "共指派流程%s项", "无指派流程")
                )
        );
        return generateReport(sections);
    }




    @Override
    public String formatReport(ProcessStatistics processStatistics) {

        List<List<Item>> sections = Arrays.asList(
                Arrays.asList(
                        new Item(processStatistics.getDispatchCount(), "计调共指派流程%s条", "计调无指派"),
                        new Item(processStatistics.getDispatchOverdueCount(), "指派延期%s条", "无指派延期")
                ),
                Arrays.asList(
                        new Item(processStatistics.getManagerAcceptanceCount(), "项目经理验收施工%s条", "项目经理无验收施工"),
                        new Item(processStatistics.getManagerAcceptanceOverdueCount(), "验收施工延期%s条", "无施工验收延期"),
                        new Item(processStatistics.getDeliveryAcceptanceCount(), "配送验收%s条", "无配送验收"),
                        new Item(processStatistics.getDeliveryAcceptanceOverdueCount(), "配送验收延期%s条", "无配送验收延期")
                ),
                Arrays.asList(
                        new Item(processStatistics.getWorkerOrderCount(), "工人接单%s条", "无工人接单"),
                        new Item(processStatistics.getWorkerCompletionCount(), "工人完工%s条", "无工人完工"),
                        new Item(processStatistics.getWorkerOrderOverdueCount(), "工人接单延期%s条", "无工人接单延期"),
                        new Item(processStatistics.getSupplierDeliveryCount(), "供应商配送%s条", "无供应商配送"),
                        new Item(processStatistics.getDeliveryCompletionCount(), "配送完成%s条", "无配送完成"),
                        new Item(processStatistics.getSupplierOrderOverdueCount(), "供应商接单延期%s条", "无供应商接单延期")
                )
        );
        return generateReport(sections);
    }
    private String generateReport(List<List<Item>> sections) {
        StringBuilder report = new StringBuilder();
        for (int i=0; i<sections.size(); i++) {
            List<Item> section = sections.get(i);
            String part = section.stream().map(item -> formatCount(item.count, item.hasTemplate,item.zeroTemplate)).collect(Collectors.joining(","));
            report.append(i+1).append("、本周").append(part).append("\n");
        }
        return report.toString();
    }
    // 小工具类
    private static class Item {
        Integer count;
        String hasTemplate;
        String zeroTemplate;

        Item(Integer count, String hasTemplate, String zeroTemplate) {
            this.count = count;
            this.hasTemplate = hasTemplate;
            this.zeroTemplate = zeroTemplate;
        }
    }
}
