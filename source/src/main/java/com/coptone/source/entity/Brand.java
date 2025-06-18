package com.coptone.source.entity;

import java.io.Serializable;

/**
 * (Brand)实体类
 *
 * @author Coptone
 * @since 2025-06-18 11:38:54
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = -97206550636126458L;

    private Integer brandId;

    private String chineseName;

    private String englishName;

    private Integer countryId;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}

