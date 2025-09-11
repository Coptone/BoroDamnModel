/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service;


import com.coptone.source.dto.WebControlDTO;
import com.coptone.source.result.WebControlResult;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 08 - 29
 * @Description: playwright网页操作服务接口
 * @Version: 1.0
 */
public interface WebControlService {
     WebControlResult adjustFinance(WebControlDTO dto) throws Exception;
}
