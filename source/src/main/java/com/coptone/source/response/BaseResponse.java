/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 07 - 29
 * @Description: 统一返回体
 * @Version: 1.0
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private StatusType status;
    private String message;
    private T data;
    private String timestamp;

    public BaseResponse(int code, StatusType status, String message, T data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now().toString();
    }
    public enum StatusType{
        SUCCESS,
        FAILED
    }
    // 快速创建成功响应
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(
                200,
                StatusType.SUCCESS,
                "操作成功",
                data
        );
    }

    // 快速创建失败响应
    public static <T> BaseResponse<T> fail(int code, String message) {
        return new BaseResponse<>(
                code,
                StatusType.FAILED,
                message,
                null
        );
    }

    // 参数错误响应
    public static <T> BaseResponse<T> badRequest(String message) {
        return fail(400, message);
    }

    // 服务器错误响应
    public static <T> BaseResponse<T> serverError(String message) {
        return fail(500, message);
    }
}
