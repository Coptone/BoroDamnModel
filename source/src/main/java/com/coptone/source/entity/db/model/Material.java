/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.model;

import java.io.Serializable;

/**
 * (Material)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public class    Material implements Serializable {
    private static final long serialVersionUID = -91640642897553669L;

    private Integer materialId;

    private String materialName;


    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

}

