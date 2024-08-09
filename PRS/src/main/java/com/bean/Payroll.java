package com.bean;

public class Payroll {
    private Integer payEmpId;

    private Integer taxTypeId;

    private Double actSalary;

    public Integer getPayEmpId() {
        return payEmpId;
    }

    public void setPayEmpId(Integer payEmpId) {
        this.payEmpId = payEmpId;
    }

    public Integer getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(Integer taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public Double getActSalary() {
        return actSalary;
    }

    public void setActSalary(Double actSalary) {
        this.actSalary = actSalary;
    }
}