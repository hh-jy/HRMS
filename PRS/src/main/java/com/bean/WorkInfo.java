package com.bean;

import java.util.Date;

public class WorkInfo {
    private Integer workEmpId;

    private Date workDate;

    private Integer empStatus;

    private Integer workStatusId;

    public Integer getWorkEmpId() {
        return workEmpId;
    }

    public void setWorkEmpId(Integer workEmpId) {
        this.workEmpId = workEmpId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }

    public Integer getWorkStatusId() {
        return workStatusId;
    }

    public void setWorkStatusId(Integer workStatusId) {
        this.workStatusId = workStatusId;
    }
}