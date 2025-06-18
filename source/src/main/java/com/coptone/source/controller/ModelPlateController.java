package com.coptone.source.controller;

import com.coptone.source.entity.ModelPlate;
import com.coptone.source.service.ModelPlateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (ModelPlate)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
@RestController
@RequestMapping("modelPlate")
public class ModelPlateController {
    /**
     * 服务对象
     */
    @Resource
    private ModelPlateService modelPlateService;

    /**
     * 分页查询
     *
     * @param modelPlate  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ModelPlate>> queryByPage(ModelPlate modelPlate, PageRequest pageRequest) {
        return ResponseEntity.ok(this.modelPlateService.queryByPage(modelPlate, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ModelPlate> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.modelPlateService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param modelPlate 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ModelPlate> add(ModelPlate modelPlate) {
        return ResponseEntity.ok(this.modelPlateService.insert(modelPlate));
    }

    /**
     * 编辑数据
     *
     * @param modelPlate 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ModelPlate> edit(ModelPlate modelPlate) {
        return ResponseEntity.ok(this.modelPlateService.update(modelPlate));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.modelPlateService.deleteById(id));
    }

}

