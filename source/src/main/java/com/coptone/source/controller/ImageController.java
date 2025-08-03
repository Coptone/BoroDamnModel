/*
 * Copyright (c) Jacob Zhang BoroDamn copyright message. 2025-2025.All rights reserved~(:3)~
 */

package com.coptone.source.controller;

import com.coptone.source.dto.ImageProcessDTO;
import com.coptone.source.request.BaseRequest;
import com.coptone.source.response.BaseResponse;
import com.coptone.source.result.ImageProcessResult;
import com.coptone.source.service.ImageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.coptone.source.response.BaseResponse.StatusType.*;

@RestController
@RequestMapping("/api")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping("/process")
    public BaseResponse<ImageProcessResult> processImage(@RequestBody @Valid BaseRequest<ImageProcessDTO> baseRequest){
        try {
            if(!"SUCCESS".equals(baseRequest.getStatus())){
                throw new IllegalArgumentException("请求状态异常");
            }
            ImageProcessResult result = imageService.processImage(baseRequest.getData());
            return BaseResponse.success(result);
        }catch (IllegalArgumentException e){
            return BaseResponse.badRequest(e.getMessage());
        }catch (Exception e){
            return BaseResponse.serverError("图片处理失败: "+e.getMessage());
        }
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<String> handleException(Exception exception){
        return new BaseResponse<>(
                500,
                FAILED,
                exception.getMessage(),
                "处理异常，请重试！"
        );
    }
}
