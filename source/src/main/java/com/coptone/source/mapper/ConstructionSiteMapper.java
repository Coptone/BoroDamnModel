package com.coptone.source.mapper;

import com.coptone.source.entity.db.wuyouco.ConstructionSite;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【construction_site(工地信息表)】的数据库操作Mapper
* @createDate 2025-09-05 13:46:28
* @Entity com.coptone.source.entity.db.wuyouco.ConstructionSite
*/
public interface ConstructionSiteMapper extends BaseMapper<ConstructionSite> {
         int getSiteCount();
}




