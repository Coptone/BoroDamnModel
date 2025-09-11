/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.dto;

import com.coptone.source.util.OperationType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 08 - 29
 * @Description: 网页操作请求参数dto
 * @Version: 1.0
 */
@Data
public class WebControlDTO {
    @NotBlank(message = "操作枚举不能为空")
    private OperationType.WebOperaionType operationType;
}
