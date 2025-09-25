/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName supplier_agency
 */
@TableName(value ="supplier_agency")
@Data
public class SupplierAgency {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer saId;

    /**
     * 
     */
    private String siteCode;

    /**
     * 
     */
    private String siteName;

    /**
     * 
     */
    private String siteD;

    /**
     * 
     */
    private String siteF;

    /**
     * 
     */
    private String sgx;

    /**
     * 
     */
    private String shPch;

    /**
     * 
     */
    private String sType;

    /**
     * 
     */
    private String skStatus;

    /**
     * 
     */
    private String payPrice;

    /**
     * 
     */
    private String factPrice;

    /**
     * 
     */
    private String kkPrice;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String payTime;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String concatName;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SupplierAgency other = (SupplierAgency) that;
        return (this.getSaId() == null ? other.getSaId() == null : this.getSaId().equals(other.getSaId()))
            && (this.getSiteCode() == null ? other.getSiteCode() == null : this.getSiteCode().equals(other.getSiteCode()))
            && (this.getSiteName() == null ? other.getSiteName() == null : this.getSiteName().equals(other.getSiteName()))
            && (this.getSiteD() == null ? other.getSiteD() == null : this.getSiteD().equals(other.getSiteD()))
            && (this.getSiteF() == null ? other.getSiteF() == null : this.getSiteF().equals(other.getSiteF()))
            && (this.getSgx() == null ? other.getSgx() == null : this.getSgx().equals(other.getSgx()))
            && (this.getShPch() == null ? other.getShPch() == null : this.getShPch().equals(other.getShPch()))
            && (this.getSType() == null ? other.getSType() == null : this.getSType().equals(other.getSType()))
            && (this.getSkStatus() == null ? other.getSkStatus() == null : this.getSkStatus().equals(other.getSkStatus()))
            && (this.getPayPrice() == null ? other.getPayPrice() == null : this.getPayPrice().equals(other.getPayPrice()))
            && (this.getFactPrice() == null ? other.getFactPrice() == null : this.getFactPrice().equals(other.getFactPrice()))
            && (this.getKkPrice() == null ? other.getKkPrice() == null : this.getKkPrice().equals(other.getKkPrice()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getConcatName() == null ? other.getConcatName() == null : this.getConcatName().equals(other.getConcatName()));
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaId() == null) ? 0 : getSaId().hashCode());
        result = prime * result + ((getSiteCode() == null) ? 0 : getSiteCode().hashCode());
        result = prime * result + ((getSiteName() == null) ? 0 : getSiteName().hashCode());
        result = prime * result + ((getSiteD() == null) ? 0 : getSiteD().hashCode());
        result = prime * result + ((getSiteF() == null) ? 0 : getSiteF().hashCode());
        result = prime * result + ((getSgx() == null) ? 0 : getSgx().hashCode());
        result = prime * result + ((getShPch() == null) ? 0 : getShPch().hashCode());
        result = prime * result + ((getSType() == null) ? 0 : getSType().hashCode());
        result = prime * result + ((getSkStatus() == null) ? 0 : getSkStatus().hashCode());
        result = prime * result + ((getPayPrice() == null) ? 0 : getPayPrice().hashCode());
        result = prime * result + ((getFactPrice() == null) ? 0 : getFactPrice().hashCode());
        result = prime * result + ((getKkPrice() == null) ? 0 : getKkPrice().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getConcatName() == null) ? 0 : getConcatName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", siteCode=").append(siteCode);
        sb.append(", siteName=").append(siteName);
        sb.append(", siteD=").append(siteD);
        sb.append(", siteF=").append(siteF);
        sb.append(", sgx=").append(sgx);
        sb.append(", shPch=").append(shPch);
        sb.append(", sType=").append(sType);
        sb.append(", skStatus=").append(skStatus);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", factPrice=").append(factPrice);
        sb.append(", kkPrice=").append(kkPrice);
        sb.append(", startTime=").append(startTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", remark=").append(remark);
        sb.append(", concatName=").append(concatName);
        sb.append("]");
        return sb.toString();
    }
}