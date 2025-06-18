package com.coptone.source.service;

import com.coptone.source.entity.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Country)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public interface CountryService {

    /**
     * 通过ID查询单条数据
     *
     * @param countryId 主键
     * @return 实例对象
     */
    Country queryById(Integer countryId);

    /**
     * 分页查询
     *
     * @param country     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Country> queryByPage(Country country, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    Country insert(Country country);

    /**
     * 修改数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    Country update(Country country);

    /**
     * 通过主键删除数据
     *
     * @param countryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer countryId);

}
