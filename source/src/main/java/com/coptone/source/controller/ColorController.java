package com.coptone.source.controller;

import com.coptone.source.entity.Color;
import com.coptone.source.service.ColorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Color)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@RestController
@RequestMapping("color")
public class ColorController {
    /**
     * 服务对象
     */
    @Resource
    private ColorService colorService;

    /**
     * 分页查询
     *
     * @param color       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Color>> queryByPage(Color color, PageRequest pageRequest) {
        return ResponseEntity.ok(this.colorService.queryByPage(color, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Color> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.colorService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param color 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Color> add(Color color) {
        return ResponseEntity.ok(this.colorService.insert(color));
    }

    /**
     * 编辑数据
     *
     * @param color 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Color> edit(Color color) {
        return ResponseEntity.ok(this.colorService.update(color));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.colorService.deleteById(id));
    }

}

