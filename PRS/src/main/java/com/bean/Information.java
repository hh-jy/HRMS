package com.bean;

import java.util.Date;

public class Information {
    private Integer empId;

    private String empName;

    private String gender;

    private String minority;

    private Date empBir;

    private String politicalStatus;

    private String cultureLevel;

    private String maritalStatus;

    private String idCard;

    private String phoneNum;

    private String email;

    private Integer nativePlaceCode;

    private Integer registeredResidenceCode;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMinority() {
        return minority;
    }

    public void setMinority(String minority) {
        this.minority = minority == null ? null : minority.trim();
    }

    public Date getEmpBir() {
        return empBir;
    }

    public void setEmpBir(Date empBir) {
        this.empBir = empBir;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getCultureLevel() {
        return cultureLevel;
    }

    public void setCultureLevel(String cultureLevel) {
        this.cultureLevel = cultureLevel == null ? null : cultureLevel.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getNativePlaceCode() {
        return nativePlaceCode;
    }

    public void setNativePlaceCode(Integer nativePlaceCode) {
        this.nativePlaceCode = nativePlaceCode;
    }

    public Integer getRegisteredResidenceCode() {
        return registeredResidenceCode;
    }

    public void setRegisteredResidenceCode(Integer registeredResidenceCode) {
        this.registeredResidenceCode = registeredResidenceCode;
    }
}