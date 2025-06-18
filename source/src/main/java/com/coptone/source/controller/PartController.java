package com.coptone.source.controller;

import com.coptone.source.entity.Part;
import com.coptone.source.service.PartService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Part)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
@RestController
@RequestMapping("part")
public class PartController {
    /**
     * 服务对象
     */
    @Resource
    private PartService partService;

    /**
     * 分页查询
     *
     * @param part        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Part>> queryByPage(Part part, PageRequest pageRequest) {
        return ResponseEntity.ok(this.partService.queryByPage(part, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Part> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.partService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param part 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Part> add(Part part) {
        return ResponseEntity.ok(this.partService.insert(part));
    }

    /**
     * 编辑数据
     *
     * @param part 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Part> edit(Part part) {
        return ResponseEntity.ok(this.partService.update(part));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.partService.deleteById(id));
    }

}

