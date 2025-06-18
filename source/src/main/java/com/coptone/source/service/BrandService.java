package com.coptone.source.service;

import com.coptone.source.entity.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Brand)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
public interface BrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Integer brandId);

    /**
     * 分页查询
     *
     * @param brand       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Brand> queryByPage(Brand brand, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer brandId);

}
