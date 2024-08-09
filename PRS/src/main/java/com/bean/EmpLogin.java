package com.bean;

public class EmpLogin {
    private Integer empId;

    private String empPasswords;

    public EmpLogin() {
		super();
	}

	public EmpLogin(Integer empId, String empPasswords) {
		super();
		this.empId = empId;
		this.empPasswords = empPasswords;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpPasswords() {
        return empPasswords;
    }

    public void setEmpPasswords(String empPasswords) {
        this.empPasswords = empPasswords == null ? null : empPasswords.trim();
    }
}