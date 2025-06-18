package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (ModelPlate)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public class ModelPlate implements Serializable {
    private static final long serialVersionUID = 335349662373534229L;

    private Integer modelPlateId;

    private Integer plateNumberId;

    private Integer colorId;

    private Integer modelId;

    private Integer materialId;


    public Integer getModelPlateId() {
        return modelPlateId;
    }

    public void setModelPlateId(Integer modelPlateId) {
        this.modelPlateId = modelPlateId;
    }

    public Integer getPlateNumberId() {
        return plateNumberId;
    }

    public void setPlateNumberId(Integer plateNumberId) {
        this.plateNumberId = plateNumberId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

}

