/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service.impl;

import com.coptone.source.request.BaseRequest;
import com.coptone.source.service.MaterialListService;
import org.apache.poi.xwpf.usermodel.*;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 11 - 12
 * @Description:
 * @Version: 1.0
 */
@Service
public class MaterialListServiceImpl implements MaterialListService {
    private static final String TEPMLATE_PATH="source/src/main/templates/material_list.docx";
    @Override
    public ByteArrayOutputStream generateMaterialList(BaseRequest<Map<String, Object>> request) throws IOException {
        Map<String,Object> data = request.getData();
        XWPFDocument document;
        try (FileInputStream fis = new FileInputStream(new File(TEPMLATE_PATH))) {
            document = new XWPFDocument(fis);
        }

        // ✅ 先处理文档根级段落（比如项目地址、套餐、面积等）
        for (XWPFParagraph p : document.getParagraphs()) {
            replaceTextInParagraph(p, data);
        }
//        替换占位符
        for(XWPFTable table : document.getTables()){
            for(XWPFTableRow row : table.getRows()){
                for(XWPFTableCell cell : row.getTableCells()){
                    for (XWPFParagraph p : cell.getParagraphs()){
                        replaceTextInParagraph(p,data);
                    }
                }
            }
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        document.write(out);
        document.close();

        return out;
    }
    /**
     * 替换段落中的占位符内容
     */
    private void replaceTextInParagraph(XWPFParagraph paragraph, Map<String, Object> data) {
        for (XWPFRun run : paragraph.getRuns()) {
            String text = run.getText(0);
            if (text == null) continue;

            // 清理不可见空格
            text = text.replace('\u00A0', ' ');

            // 遍历数据替换占位符
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                String key = "${" + entry.getKey() + "}";
                Object val = entry.getValue();
                String replacement = (val == null || val.toString().trim().isEmpty()) ? "          " : val.toString();
                text = text.replace(key, replacement);
            }

            // 清理未匹配的占位符
            text = text.replaceAll("\\$\\{[^}]+\\}", "          ");

            // 直接设置回原 run，保持样式不变
            run.setText(text, 0);
        }
    }


}
