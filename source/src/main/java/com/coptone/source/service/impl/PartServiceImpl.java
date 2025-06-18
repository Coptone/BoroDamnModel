package com.coptone.source.service.impl;

import com.coptone.source.entity.Part;
import com.coptone.source.dao.PartDao;
import com.coptone.source.service.PartService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (Part)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@Service("partService")
public class PartServiceImpl implements PartService {
    @Resource
    private PartDao partDao;

    /**
     * 通过ID查询单条数据
     *
     * @param partId 主键
     * @return 实例对象
     */
    @Override
    public Part queryById(Integer partId) {
        return this.partDao.queryById(partId);
    }

    /**
     * 分页查询
     *
     * @param part        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Part> queryByPage(Part part, PageRequest pageRequest) {
        long total = this.partDao.count(part);
        return new PageImpl<>(this.partDao.queryAllByLimit(part, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    @Override
    public Part insert(Part part) {
        this.partDao.insert(part);
        return part;
    }

    /**
     * 修改数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    @Override
    public Part update(Part part) {
        this.partDao.update(part);
        return this.queryById(part.getPartId());
    }

    /**
     * 通过主键删除数据
     *
     * @param partId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer partId) {
        return this.partDao.deleteById(partId) > 0;
    }
}
