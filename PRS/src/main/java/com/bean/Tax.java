package com.bean;

public class Tax {
    private Integer taxId;

    private Double smallestSal;

    private Double highestSal;

    private Double taxRate;

    private Double deductionSal;

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Double getSmallestSal() {
        return smallestSal;
    }

    public void setSmallestSal(Double smallestSal) {
        this.smallestSal = smallestSal;
    }

    public Double getHighestSal() {
        return highestSal;
    }

    public void setHighestSal(Double highestSal) {
        this.highestSal = highestSal;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getDeductionSal() {
        return deductionSal;
    }

    public void setDeductionSal(Double deductionSal) {
        this.deductionSal = deductionSal;
    }
}