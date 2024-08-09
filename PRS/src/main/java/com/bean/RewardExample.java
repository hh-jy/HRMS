package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRewardIdIsNull() {
            addCriterion("reward_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardIdIsNotNull() {
            addCriterion("reward_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardIdEqualTo(Integer value) {
            addCriterion("reward_id =", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotEqualTo(Integer value) {
            addCriterion("reward_id <>", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThan(Integer value) {
            addCriterion("reward_id >", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_id >=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThan(Integer value) {
            addCriterion("reward_id <", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdLessThanOrEqualTo(Integer value) {
            addCriterion("reward_id <=", value, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdIn(List<Integer> values) {
            addCriterion("reward_id in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotIn(List<Integer> values) {
            addCriterion("reward_id not in", values, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdBetween(Integer value1, Integer value2) {
            addCriterion("reward_id between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_id not between", value1, value2, "rewardId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdIsNull() {
            addCriterion("reward_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdIsNotNull() {
            addCriterion("reward_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdEqualTo(Integer value) {
            addCriterion("reward_emp_id =", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdNotEqualTo(Integer value) {
            addCriterion("reward_emp_id <>", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdGreaterThan(Integer value) {
            addCriterion("reward_emp_id >", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_emp_id >=", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdLessThan(Integer value) {
            addCriterion("reward_emp_id <", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("reward_emp_id <=", value, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdIn(List<Integer> values) {
            addCriterion("reward_emp_id in", values, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdNotIn(List<Integer> values) {
            addCriterion("reward_emp_id not in", values, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("reward_emp_id between", value1, value2, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_emp_id not between", value1, value2, "rewardEmpId");
            return (Criteria) this;
        }

        public Criteria andRewardDateIsNull() {
            addCriterion("reward_date is null");
            return (Criteria) this;
        }

        public Criteria andRewardDateIsNotNull() {
            addCriterion("reward_date is not null");
            return (Criteria) this;
        }

        public Criteria andRewardDateEqualTo(Date value) {
            addCriterionForJDBCDate("reward_date =", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reward_date <>", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reward_date >", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reward_date >=", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateLessThan(Date value) {
            addCriterionForJDBCDate("reward_date <", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reward_date <=", value, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateIn(List<Date> values) {
            addCriterionForJDBCDate("reward_date in", values, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reward_date not in", values, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reward_date between", value1, value2, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reward_date not between", value1, value2, "rewardDate");
            return (Criteria) this;
        }

        public Criteria andRewardMonIsNull() {
            addCriterion("reward_mon is null");
            return (Criteria) this;
        }

        public Criteria andRewardMonIsNotNull() {
            addCriterion("reward_mon is not null");
            return (Criteria) this;
        }

        public Criteria andRewardMonEqualTo(Double value) {
            addCriterion("reward_mon =", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonNotEqualTo(Double value) {
            addCriterion("reward_mon <>", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonGreaterThan(Double value) {
            addCriterion("reward_mon >", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonGreaterThanOrEqualTo(Double value) {
            addCriterion("reward_mon >=", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonLessThan(Double value) {
            addCriterion("reward_mon <", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonLessThanOrEqualTo(Double value) {
            addCriterion("reward_mon <=", value, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonIn(List<Double> values) {
            addCriterion("reward_mon in", values, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonNotIn(List<Double> values) {
            addCriterion("reward_mon not in", values, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonBetween(Double value1, Double value2) {
            addCriterion("reward_mon between", value1, value2, "rewardMon");
            return (Criteria) this;
        }

        public Criteria andRewardMonNotBetween(Double value1, Double value2) {
            addCriterion("reward_mon not between", value1, value2, "rewardMon");
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