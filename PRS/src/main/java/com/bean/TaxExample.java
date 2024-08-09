package com.bean;

import java.util.ArrayList;
import java.util.List;

public class TaxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("tax_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("tax_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(Integer value) {
            addCriterion("tax_id =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(Integer value) {
            addCriterion("tax_id <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(Integer value) {
            addCriterion("tax_id >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_id >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(Integer value) {
            addCriterion("tax_id <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(Integer value) {
            addCriterion("tax_id <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<Integer> values) {
            addCriterion("tax_id in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<Integer> values) {
            addCriterion("tax_id not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(Integer value1, Integer value2) {
            addCriterion("tax_id between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_id not between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andSmallestSalIsNull() {
            addCriterion("smallest_sal is null");
            return (Criteria) this;
        }

        public Criteria andSmallestSalIsNotNull() {
            addCriterion("smallest_sal is not null");
            return (Criteria) this;
        }

        public Criteria andSmallestSalEqualTo(Double value) {
            addCriterion("smallest_sal =", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalNotEqualTo(Double value) {
            addCriterion("smallest_sal <>", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalGreaterThan(Double value) {
            addCriterion("smallest_sal >", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalGreaterThanOrEqualTo(Double value) {
            addCriterion("smallest_sal >=", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalLessThan(Double value) {
            addCriterion("smallest_sal <", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalLessThanOrEqualTo(Double value) {
            addCriterion("smallest_sal <=", value, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalIn(List<Double> values) {
            addCriterion("smallest_sal in", values, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalNotIn(List<Double> values) {
            addCriterion("smallest_sal not in", values, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalBetween(Double value1, Double value2) {
            addCriterion("smallest_sal between", value1, value2, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andSmallestSalNotBetween(Double value1, Double value2) {
            addCriterion("smallest_sal not between", value1, value2, "smallestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalIsNull() {
            addCriterion("highest_sal is null");
            return (Criteria) this;
        }

        public Criteria andHighestSalIsNotNull() {
            addCriterion("highest_sal is not null");
            return (Criteria) this;
        }

        public Criteria andHighestSalEqualTo(Double value) {
            addCriterion("highest_sal =", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalNotEqualTo(Double value) {
            addCriterion("highest_sal <>", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalGreaterThan(Double value) {
            addCriterion("highest_sal >", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalGreaterThanOrEqualTo(Double value) {
            addCriterion("highest_sal >=", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalLessThan(Double value) {
            addCriterion("highest_sal <", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalLessThanOrEqualTo(Double value) {
            addCriterion("highest_sal <=", value, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalIn(List<Double> values) {
            addCriterion("highest_sal in", values, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalNotIn(List<Double> values) {
            addCriterion("highest_sal not in", values, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalBetween(Double value1, Double value2) {
            addCriterion("highest_sal between", value1, value2, "highestSal");
            return (Criteria) this;
        }

        public Criteria andHighestSalNotBetween(Double value1, Double value2) {
            addCriterion("highest_sal not between", value1, value2, "highestSal");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(Double value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(Double value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(Double value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(Double value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(Double value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<Double> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<Double> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(Double value1, Double value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(Double value1, Double value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andDeductionSalIsNull() {
            addCriterion("deduction_sal is null");
            return (Criteria) this;
        }

        public Criteria andDeductionSalIsNotNull() {
            addCriterion("deduction_sal is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionSalEqualTo(Double value) {
            addCriterion("deduction_sal =", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalNotEqualTo(Double value) {
            addCriterion("deduction_sal <>", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalGreaterThan(Double value) {
            addCriterion("deduction_sal >", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalGreaterThanOrEqualTo(Double value) {
            addCriterion("deduction_sal >=", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalLessThan(Double value) {
            addCriterion("deduction_sal <", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalLessThanOrEqualTo(Double value) {
            addCriterion("deduction_sal <=", value, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalIn(List<Double> values) {
            addCriterion("deduction_sal in", values, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalNotIn(List<Double> values) {
            addCriterion("deduction_sal not in", values, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalBetween(Double value1, Double value2) {
            addCriterion("deduction_sal between", value1, value2, "deductionSal");
            return (Criteria) this;
        }

        public Criteria andDeductionSalNotBetween(Double value1, Double value2) {
            addCriterion("deduction_sal not between", value1, value2, "deductionSal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}