package com.coptone.source.mapper;

import com.coptone.source.entity.wuyouco.util.ProcessStatistics;
import com.coptone.source.entity.db.wuyouco.ProcessDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【process_detail(流程明细表)】的数据库操作Mapper
* @createDate 2025-09-05 13:46:28
* @Entity com.coptone.source.entity.db.wuyouco.ProcessDetail
*/
public interface ProcessDetailMapper extends BaseMapper<ProcessDetail> {
    ProcessStatistics getWeeklyData();
}




