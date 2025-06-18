package com.coptone.source.service.impl;

import com.coptone.source.entity.Color;
import com.coptone.source.dao.ColorDao;
import com.coptone.source.service.ColorService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Color)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@Service("colorService")
public class ColorServiceImpl implements ColorService {
    @Resource
    private ColorDao colorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param colorId 主键
     * @return 实例对象
     */
    @Override
    public Color queryById(Integer colorId) {
        return this.colorDao.queryById(colorId);
    }

    /**
     * 分页查询
     *
     * @param color       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Color> queryByPage(Color color, PageRequest pageRequest) {
        long total = this.colorDao.count(color);
        return new PageImpl<>(this.colorDao.queryAllByLimit(color, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color insert(Color color) {
        this.colorDao.insert(color);
        return color;
    }

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color update(Color color) {
        this.colorDao.update(color);
        return this.queryById(color.getColorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param colorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer colorId) {
        return this.colorDao.deleteById(colorId) > 0;
    }
}
