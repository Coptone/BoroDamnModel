package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (Component)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:52
 */
public class Component implements Serializable {
    private static final long serialVersionUID = -53963679742240398L;

    private Integer componentId;

    private Integer componentNumber;

    private Integer plateId;

    private Integer colorId;

    private Integer partId;


    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public Integer getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(Integer componentNumber) {
        this.componentNumber = componentNumber;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

}

