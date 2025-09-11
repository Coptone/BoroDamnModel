/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coptone.source.entity.util.ProcessStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 05
 * @Description: 静态类映射
 * @Version: 1.0
 */
@Mapper
public interface ProcessStatisticsMapper extends BaseMapper<Object> {
    /**
     * 获取周统计信息
     */
    ProcessStatistics selectWeeklyStatistics();

    /**
     * 获取总工地数
     */
    Integer selectTotalSites();
}
