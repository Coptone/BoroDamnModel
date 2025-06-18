package com.coptone.source.service.impl;

import com.coptone.source.entity.Country;
import com.coptone.source.dao.CountryDao;
import com.coptone.source.service.CountryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Country)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@Service("countryService")
public class CountryServiceImpl implements CountryService {
    @Resource
    private CountryDao countryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param countryId 主键
     * @return 实例对象
     */
    @Override
    public Country queryById(Integer countryId) {
        return this.countryDao.queryById(countryId);
    }

    /**
     * 分页查询
     *
     * @param country     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Country> queryByPage(Country country, PageRequest pageRequest) {
        long total = this.countryDao.count(country);
        return new PageImpl<>(this.countryDao.queryAllByLimit(country, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    @Override
    public Country insert(Country country) {
        this.countryDao.insert(country);
        return country;
    }

    /**
     * 修改数据
     *
     * @param country 实例对象
     * @return 实例对象
     */
    @Override
    public Country update(Country country) {
        this.countryDao.update(country);
        return this.queryById(country.getCountryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param countryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer countryId) {
        return this.countryDao.deleteById(countryId) > 0;
    }
}
