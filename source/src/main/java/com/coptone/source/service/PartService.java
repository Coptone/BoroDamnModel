package com.coptone.source.service;

import com.coptone.source.entity.Part;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Part)表服务接口
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public interface PartService {

    /**
     * 通过ID查询单条数据
     *
     * @param partId 主键
     * @return 实例对象
     */
    Part queryById(Integer partId);

    /**
     * 分页查询
     *
     * @param part        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Part> queryByPage(Part part, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    Part insert(Part part);

    /**
     * 修改数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    Part update(Part part);

    /**
     * 通过主键删除数据
     *
     * @param partId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer partId);

}
