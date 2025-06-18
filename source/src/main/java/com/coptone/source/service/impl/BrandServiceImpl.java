package com.coptone.source.service.impl;

import com.coptone.source.entity.Brand;
import com.coptone.source.dao.BrandDao;
import com.coptone.source.service.BrandService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Brand)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Integer brandId) {
        return this.brandDao.queryById(brandId);
    }

    /**
     * 分页查询
     *
     * @param brand       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Brand> queryByPage(Brand brand, PageRequest pageRequest) {
        long total = this.brandDao.count(brand);
        return new PageImpl<>(this.brandDao.queryAllByLimit(brand, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getBrandId());
    }

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer brandId) {
        return this.brandDao.deleteById(brandId) > 0;
    }
}
