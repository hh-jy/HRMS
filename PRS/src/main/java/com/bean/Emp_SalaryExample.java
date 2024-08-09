package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Emp_SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Emp_SalaryExample() {
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

        public Criteria andSalEmpIdIsNull() {
            addCriterion("sal_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdIsNotNull() {
            addCriterion("sal_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdEqualTo(Integer value) {
            addCriterion("sal_emp_id =", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdNotEqualTo(Integer value) {
            addCriterion("sal_emp_id <>", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdGreaterThan(Integer value) {
            addCriterion("sal_emp_id >", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sal_emp_id >=", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdLessThan(Integer value) {
            addCriterion("sal_emp_id <", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("sal_emp_id <=", value, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdIn(List<Integer> values) {
            addCriterion("sal_emp_id in", values, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdNotIn(List<Integer> values) {
            addCriterion("sal_emp_id not in", values, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("sal_emp_id between", value1, value2, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andSalEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sal_emp_id not between", value1, value2, "salEmpId");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNull() {
            addCriterion("basic_salary is null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNotNull() {
            addCriterion("basic_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryEqualTo(Double value) {
            addCriterion("basic_salary =", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotEqualTo(Double value) {
            addCriterion("basic_salary <>", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThan(Double value) {
            addCriterion("basic_salary >", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("basic_salary >=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThan(Double value) {
            addCriterion("basic_salary <", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThanOrEqualTo(Double value) {
            addCriterion("basic_salary <=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIn(List<Double> values) {
            addCriterion("basic_salary in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotIn(List<Double> values) {
            addCriterion("basic_salary not in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryBetween(Double value1, Double value2) {
            addCriterion("basic_salary between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotBetween(Double value1, Double value2) {
            addCriterion("basic_salary not between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andRewardSalIsNull() {
            addCriterion("reward_sal is null");
            return (Criteria) this;
        }

        public Criteria andRewardSalIsNotNull() {
            addCriterion("reward_sal is not null");
            return (Criteria) this;
        }

        public Criteria andRewardSalEqualTo(Double value) {
            addCriterion("reward_sal =", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalNotEqualTo(Double value) {
            addCriterion("reward_sal <>", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalGreaterThan(Double value) {
            addCriterion("reward_sal >", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalGreaterThanOrEqualTo(Double value) {
            addCriterion("reward_sal >=", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalLessThan(Double value) {
            addCriterion("reward_sal <", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalLessThanOrEqualTo(Double value) {
            addCriterion("reward_sal <=", value, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalIn(List<Double> values) {
            addCriterion("reward_sal in", values, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalNotIn(List<Double> values) {
            addCriterion("reward_sal not in", values, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalBetween(Double value1, Double value2) {
            addCriterion("reward_sal between", value1, value2, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andRewardSalNotBetween(Double value1, Double value2) {
            addCriterion("reward_sal not between", value1, value2, "rewardSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalIsNull() {
            addCriterion("punish_sal is null");
            return (Criteria) this;
        }

        public Criteria andPunishSalIsNotNull() {
            addCriterion("punish_sal is not null");
            return (Criteria) this;
        }

        public Criteria andPunishSalEqualTo(Double value) {
            addCriterion("punish_sal =", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalNotEqualTo(Double value) {
            addCriterion("punish_sal <>", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalGreaterThan(Double value) {
            addCriterion("punish_sal >", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalGreaterThanOrEqualTo(Double value) {
            addCriterion("punish_sal >=", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalLessThan(Double value) {
            addCriterion("punish_sal <", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalLessThanOrEqualTo(Double value) {
            addCriterion("punish_sal <=", value, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalIn(List<Double> values) {
            addCriterion("punish_sal in", values, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalNotIn(List<Double> values) {
            addCriterion("punish_sal not in", values, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalBetween(Double value1, Double value2) {
            addCriterion("punish_sal between", value1, value2, "punishSal");
            return (Criteria) this;
        }

        public Criteria andPunishSalNotBetween(Double value1, Double value2) {
            addCriterion("punish_sal not between", value1, value2, "punishSal");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNull() {
            addCriterion("emp_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNotNull() {
            addCriterion("emp_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryEqualTo(Double value) {
            addCriterion("emp_salary =", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotEqualTo(Double value) {
            addCriterion("emp_salary <>", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThan(Double value) {
            addCriterion("emp_salary >", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("emp_salary >=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThan(Double value) {
            addCriterion("emp_salary <", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThanOrEqualTo(Double value) {
            addCriterion("emp_salary <=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIn(List<Double> values) {
            addCriterion("emp_salary in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotIn(List<Double> values) {
            addCriterion("emp_salary not in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryBetween(Double value1, Double value2) {
            addCriterion("emp_salary between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotBetween(Double value1, Double value2) {
            addCriterion("emp_salary not between", value1, value2, "empSalary");
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