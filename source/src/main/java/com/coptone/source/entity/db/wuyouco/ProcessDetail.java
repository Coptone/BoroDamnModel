/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 流程明细表
 * @TableName process_detail
 */
@TableName(value ="process_detail")
@Data
public class ProcessDetail {
    /**
     * 明细ID
     */
    @TableId(type = IdType.AUTO)
    private Integer detailId;

    /**
     * 工地ID
     */
    private String siteCode;

    /**
     * 流程ID
     */
    private Integer processId;

    /**
     * 当前状态ID
     */
    private Integer statusId;

    /**
     * 责任人ID
     */
    private Integer responsibleUserId;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 是否当前步骤
     */
    private Integer isCurrent;

    /**
     * 备注
     */
    private String remark;

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
        ProcessDetail other = (ProcessDetail) that;
        return (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getSiteCode() == null ? other.getSiteCode() == null : this.getSiteCode().equals(other.getSiteCode()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getResponsibleUserId() == null ? other.getResponsibleUserId() == null : this.getResponsibleUserId().equals(other.getResponsibleUserId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getIsCurrent() == null ? other.getIsCurrent() == null : this.getIsCurrent().equals(other.getIsCurrent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetailId() == null) ? 0 : getDetailId().hashCode());
        result = prime * result + ((getSiteCode() == null) ? 0 : getSiteCode().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getResponsibleUserId() == null) ? 0 : getResponsibleUserId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getIsCurrent() == null) ? 0 : getIsCurrent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailId=").append(detailId);
        sb.append(", siteCode=").append(siteCode);
        sb.append(", processId=").append(processId);
        sb.append(", statusId=").append(statusId);
        sb.append(", responsibleUserId=").append(responsibleUserId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isCurrent=").append(isCurrent);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}