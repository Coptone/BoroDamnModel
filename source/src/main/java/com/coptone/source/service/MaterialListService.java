/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service;

import com.coptone.source.request.BaseRequest;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 11 - 12
 * @Description: 选材单服务层
 * @Version: 1.0
 */
public interface MaterialListService {
    public ByteArrayOutputStream generateMaterialList(@RequestBody BaseRequest<Map<String,Object>> request) throws IOException;
}
