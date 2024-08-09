package com.bean;

public class AdminLogin {
    private Integer adminId;

    private String adminPasswords;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPasswords() {
        return adminPasswords;
    }

    public void setAdminPasswords(String adminPasswords) {
        this.adminPasswords = adminPasswords == null ? null : adminPasswords.trim();
    }
}