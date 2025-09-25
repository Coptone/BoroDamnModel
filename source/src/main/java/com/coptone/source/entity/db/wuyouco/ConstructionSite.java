/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 工地信息表
 * @TableName construction_site
 */
@TableName(value ="construction_site")
@Data
public class ConstructionSite {
    /**
     * 
     */
    private String siteCode;

    /**
     * 
     */
    private String province;

    /**
     * 
     */
    private String city;

    /**
     * 
     */
    private String district;

    /**
     * 
     */
    private String communityName;

    /**
     * 
     */
    private String buildingNo;

    /**
     * 
     */
    private String roomNo;

    /**
     * 
     */
    private Date contractDate;

    /**
     * 
     */
    private Date startDate;

    /**
     * 
     */
    private Date completionDate;

    /**
     * 
     */
    private String currentProcess;

    /**
     * 
     */
    private String projectStatus;

    /**
     * 
     */
    private String supervisor;

    /**
     * 
     */
    private BigDecimal contractAmount;

    /**
     * 
     */
    private BigDecimal excludedBudget;

    /**
     * 
     */
    private String finalPaymentReceived;

    /**
     * 
     */
    private String recordDepartment;

    /**
     * 
     */
    private String recorder;

    /**
     * 
     */
    private String siteConcat;

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
        ConstructionSite other = (ConstructionSite) that;
        return (this.getSiteCode() == null ? other.getSiteCode() == null : this.getSiteCode().equals(other.getSiteCode()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getCommunityName() == null ? other.getCommunityName() == null : this.getCommunityName().equals(other.getCommunityName()))
            && (this.getBuildingNo() == null ? other.getBuildingNo() == null : this.getBuildingNo().equals(other.getBuildingNo()))
            && (this.getRoomNo() == null ? other.getRoomNo() == null : this.getRoomNo().equals(other.getRoomNo()))
            && (this.getContractDate() == null ? other.getContractDate() == null : this.getContractDate().equals(other.getContractDate()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getCompletionDate() == null ? other.getCompletionDate() == null : this.getCompletionDate().equals(other.getCompletionDate()))
            && (this.getCurrentProcess() == null ? other.getCurrentProcess() == null : this.getCurrentProcess().equals(other.getCurrentProcess()))
            && (this.getProjectStatus() == null ? other.getProjectStatus() == null : this.getProjectStatus().equals(other.getProjectStatus()))
            && (this.getSupervisor() == null ? other.getSupervisor() == null : this.getSupervisor().equals(other.getSupervisor()))
            && (this.getContractAmount() == null ? other.getContractAmount() == null : this.getContractAmount().equals(other.getContractAmount()))
            && (this.getExcludedBudget() == null ? other.getExcludedBudget() == null : this.getExcludedBudget().equals(other.getExcludedBudget()))
            && (this.getFinalPaymentReceived() == null ? other.getFinalPaymentReceived() == null : this.getFinalPaymentReceived().equals(other.getFinalPaymentReceived()))
            && (this.getRecordDepartment() == null ? other.getRecordDepartment() == null : this.getRecordDepartment().equals(other.getRecordDepartment()))
            && (this.getRecorder() == null ? other.getRecorder() == null : this.getRecorder().equals(other.getRecorder()))
            && (this.getSiteConcat() == null ? other.getSiteConcat() == null : this.getSiteConcat().equals(other.getSiteConcat()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSiteCode() == null) ? 0 : getSiteCode().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getCommunityName() == null) ? 0 : getCommunityName().hashCode());
        result = prime * result + ((getBuildingNo() == null) ? 0 : getBuildingNo().hashCode());
        result = prime * result + ((getRoomNo() == null) ? 0 : getRoomNo().hashCode());
        result = prime * result + ((getContractDate() == null) ? 0 : getContractDate().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        result = prime * result + ((getCurrentProcess() == null) ? 0 : getCurrentProcess().hashCode());
        result = prime * result + ((getProjectStatus() == null) ? 0 : getProjectStatus().hashCode());
        result = prime * result + ((getSupervisor() == null) ? 0 : getSupervisor().hashCode());
        result = prime * result + ((getContractAmount() == null) ? 0 : getContractAmount().hashCode());
        result = prime * result + ((getExcludedBudget() == null) ? 0 : getExcludedBudget().hashCode());
        result = prime * result + ((getFinalPaymentReceived() == null) ? 0 : getFinalPaymentReceived().hashCode());
        result = prime * result + ((getRecordDepartment() == null) ? 0 : getRecordDepartment().hashCode());
        result = prime * result + ((getRecorder() == null) ? 0 : getRecorder().hashCode());
        result = prime * result + ((getSiteConcat() == null) ? 0 : getSiteConcat().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", siteCode=").append(siteCode);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", communityName=").append(communityName);
        sb.append(", buildingNo=").append(buildingNo);
        sb.append(", roomNo=").append(roomNo);
        sb.append(", contractDate=").append(contractDate);
        sb.append(", startDate=").append(startDate);
        sb.append(", completionDate=").append(completionDate);
        sb.append(", currentProcess=").append(currentProcess);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", supervisor=").append(supervisor);
        sb.append(", contractAmount=").append(contractAmount);
        sb.append(", excludedBudget=").append(excludedBudget);
        sb.append(", finalPaymentReceived=").append(finalPaymentReceived);
        sb.append(", recordDepartment=").append(recordDepartment);
        sb.append(", recorder=").append(recorder);
        sb.append(", siteConcat=").append(siteConcat);
        sb.append("]");
        return sb.toString();
    }
}