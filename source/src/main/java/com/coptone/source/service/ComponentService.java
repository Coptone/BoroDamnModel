package com.coptone.source.service;

import com.coptone.source.entity.Component;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Component)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public interface ComponentService {

    /**
     * 通过ID查询单条数据
     *
     * @param componentId 主键
     * @return 实例对象
     */
    Component queryById(Integer componentId);

    /**
     * 分页查询
     *
     * @param component   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Component> queryByPage(Component component, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param component 实例对象
     * @return 实例对象
     */
    Component insert(Component component);

    /**
     * 修改数据
     *
     * @param component 实例对象
     * @return 实例对象
     */
    Component update(Component component);

    /**
     * 通过主键删除数据
     *
     * @param componentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer componentId);

}
