package com.coptone.source.service;

import com.coptone.source.entity.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Color)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public interface ColorService {

    /**
     * 通过ID查询单条数据
     *
     * @param colorId 主键
     * @return 实例对象
     */
    Color queryById(Integer colorId);

    /**
     * 分页查询
     *
     * @param color       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Color> queryByPage(Color color, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color insert(Color color);

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color update(Color color);

    /**
     * 通过主键删除数据
     *
     * @param colorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer colorId);

}
