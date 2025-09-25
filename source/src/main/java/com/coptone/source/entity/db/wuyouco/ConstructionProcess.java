/*
 * Copyright (c) Jacob Zhang copyright message. 2022——2025.All rights reserved~(:3)~
 */

package com.coptone.source.entity.db.wuyouco;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 流程表
 * @TableName construction_process
 */
@TableName(value ="construction_process")
@Data
public class ConstructionProcess {
    /**
     * 流程ID
     */
    @TableId(type = IdType.AUTO)
    private Integer processId;

    /**
     * 流程名称
     */
    private String processName;

    /**
     * 流程标准工时
     */
    private Integer standardHours;

    /**
     * 流程类型（0其他，1工人，2供应商）
     */
    private Integer processType;

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
        ConstructionProcess other = (ConstructionProcess) that;
        return (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getStandardHours() == null ? other.getStandardHours() == null : this.getStandardHours().equals(other.getStandardHours()))
            && (this.getProcessType() == null ? other.getProcessType() == null : this.getProcessType().equals(other.getProcessType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getStandardHours() == null) ? 0 : getStandardHours().hashCode());
        result = prime * result + ((getProcessType() == null) ? 0 : getProcessType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processId=").append(processId);
        sb.append(", processName=").append(processName);
        sb.append(", standardHours=").append(standardHours);
        sb.append(", processType=").append(processType);
        sb.append("]");
        return sb.toString();
    }
}