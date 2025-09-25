/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName agency_detail
 */
@TableName(value ="agency_detail")
@Data
public class AgencyDetail {
    /**
     * 
     */
    private Integer saId;

    /**
     * 
     */
    private String cldl;

    /**
     * 
     */
    private String clzl;

    /**
     * 
     */
    private String cl;

    /**
     * 
     */
    private String sl;

    /**
     * 
     */
    private String clsx;

    /**
     * 
     */
    private String clbz;

    /**
     * 
     */
    private String clzlbz;

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
        AgencyDetail other = (AgencyDetail) that;
        return (this.getSaId() == null ? other.getSaId() == null : this.getSaId().equals(other.getSaId()))
            && (this.getCldl() == null ? other.getCldl() == null : this.getCldl().equals(other.getCldl()))
            && (this.getClzl() == null ? other.getClzl() == null : this.getClzl().equals(other.getClzl()))
            && (this.getCl() == null ? other.getCl() == null : this.getCl().equals(other.getCl()))
            && (this.getSl() == null ? other.getSl() == null : this.getSl().equals(other.getSl()))
            && (this.getClsx() == null ? other.getClsx() == null : this.getClsx().equals(other.getClsx()))
            && (this.getClbz() == null ? other.getClbz() == null : this.getClbz().equals(other.getClbz()))
            && (this.getClzlbz() == null ? other.getClzlbz() == null : this.getClzlbz().equals(other.getClzlbz()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaId() == null) ? 0 : getSaId().hashCode());
        result = prime * result + ((getCldl() == null) ? 0 : getCldl().hashCode());
        result = prime * result + ((getClzl() == null) ? 0 : getClzl().hashCode());
        result = prime * result + ((getCl() == null) ? 0 : getCl().hashCode());
        result = prime * result + ((getSl() == null) ? 0 : getSl().hashCode());
        result = prime * result + ((getClsx() == null) ? 0 : getClsx().hashCode());
        result = prime * result + ((getClbz() == null) ? 0 : getClbz().hashCode());
        result = prime * result + ((getClzlbz() == null) ? 0 : getClzlbz().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", cldl=").append(cldl);
        sb.append(", clzl=").append(clzl);
        sb.append(", cl=").append(cl);
        sb.append(", sl=").append(sl);
        sb.append(", clsx=").append(clsx);
        sb.append(", clbz=").append(clbz);
        sb.append(", clzlbz=").append(clzlbz);
        sb.append("]");
        return sb.toString();
    }
}