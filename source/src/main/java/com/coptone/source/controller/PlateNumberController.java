package com.coptone.source.controller;

import com.coptone.source.entity.PlateNumber;
import com.coptone.source.service.PlateNumberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (PlateNumber)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@RestController
@RequestMapping("plateNumber")
public class PlateNumberController {
    /**
     * 服务对象
     */
    @Resource
    private PlateNumberService plateNumberService;

    /**
     * 分页查询
     *
     * @param plateNumber 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PlateNumber>> queryByPage(PlateNumber plateNumber, PageRequest pageRequest) {
        return ResponseEntity.ok(this.plateNumberService.queryByPage(plateNumber, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PlateNumber> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.plateNumberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param plateNumber 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PlateNumber> add(PlateNumber plateNumber) {
        return ResponseEntity.ok(this.plateNumberService.insert(plateNumber));
    }

    /**
     * 编辑数据
     *
     * @param plateNumber 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PlateNumber> edit(PlateNumber plateNumber) {
        return ResponseEntity.ok(this.plateNumberService.update(plateNumber));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.plateNumberService.deleteById(id));
    }

}

