/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.model;

import java.io.Serializable;

/**
 * (Model)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
public class Model implements Serializable {
    private static final long serialVersionUID = -59272271055744379L;

    private Integer modelId;

    private String modelName;

    private String modelScale;

    private String modelSpecification;

    private Integer brandId;


    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelScale() {
        return modelScale;
    }

    public void setModelScale(String modelScale) {
        this.modelScale = modelScale;
    }

    public String getModelSpecification() {
        return modelSpecification;
    }

    public void setModelSpecification(String modelSpecification) {
        this.modelSpecification = modelSpecification;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

}

