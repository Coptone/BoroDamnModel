package com.coptone.source.service;

import com.coptone.source.entity.Material;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Material)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public interface MaterialService {

    /**
     * 通过ID查询单条数据
     *
     * @param materialId 主键
     * @return 实例对象
     */
    Material queryById(Integer materialId);

    /**
     * 分页查询
     *
     * @param material    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Material> queryByPage(Material material, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    Material insert(Material material);

    /**
     * 修改数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    Material update(Material material);

    /**
     * 通过主键删除数据
     *
     * @param materialId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer materialId);

}
