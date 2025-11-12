/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 07 - 29
 * @Description: 基础请求体
 * @Version: 1.0
 */
@Getter
@Setter
public class BaseRequest<T> {
    private OperationType status;
    private String message;
    private T data;
    private String timestamp;

    public BaseRequest(OperationType status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now().toString();
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
    public enum OperationType{
        IMAGE,REPORT,LIST
    }
}
