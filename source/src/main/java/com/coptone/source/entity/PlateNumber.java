package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (PlateNumber)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public class PlateNumber implements Serializable {
    private static final long serialVersionUID = -99857688915837982L;

    private Integer plateNumberId;

    private String plateNumber;


    public Integer getPlateNumberId() {
        return plateNumberId;
    }

    public void setPlateNumberId(Integer plateNumberId) {
        this.plateNumberId = plateNumberId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}

