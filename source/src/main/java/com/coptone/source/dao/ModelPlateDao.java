package com.coptone.source.dao;

import com.coptone.source.entity.ModelPlate;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (ModelPlate)表数据库访问层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public interface ModelPlateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param modelPlateId 主键
     * @return 实例对象
     */
    ModelPlate queryById(Integer modelPlateId);

    /**
     * 查询指定行数据
     *
     * @param modelPlate 查询条件
     * @param pageable   分页对象
     * @return 对象列表
     */
    List<ModelPlate> queryAllByLimit(ModelPlate modelPlate, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param modelPlate 查询条件
     * @return 总行数
     */
    long count(ModelPlate modelPlate);

    /**
     * 新增数据
     *
     * @param modelPlate 实例对象
     * @return 影响行数
     */
    int insert(ModelPlate modelPlate);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ModelPlate> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ModelPlate> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ModelPlate> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ModelPlate> entities);

    /**
     * 修改数据
     *
     * @param modelPlate 实例对象
     * @return 影响行数
     */
    int update(ModelPlate modelPlate);

    /**
     * 通过主键删除数据
     *
     * @param modelPlateId 主键
     * @return 影响行数
     */
    int deleteById(Integer modelPlateId);

}

