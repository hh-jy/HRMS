package com.bean;

import java.util.Date;

public class Dimission {
    private Integer dimEmpId;

    private Date dimDate;

    private String dimReason;

    public Integer getDimEmpId() {
        return dimEmpId;
    }

    public void setDimEmpId(Integer dimEmpId) {
        this.dimEmpId = dimEmpId;
    }

    public Date getDimDate() {
        return dimDate;
    }

    public void setDimDate(Date dimDate) {
        this.dimDate = dimDate;
    }

    public String getDimReason() {
        return dimReason;
    }

    public void setDimReason(String dimReason) {
        this.dimReason = dimReason == null ? null : dimReason.trim();
    }
}