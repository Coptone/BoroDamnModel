/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 流程状态表
 * @TableName workflow_status
 */
@TableName(value ="workflow_status")
@Data
public class WorkflowStatus {
    /**
     * 状态ID
     */
    @TableId(type = IdType.AUTO)
    private Integer statusId;

    /**
     * 状态名称
     */
    private String statusName;

    /**
     * 节点类型(1-供应商节点,2-工人节点)
     */
    private Integer statusType;

    /**
     * 排序号
     */
    private Integer sortOrder;

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
        WorkflowStatus other = (WorkflowStatus) that;
        return (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getStatusName() == null ? other.getStatusName() == null : this.getStatusName().equals(other.getStatusName()))
            && (this.getStatusType() == null ? other.getStatusType() == null : this.getStatusType().equals(other.getStatusType()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        result = prime * result + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statusId=").append(statusId);
        sb.append(", statusName=").append(statusName);
        sb.append(", statusType=").append(statusType);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append("]");
        return sb.toString();
    }
}