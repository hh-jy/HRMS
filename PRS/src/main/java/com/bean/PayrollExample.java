package com.bean;

import java.util.ArrayList;
import java.util.List;

public class PayrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayrollExample() {
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

        public Criteria andPayEmpIdIsNull() {
            addCriterion("pay_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdIsNotNull() {
            addCriterion("pay_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdEqualTo(Integer value) {
            addCriterion("pay_emp_id =", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdNotEqualTo(Integer value) {
            addCriterion("pay_emp_id <>", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdGreaterThan(Integer value) {
            addCriterion("pay_emp_id >", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_emp_id >=", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdLessThan(Integer value) {
            addCriterion("pay_emp_id <", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_emp_id <=", value, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdIn(List<Integer> values) {
            addCriterion("pay_emp_id in", values, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdNotIn(List<Integer> values) {
            addCriterion("pay_emp_id not in", values, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_emp_id between", value1, value2, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andPayEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_emp_id not between", value1, value2, "payEmpId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdIsNull() {
            addCriterion("tax_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdIsNotNull() {
            addCriterion("tax_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdEqualTo(Integer value) {
            addCriterion("tax_type_id =", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdNotEqualTo(Integer value) {
            addCriterion("tax_type_id <>", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdGreaterThan(Integer value) {
            addCriterion("tax_type_id >", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_type_id >=", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdLessThan(Integer value) {
            addCriterion("tax_type_id <", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("tax_type_id <=", value, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdIn(List<Integer> values) {
            addCriterion("tax_type_id in", values, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdNotIn(List<Integer> values) {
            addCriterion("tax_type_id not in", values, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("tax_type_id between", value1, value2, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_type_id not between", value1, value2, "taxTypeId");
            return (Criteria) this;
        }

        public Criteria andActSalaryIsNull() {
            addCriterion("act_salary is null");
            return (Criteria) this;
        }

        public Criteria andActSalaryIsNotNull() {
            addCriterion("act_salary is not null");
            return (Criteria) this;
        }

        public Criteria andActSalaryEqualTo(Double value) {
            addCriterion("act_salary =", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryNotEqualTo(Double value) {
            addCriterion("act_salary <>", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryGreaterThan(Double value) {
            addCriterion("act_salary >", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("act_salary >=", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryLessThan(Double value) {
            addCriterion("act_salary <", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryLessThanOrEqualTo(Double value) {
            addCriterion("act_salary <=", value, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryIn(List<Double> values) {
            addCriterion("act_salary in", values, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryNotIn(List<Double> values) {
            addCriterion("act_salary not in", values, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryBetween(Double value1, Double value2) {
            addCriterion("act_salary between", value1, value2, "actSalary");
            return (Criteria) this;
        }

        public Criteria andActSalaryNotBetween(Double value1, Double value2) {
            addCriterion("act_salary not between", value1, value2, "actSalary");
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