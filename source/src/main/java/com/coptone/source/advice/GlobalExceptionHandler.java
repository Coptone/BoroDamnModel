/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.advice;

import com.coptone.source.response.BaseResponse;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 06
 * @Description: 全局反序列化异常处理类
 * @Version: 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<?> handleInvalidFormatException(InvalidFormatException ex) {
        String filedName = ex.getPath().get(0).getFieldName();
        String errorMsg = String.format("请求参数[%s]不合法，请使用正确的枚举值！",filedName);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new BaseResponse<>(400, BaseResponse.StatusType.FAILED,errorMsg,null)) ;

    }
}
