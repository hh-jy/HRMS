package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMinorityIsNull() {
            addCriterion("minority is null");
            return (Criteria) this;
        }

        public Criteria andMinorityIsNotNull() {
            addCriterion("minority is not null");
            return (Criteria) this;
        }

        public Criteria andMinorityEqualTo(String value) {
            addCriterion("minority =", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityNotEqualTo(String value) {
            addCriterion("minority <>", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityGreaterThan(String value) {
            addCriterion("minority >", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityGreaterThanOrEqualTo(String value) {
            addCriterion("minority >=", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityLessThan(String value) {
            addCriterion("minority <", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityLessThanOrEqualTo(String value) {
            addCriterion("minority <=", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityLike(String value) {
            addCriterion("minority like", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityNotLike(String value) {
            addCriterion("minority not like", value, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityIn(List<String> values) {
            addCriterion("minority in", values, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityNotIn(List<String> values) {
            addCriterion("minority not in", values, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityBetween(String value1, String value2) {
            addCriterion("minority between", value1, value2, "minority");
            return (Criteria) this;
        }

        public Criteria andMinorityNotBetween(String value1, String value2) {
            addCriterion("minority not between", value1, value2, "minority");
            return (Criteria) this;
        }

        public Criteria andEmpBirIsNull() {
            addCriterion("emp_bir is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirIsNotNull() {
            addCriterion("emp_bir is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirEqualTo(Date value) {
            addCriterionForJDBCDate("emp_bir =", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_bir <>", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_bir >", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_bir >=", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirLessThan(Date value) {
            addCriterionForJDBCDate("emp_bir <", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_bir <=", value, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirIn(List<Date> values) {
            addCriterionForJDBCDate("emp_bir in", values, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_bir not in", values, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_bir between", value1, value2, "empBir");
            return (Criteria) this;
        }

        public Criteria andEmpBirNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_bir not between", value1, value2, "empBir");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNull() {
            addCriterion("culture_level is null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNotNull() {
            addCriterion("culture_level is not null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelEqualTo(String value) {
            addCriterion("culture_level =", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotEqualTo(String value) {
            addCriterion("culture_level <>", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThan(String value) {
            addCriterion("culture_level >", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThanOrEqualTo(String value) {
            addCriterion("culture_level >=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThan(String value) {
            addCriterion("culture_level <", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThanOrEqualTo(String value) {
            addCriterion("culture_level <=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLike(String value) {
            addCriterion("culture_level like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotLike(String value) {
            addCriterion("culture_level not like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIn(List<String> values) {
            addCriterion("culture_level in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotIn(List<String> values) {
            addCriterion("culture_level not in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelBetween(String value1, String value2) {
            addCriterion("culture_level between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotBetween(String value1, String value2) {
            addCriterion("culture_level not between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeIsNull() {
            addCriterion("native_place_code is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeIsNotNull() {
            addCriterion("native_place_code is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeEqualTo(Integer value) {
            addCriterion("native_place_code =", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeNotEqualTo(Integer value) {
            addCriterion("native_place_code <>", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeGreaterThan(Integer value) {
            addCriterion("native_place_code >", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("native_place_code >=", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeLessThan(Integer value) {
            addCriterion("native_place_code <", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("native_place_code <=", value, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeIn(List<Integer> values) {
            addCriterion("native_place_code in", values, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeNotIn(List<Integer> values) {
            addCriterion("native_place_code not in", values, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeBetween(Integer value1, Integer value2) {
            addCriterion("native_place_code between", value1, value2, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andNativePlaceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("native_place_code not between", value1, value2, "nativePlaceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeIsNull() {
            addCriterion("registered_residence_code is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeIsNotNull() {
            addCriterion("registered_residence_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeEqualTo(Integer value) {
            addCriterion("registered_residence_code =", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeNotEqualTo(Integer value) {
            addCriterion("registered_residence_code <>", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeGreaterThan(Integer value) {
            addCriterion("registered_residence_code >", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("registered_residence_code >=", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeLessThan(Integer value) {
            addCriterion("registered_residence_code <", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("registered_residence_code <=", value, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeIn(List<Integer> values) {
            addCriterion("registered_residence_code in", values, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeNotIn(List<Integer> values) {
            addCriterion("registered_residence_code not in", values, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeBetween(Integer value1, Integer value2) {
            addCriterion("registered_residence_code between", value1, value2, "registeredResidenceCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("registered_residence_code not between", value1, value2, "registeredResidenceCode");
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