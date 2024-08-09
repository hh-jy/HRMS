package com.bean;

import java.util.Date;

public class Transfer {
    private Integer transId;

    private Integer transEmpId;

    private Date transDate;

    private Integer inDeptId;

    private Integer outDeptId;

    private String transReason;

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getTransEmpId() {
        return transEmpId;
    }

    public void setTransEmpId(Integer transEmpId) {
        this.transEmpId = transEmpId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Integer getInDeptId() {
        return inDeptId;
    }

    public void setInDeptId(Integer inDeptId) {
        this.inDeptId = inDeptId;
    }

    public Integer getOutDeptId() {
        return outDeptId;
    }

    public void setOutDeptId(Integer outDeptId) {
        this.outDeptId = outDeptId;
    }

    public String getTransReason() {
        return transReason;
    }

    public void setTransReason(String transReason) {
        this.transReason = transReason == null ? null : transReason.trim();
    }
}