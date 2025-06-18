package com.coptone.source.dao;

import com.coptone.source.entity.Color;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Color)表数据库访问层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public interface ColorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param colorId 主键
     * @return 实例对象
     */
    Color queryById(Integer colorId);

    /**
     * 查询指定行数据
     *
     * @param color    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Color> queryAllByLimit(Color color, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param color 查询条件
     * @return 总行数
     */
    long count(Color color);

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 影响行数
     */
    int insert(Color color);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Color> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Color> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Color> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Color> entities);

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 影响行数
     */
    int update(Color color);

    /**
     * 通过主键删除数据
     *
     * @param colorId 主键
     * @return 影响行数
     */
    int deleteById(Integer colorId);

}

