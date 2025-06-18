package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (Part)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public class Part implements Serializable {
    private static final long serialVersionUID = 976898419433692545L;

    private Integer partId;

    private String partName;


    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

}

