/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.result;

import lombok.Data;

/**
 * @Author: Jacob Zhangd
 * @CreateTime: 2025 - 07 - 29
 * @Description: 图片处理结果类
 * @Version: 1.0
 */
@Data
public class ImageProcessResult {
    private String processedImage;
    private int originalWidth;
    private int originalHeight;
    private int processedWidth;
    private int processedHeight;
    private String imageFormat;

    public ImageProcessResult(String processedImage, int originalWidth, int originalHeight, int processedWidth, int processedHeight, String imageFormat) {
        this.processedImage = processedImage;
        this.originalWidth = originalWidth;
        this.originalHeight = originalHeight;
        this.processedWidth = processedWidth;
        this.processedHeight = processedHeight;
        this.imageFormat = imageFormat;
    }
}
