package com.coptone.source.dao;

import com.coptone.source.entity.Component;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Component)表数据库访问层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public interface ComponentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param componentId 主键
     * @return 实例对象
     */
    Component queryById(Integer componentId);

    /**
     * 查询指定行数据
     *
     * @param component 查询条件
     * @param pageable  分页对象
     * @return 对象列表
     */
    List<Component> queryAllByLimit(Component component, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param component 查询条件
     * @return 总行数
     */
    long count(Component component);

    /**
     * 新增数据
     *
     * @param component 实例对象
     * @return 影响行数
     */
    int insert(Component component);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Component> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Component> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Component> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Component> entities);

    /**
     * 修改数据
     *
     * @param component 实例对象
     * @return 影响行数
     */
    int update(Component component);

    /**
     * 通过主键删除数据
     *
     * @param componentId 主键
     * @return 影响行数
     */
    int deleteById(Integer componentId);

}

