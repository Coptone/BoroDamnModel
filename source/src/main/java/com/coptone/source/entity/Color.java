package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (Color)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public class Color implements Serializable {
    private static final long serialVersionUID = -30157390127231836L;

    private Integer colorId;

    private String colorName;

    private Integer isPrePainted;


    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Integer getIsPrePainted() {
        return isPrePainted;
    }

    public void setIsPrePainted(Integer isPrePainted) {
        this.isPrePainted = isPrePainted;
    }

}

