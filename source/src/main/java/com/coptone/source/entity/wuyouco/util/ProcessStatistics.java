/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.wuyouco.util;

import lombok.Data;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 05
 * @Description: 静态查询类
 * @Version: 1.0
 */
@Data
public class ProcessStatistics {
    private Integer totalSites;
    private Integer dispatchCount;
    private Integer dispatchOverdueCount;
    private Integer managerAcceptanceCount;
    private Integer managerAcceptanceOverdueCount;
    private Integer deliveryAcceptanceCount;
    private Integer deliveryAcceptanceOverdueCount;
    private Integer workerOrderCount;
    private Integer workerCompletionCount;
    private Integer workerOrderOverdueCount;
    private Integer supplierDeliveryCount;
    private Integer deliveryCompletionCount;
    private Integer supplierOrderOverdueCount;
    private Integer dispatchSiteCount;
}
