/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName oct_rpa
 */
@TableName(value ="oct_rpa")
@Data
public class OctRpa {
    /**
     * 
     */
    private String siteCode;

    /**
     * 
     */
    private String siteConcat;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String processName;

    /**
     * 
     */
    private String statusName;

    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private String isDelayed;

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
        OctRpa other = (OctRpa) that;
        return (this.getSiteCode() == null ? other.getSiteCode() == null : this.getSiteCode().equals(other.getSiteCode()))
            && (this.getSiteConcat() == null ? other.getSiteConcat() == null : this.getSiteConcat().equals(other.getSiteConcat()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getStatusName() == null ? other.getStatusName() == null : this.getStatusName().equals(other.getStatusName()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getIsDelayed() == null ? other.getIsDelayed() == null : this.getIsDelayed().equals(other.getIsDelayed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiteCode() == null) ? 0 : getSiteCode().hashCode());
        result = prime * result + ((getSiteConcat() == null) ? 0 : getSiteConcat().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getIsDelayed() == null) ? 0 : getIsDelayed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteCode=").append(siteCode);
        sb.append(", siteConcat=").append(siteConcat);
        sb.append(", username=").append(username);
        sb.append(", processName=").append(processName);
        sb.append(", statusName=").append(statusName);
        sb.append(", startTime=").append(startTime);
        sb.append(", isDelayed=").append(isDelayed);
        sb.append("]");
        return sb.toString();
    }
}