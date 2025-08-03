/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.dto;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 07 - 29
 * @Description: 图片请求参数DTO
 * @Version: 1.0
 */
@Data
public class ImageProcessDTO {
    @NotBlank(message = "图片数据不能为空")
    private String imageData;   //Base64编码

    @DecimalMin(value = "0.1",message = "缩放比例不能小于0.1")
    @DecimalMax(value = "10.0",message = "缩放比例不能大于10.0")
    private Double scale;

    @NotNull(message = "操作类型不能为空")
    private OperationType operationType;

    public enum OperationType{
        ENLARGE,SHRINK
    }
}
