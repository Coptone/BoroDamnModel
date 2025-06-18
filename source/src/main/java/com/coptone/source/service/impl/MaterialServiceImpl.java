package com.coptone.source.service.impl;

import com.coptone.source.entity.Material;
import com.coptone.source.dao.MaterialDao;
import com.coptone.source.service.MaterialService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Material)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@Service("materialService")
public class MaterialServiceImpl implements MaterialService {
    @Resource
    private MaterialDao materialDao;

    /**
     * 通过ID查询单条数据
     *
     * @param materialId 主键
     * @return 实例对象
     */
    @Override
    public Material queryById(Integer materialId) {
        return this.materialDao.queryById(materialId);
    }

    /**
     * 分页查询
     *
     * @param material    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Material> queryByPage(Material material, PageRequest pageRequest) {
        long total = this.materialDao.count(material);
        return new PageImpl<>(this.materialDao.queryAllByLimit(material, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    @Override
    public Material insert(Material material) {
        this.materialDao.insert(material);
        return material;
    }

    /**
     * 修改数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    @Override
    public Material update(Material material) {
        this.materialDao.update(material);
        return this.queryById(material.getMaterialId());
    }

    /**
     * 通过主键删除数据
     *
     * @param materialId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer materialId) {
        return this.materialDao.deleteById(materialId) > 0;
    }
}
