package com.bean;

import java.util.Date;

public class Reward {
    private Integer rewardId;

    private Integer rewardEmpId;

    private Date rewardDate;

    private Double rewardMon;

    private String rewardReason;

    public Integer getRewardId() {
        return rewardId;
    }

    public void setRewardId(Integer rewardId) {
        this.rewardId = rewardId;
    }

    public Integer getRewardEmpId() {
        return rewardEmpId;
    }

    public void setRewardEmpId(Integer rewardEmpId) {
        this.rewardEmpId = rewardEmpId;
    }

    public Date getRewardDate() {
        return rewardDate;
    }

    public void setRewardDate(Date rewardDate) {
        this.rewardDate = rewardDate;
    }

    public Double getRewardMon() {
        return rewardMon;
    }

    public void setRewardMon(Double rewardMon) {
        this.rewardMon = rewardMon;
    }

    public String getRewardReason() {
        return rewardReason;
    }

    public void setRewardReason(String rewardReason) {
        this.rewardReason = rewardReason == null ? null : rewardReason.trim();
    }
}