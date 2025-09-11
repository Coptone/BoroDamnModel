/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service.impl;

import com.coptone.source.dto.WebControlDTO;
import com.coptone.source.result.WebControlResult;
import com.coptone.source.service.WebControlService;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

/**
 * @Author: Jacob Zhang
 * @CreateTime: 2025 - 08 - 29
 * @Description: 网页操作的实现类
 * @Version: 1.0
 */
@Slf4j
@Service
public class WebControlServiceImpl implements WebControlService {

    @Override
    public WebControlResult adjustFinance(WebControlDTO dto) throws Exception {
        try (Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch();
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            try {
                page.navigate("https://www.baidu.com",new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));
                page.waitForSelector("input#kw",new Page.WaitForSelectorOptions().setTimeout(10000));
                page.fill("input#kw","今日国际局势");
                page.click("input#su");
                page.waitForSelector("div.result-op",new Page.WaitForSelectorOptions().setTimeout(10000));
                // 4. 获取第一个搜索结果的标题
                // 百度搜索结果的选择器可能会变化，这里使用一个通用的选择器
                String firstResultTitle = page.textContent("(//h3[contains(@class, 't')]//a)[1]");

                // 打印结果
                System.out.println("第一个搜索结果的标题: " + firstResultTitle);

                // 返回结果（在实际应用中，您可能想返回这个值）
                // return firstResultTitle;


            } catch (Exception e) {
                page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("debug.png")));
                log.error("Web operation failed", e);
            } finally {
                browser.close();
            }
        }

        return null;
    }
}
