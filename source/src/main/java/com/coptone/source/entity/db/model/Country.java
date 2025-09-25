/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.model;

import java.io.Serializable;

/**
 * (Country)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:53
 */
public class Country implements Serializable {
    private static final long serialVersionUID = -45979921064858937L;

    private Integer countryId;

    private String countryName;
    /**
     * ISO 3166-1 alpha-3 国家代码
     */
    private String countryCode;


    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}

