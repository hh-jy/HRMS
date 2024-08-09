package com.bean;

public class Department {
    private Integer deptId;

    private String deptName;

    private Integer mainEmpId;

    private Integer supDeptId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getMainEmpId() {
        return mainEmpId;
    }

    public void setMainEmpId(Integer mainEmpId) {
        this.mainEmpId = mainEmpId;
    }

    public Integer getSupDeptId() {
        return supDeptId;
    }

    public void setSupDeptId(Integer supDeptId) {
        this.supDeptId = supDeptId;
    }
}