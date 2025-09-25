/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.util;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 09 - 06
 * @Description: 格式化检验工具类
 * @Version: 1.0
 */
public class formatCalculator {
    public static String formatCount(Integer count, String template, String defaultMsg) {
        if (count != null && count != 0) {
            return String.format(template, count);
        }
        return defaultMsg;
    }
}
