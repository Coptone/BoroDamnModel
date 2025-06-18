package com.coptone.source.service.impl;

import com.coptone.source.entity.Component;
import com.coptone.source.dao.ComponentDao;
import com.coptone.source.service.ComponentService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Component)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
@Service("componentService")
public class ComponentServiceImpl implements ComponentService {
    @Resource
    private ComponentDao componentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param componentId 主键
     * @return 实例对象
     */
    @Override
    public Component queryById(Integer componentId) {
        return this.componentDao.queryById(componentId);
    }

    /**
     * 分页查询
     *
     * @param component   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Component> queryByPage(Component component, PageRequest pageRequest) {
        long total = this.componentDao.count(component);
        return new PageImpl<>(this.componentDao.queryAllByLimit(component, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param component 实例对象
     * @return 实例对象
     */
    @Override
    public Component insert(Component component) {
        this.componentDao.insert(component);
        return component;
    }

    /**
     * 修改数据
     *
     * @param component 实例对象
     * @return 实例对象
     */
    @Override
    public Component update(Component component) {
        this.componentDao.update(component);
        return this.queryById(component.getComponentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param componentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer componentId) {
        return this.componentDao.deleteById(componentId) > 0;
    }
}
