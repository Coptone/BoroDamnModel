package com.coptone.source.service;

import com.coptone.source.entity.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Model)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
public interface ModelService {

    /**
     * 通过ID查询单条数据
     *
     * @param modelId 主键
     * @return 实例对象
     */
    Model queryById(Integer modelId);

    /**
     * 分页查询
     *
     * @param model       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Model> queryByPage(Model model, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param model 实例对象
     * @return 实例对象
     */
    Model insert(Model model);

    /**
     * 修改数据
     *
     * @param model 实例对象
     * @return 实例对象
     */
    Model update(Model model);

    /**
     * 通过主键删除数据
     *
     * @param modelId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer modelId);

}
