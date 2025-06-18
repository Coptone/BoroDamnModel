package com.coptone.source.controller;

import com.coptone.source.entity.Country;
import com.coptone.source.service.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Country)表控制层
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
@RestController
@RequestMapping("country")
public class CountryController {
    /**
     * 服务对象
     */
    @Resource
    private CountryService countryService;

    /**
     * 分页查询
     *
     * @param country     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Country>> queryByPage(Country country, PageRequest pageRequest) {
        return ResponseEntity.ok(this.countryService.queryByPage(country, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Country> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.countryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param country 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Country> add(Country country) {
        return ResponseEntity.ok(this.countryService.insert(country));
    }

    /**
     * 编辑数据
     *
     * @param country 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Country> edit(Country country) {
        return ResponseEntity.ok(this.countryService.update(country));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.countryService.deleteById(id));
    }

}

