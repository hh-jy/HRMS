package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkInfoExample() {
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

        public Criteria andWorkEmpIdIsNull() {
            addCriterion("work_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdIsNotNull() {
            addCriterion("work_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdEqualTo(Integer value) {
            addCriterion("work_emp_id =", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdNotEqualTo(Integer value) {
            addCriterion("work_emp_id <>", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdGreaterThan(Integer value) {
            addCriterion("work_emp_id >", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_emp_id >=", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdLessThan(Integer value) {
            addCriterion("work_emp_id <", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_emp_id <=", value, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdIn(List<Integer> values) {
            addCriterion("work_emp_id in", values, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdNotIn(List<Integer> values) {
            addCriterion("work_emp_id not in", values, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("work_emp_id between", value1, value2, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_emp_id not between", value1, value2, "workEmpId");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("work_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("work_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(Date value) {
            addCriterionForJDBCDate("work_date =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("work_date >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(Date value) {
            addCriterionForJDBCDate("work_date <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<Date> values) {
            addCriterionForJDBCDate("work_date in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_date not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("emp_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("emp_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(Integer value) {
            addCriterion("emp_status =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(Integer value) {
            addCriterion("emp_status <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(Integer value) {
            addCriterion("emp_status >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_status >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(Integer value) {
            addCriterion("emp_status <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("emp_status <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<Integer> values) {
            addCriterion("emp_status in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<Integer> values) {
            addCriterion("emp_status not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(Integer value1, Integer value2) {
            addCriterion("emp_status between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_status not between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdIsNull() {
            addCriterion("work_status_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdIsNotNull() {
            addCriterion("work_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdEqualTo(Integer value) {
            addCriterion("work_status_id =", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdNotEqualTo(Integer value) {
            addCriterion("work_status_id <>", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdGreaterThan(Integer value) {
            addCriterion("work_status_id >", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_status_id >=", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdLessThan(Integer value) {
            addCriterion("work_status_id <", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_status_id <=", value, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdIn(List<Integer> values) {
            addCriterion("work_status_id in", values, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdNotIn(List<Integer> values) {
            addCriterion("work_status_id not in", values, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("work_status_id between", value1, value2, "workStatusId");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_status_id not between", value1, value2, "workStatusId");
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