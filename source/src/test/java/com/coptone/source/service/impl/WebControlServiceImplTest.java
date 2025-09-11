/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.service.impl;

import com.coptone.source.dto.WebControlDTO;
import com.coptone.source.service.WebControlService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class WebControlServiceImplTest {
    @Autowired
    private WebControlService webControlService;


    @Test
    void adjustFinance() throws Exception {
        webControlService = new WebControlServiceImpl();
        webControlService.adjustFinance(new WebControlDTO());
    }
}