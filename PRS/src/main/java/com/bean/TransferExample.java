package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Integer value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Integer value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Integer value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Integer value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Integer> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Integer> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdIsNull() {
            addCriterion("trans_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdIsNotNull() {
            addCriterion("trans_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdEqualTo(Integer value) {
            addCriterion("trans_emp_id =", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdNotEqualTo(Integer value) {
            addCriterion("trans_emp_id <>", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdGreaterThan(Integer value) {
            addCriterion("trans_emp_id >", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_emp_id >=", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdLessThan(Integer value) {
            addCriterion("trans_emp_id <", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_emp_id <=", value, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdIn(List<Integer> values) {
            addCriterion("trans_emp_id in", values, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdNotIn(List<Integer> values) {
            addCriterion("trans_emp_id not in", values, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_emp_id between", value1, value2, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_emp_id not between", value1, value2, "transEmpId");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterionForJDBCDate("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterionForJDBCDate("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andInDeptIdIsNull() {
            addCriterion("in_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andInDeptIdIsNotNull() {
            addCriterion("in_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andInDeptIdEqualTo(Integer value) {
            addCriterion("in_dept_id =", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdNotEqualTo(Integer value) {
            addCriterion("in_dept_id <>", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdGreaterThan(Integer value) {
            addCriterion("in_dept_id >", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_dept_id >=", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdLessThan(Integer value) {
            addCriterion("in_dept_id <", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_dept_id <=", value, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdIn(List<Integer> values) {
            addCriterion("in_dept_id in", values, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdNotIn(List<Integer> values) {
            addCriterion("in_dept_id not in", values, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("in_dept_id between", value1, value2, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andInDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_dept_id not between", value1, value2, "inDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdIsNull() {
            addCriterion("out_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdIsNotNull() {
            addCriterion("out_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdEqualTo(Integer value) {
            addCriterion("out_dept_id =", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdNotEqualTo(Integer value) {
            addCriterion("out_dept_id <>", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdGreaterThan(Integer value) {
            addCriterion("out_dept_id >", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_dept_id >=", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdLessThan(Integer value) {
            addCriterion("out_dept_id <", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_dept_id <=", value, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdIn(List<Integer> values) {
            addCriterion("out_dept_id in", values, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdNotIn(List<Integer> values) {
            addCriterion("out_dept_id not in", values, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("out_dept_id between", value1, value2, "outDeptId");
            return (Criteria) this;
        }

        public Criteria andOutDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_dept_id not between", value1, value2, "outDeptId");
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