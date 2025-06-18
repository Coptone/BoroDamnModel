package com.coptone.source.controller;

import com.coptone.source.entity.Component;
import com.coptone.source.service.ComponentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Component)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
@RestController
@RequestMapping("component")
public class ComponentController {
    /**
     * 服务对象
     */
    @Resource
    private ComponentService componentService;

    /**
     * 分页查询
     *
     * @param component   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Component>> queryByPage(Component component, PageRequest pageRequest) {
        return ResponseEntity.ok(this.componentService.queryByPage(component, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Component> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.componentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param component 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Component> add(Component component) {
        return ResponseEntity.ok(this.componentService.insert(component));
    }

    /**
     * 编辑数据
     *
     * @param component 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Component> edit(Component component) {
        return ResponseEntity.ok(this.componentService.update(component));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.componentService.deleteById(id));
    }

}

