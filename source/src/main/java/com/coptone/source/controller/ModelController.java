package com.coptone.source.controller;

import com.coptone.source.entity.Model;
import com.coptone.source.service.ModelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Model)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
@RestController
@RequestMapping("model")
public class ModelController {
    /**
     * 服务对象
     */
    @Resource
    private ModelService modelService;

    /**
     * 分页查询
     *
     * @param model       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Model>> queryByPage(Model model, PageRequest pageRequest) {
        return ResponseEntity.ok(this.modelService.queryByPage(model, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Model> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.modelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param model 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Model> add(Model model) {
        return ResponseEntity.ok(this.modelService.insert(model));
    }

    /**
     * 编辑数据
     *
     * @param model 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Model> edit(Model model) {
        return ResponseEntity.ok(this.modelService.update(model));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.modelService.deleteById(id));
    }

}

