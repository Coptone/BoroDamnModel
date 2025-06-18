package com.coptone.source.service.impl;

import com.coptone.source.entity.Model;
import com.coptone.source.dao.ModelDao;
import com.coptone.source.service.ModelService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Model)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
@Service("modelService")
public class ModelServiceImpl implements ModelService {
    @Resource
    private ModelDao modelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param modelId 主键
     * @return 实例对象
     */
    @Override
    public Model queryById(Integer modelId) {
        return this.modelDao.queryById(modelId);
    }

    /**
     * 分页查询
     *
     * @param model       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Model> queryByPage(Model model, PageRequest pageRequest) {
        long total = this.modelDao.count(model);
        return new PageImpl<>(this.modelDao.queryAllByLimit(model, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param model 实例对象
     * @return 实例对象
     */
    @Override
    public Model insert(Model model) {
        this.modelDao.insert(model);
        return model;
    }

    /**
     * 修改数据
     *
     * @param model 实例对象
     * @return 实例对象
     */
    @Override
    public Model update(Model model) {
        this.modelDao.update(model);
        return this.queryById(model.getModelId());
    }

    /**
     * 通过主键删除数据
     *
     * @param modelId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer modelId) {
        return this.modelDao.deleteById(modelId) > 0;
    }
}
