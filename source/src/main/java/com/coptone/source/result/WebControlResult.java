/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.result;

import lombok.Data;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 08 - 29
 * @Description: 网页操作返回体
 * @Version: 1.0
 */
@Data
public class WebControlResult {
    private String status;
    private String message;
    public WebControlResult(String status, String message){
        this.status = status;
        this.message = message;
    }
}
