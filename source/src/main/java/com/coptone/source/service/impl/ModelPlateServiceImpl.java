package com.coptone.source.service.impl;

import com.coptone.source.entity.ModelPlate;
import com.coptone.source.dao.ModelPlateDao;
import com.coptone.source.service.ModelPlateService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (ModelPlate)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
@Service("modelPlateService")
public class ModelPlateServiceImpl implements ModelPlateService {
    @Resource
    private ModelPlateDao modelPlateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param modelPlateId 主键
     * @return 实例对象
     */
    @Override
    public ModelPlate queryById(Integer modelPlateId) {
        return this.modelPlateDao.queryById(modelPlateId);
    }

    /**
     * 分页查询
     *
     * @param modelPlate  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<ModelPlate> queryByPage(ModelPlate modelPlate, PageRequest pageRequest) {
        long total = this.modelPlateDao.count(modelPlate);
        return new PageImpl<>(this.modelPlateDao.queryAllByLimit(modelPlate, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param modelPlate 实例对象
     * @return 实例对象
     */
    @Override
    public ModelPlate insert(ModelPlate modelPlate) {
        this.modelPlateDao.insert(modelPlate);
        return modelPlate;
    }

    /**
     * 修改数据
     *
     * @param modelPlate 实例对象
     * @return 实例对象
     */
    @Override
    public ModelPlate update(ModelPlate modelPlate) {
        this.modelPlateDao.update(modelPlate);
        return this.queryById(modelPlate.getModelPlateId());
    }

    /**
     * 通过主键删除数据
     *
     * @param modelPlateId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer modelPlateId) {
        return this.modelPlateDao.deleteById(modelPlateId) > 0;
    }
}
