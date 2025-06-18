package com.coptone.source.service.impl;

import com.coptone.source.entity.PlateNumber;
import com.coptone.source.dao.PlateNumberDao;
import com.coptone.source.service.PlateNumberService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import jakarta.annotation.Resource;

/**
 * (PlateNumber)表服务实现类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@Service("plateNumberService")
public class PlateNumberServiceImpl implements PlateNumberService {
    @Resource
    private PlateNumberDao plateNumberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param plateNumberId 主键
     * @return 实例对象
     */
    @Override
    public PlateNumber queryById(Integer plateNumberId) {
        return this.plateNumberDao.queryById(plateNumberId);
    }

    /**
     * 分页查询
     *
     * @param plateNumber 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<PlateNumber> queryByPage(PlateNumber plateNumber, PageRequest pageRequest) {
        long total = this.plateNumberDao.count(plateNumber);
        return new PageImpl<>(this.plateNumberDao.queryAllByLimit(plateNumber, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param plateNumber 实例对象
     * @return 实例对象
     */
    @Override
    public PlateNumber insert(PlateNumber plateNumber) {
        this.plateNumberDao.insert(plateNumber);
        return plateNumber;
    }

    /**
     * 修改数据
     *
     * @param plateNumber 实例对象
     * @return 实例对象
     */
    @Override
    public PlateNumber update(PlateNumber plateNumber) {
        this.plateNumberDao.update(plateNumber);
        return this.queryById(plateNumber.getPlateNumberId());
    }

    /**
     * 通过主键删除数据
     *
     * @param plateNumberId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer plateNumberId) {
        return this.plateNumberDao.deleteById(plateNumberId) > 0;
    }
}
