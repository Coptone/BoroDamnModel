/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.controller;

import com.coptone.source.dto.ImageProcessDTO;
import com.coptone.source.entity.db.model.Material;
import com.coptone.source.request.BaseRequest;
import com.coptone.source.service.MaterialListService;
import com.coptone.source.util.ListTemplate;
import jakarta.validation.Valid;
import org.apache.poi.xwpf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 11 - 11
 * @Description: 表单处理控制层
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api")
public class ListController {
    private static final String TEPMLATE_PATH="source/src/main/templates/material_list.docx";
    @Autowired
    private MaterialListService materialListService;
    @PostMapping(value = "/materialList",produces = "application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public ResponseEntity<byte[]> materialList(@RequestBody  BaseRequest<Map<String,Object>> request) throws IOException {
        if(request ==null||request.getData()==null){
            return ResponseEntity.badRequest().body("请求体或data为空".getBytes());
        }
        ByteArrayOutputStream out = materialListService.generateMaterialList(request);

        // ✅ 设置返回头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(
                "application/vnd.openxmlformats-officedocument.wordprocessingml.document"));
        headers.setContentDisposition(ContentDisposition.attachment()
                .filename("filled_material_list.docx")
                .build());

        return new ResponseEntity<>(out.toByteArray(), headers, HttpStatus.OK);
    }

}
