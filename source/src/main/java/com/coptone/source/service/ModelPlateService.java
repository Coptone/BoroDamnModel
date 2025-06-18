package com.coptone.source.service;

import com.coptone.source.entity.ModelPlate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ModelPlate)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public interface ModelPlateService {

    /**
     * 通过ID查询单条数据
     *
     * @param modelPlateId 主键
     * @return 实例对象
     */
    ModelPlate queryById(Integer modelPlateId);

    /**
     * 分页查询
     *
     * @param modelPlate  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<ModelPlate> queryByPage(ModelPlate modelPlate, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param modelPlate 实例对象
     * @return 实例对象
     */
    ModelPlate insert(ModelPlate modelPlate);

    /**
     * 修改数据
     *
     * @param modelPlate 实例对象
     * @return 实例对象
     */
    ModelPlate update(ModelPlate modelPlate);

    /**
     * 通过主键删除数据
     *
     * @param modelPlateId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer modelPlateId);

}
