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
 * 流程进度表
 * @TableName process_progress
 */
@TableName(value ="process_progress")
@Data
public class ProcessProgress {
    /**
     * 流程进行ID
     */
    @TableId(type = IdType.AUTO)
    private Integer progressId;

    /**
     * 流程ID
     */
    private Integer processId;

    /**
     * 工地ID
     */
    private String siteId;

    /**
     * 工程管家ID
     */
    private Integer userId;

    /**
     * 状态(未开始/进行中/已完工)
     */
    private String status;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 是否延期
     */
    private Integer isDelayed;

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
        ProcessProgress other = (ProcessProgress) that;
        return (this.getProgressId() == null ? other.getProgressId() == null : this.getProgressId().equals(other.getProgressId()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getSiteId() == null ? other.getSiteId() == null : this.getSiteId().equals(other.getSiteId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getIsDelayed() == null ? other.getIsDelayed() == null : this.getIsDelayed().equals(other.getIsDelayed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProgressId() == null) ? 0 : getProgressId().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getIsDelayed() == null) ? 0 : getIsDelayed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", progressId=").append(progressId);
        sb.append(", processId=").append(processId);
        sb.append(", siteId=").append(siteId);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isDelayed=").append(isDelayed);
        sb.append("]");
        return sb.toString();
    }
}