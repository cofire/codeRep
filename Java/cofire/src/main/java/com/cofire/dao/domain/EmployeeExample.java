package com.cofire.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public EmployeeExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public Integer getLimitSize() {
        return limitSize;
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIsNull() {
            addCriterion("EMPLOYEE_AGE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIsNotNull() {
            addCriterion("EMPLOYEE_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeEqualTo(Integer value) {
            addCriterion("EMPLOYEE_AGE =", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_AGE <>", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_AGE >", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_AGE >=", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeLessThan(Integer value) {
            addCriterion("EMPLOYEE_AGE <", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_AGE <=", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIn(List<Integer> values) {
            addCriterion("EMPLOYEE_AGE in", values, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_AGE not in", values, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_AGE between", value1, value2, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_AGE not between", value1, value2, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("EMPLOYEE_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("EMPLOYEE_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("EMPLOYEE_GENDER =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("EMPLOYEE_GENDER <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("EMPLOYEE_GENDER >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_GENDER >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("EMPLOYEE_GENDER <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_GENDER <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("EMPLOYEE_GENDER like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("EMPLOYEE_GENDER not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("EMPLOYEE_GENDER in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("EMPLOYEE_GENDER not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_GENDER between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_GENDER not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIsNull() {
            addCriterion("EMPLOYEE_ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIsNotNull() {
            addCriterion("EMPLOYEE_ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardEqualTo(String value) {
            addCriterion("EMPLOYEE_ID_CARD =", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID_CARD <>", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID_CARD >", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID_CARD >=", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLessThan(String value) {
            addCriterion("EMPLOYEE_ID_CARD <", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID_CARD <=", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardLike(String value) {
            addCriterion("EMPLOYEE_ID_CARD like", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotLike(String value) {
            addCriterion("EMPLOYEE_ID_CARD not like", value, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardIn(List<String> values) {
            addCriterion("EMPLOYEE_ID_CARD in", values, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID_CARD not in", values, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID_CARD between", value1, value2, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdCardNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID_CARD not between", value1, value2, "employeeIdCard");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("EMPLOYEE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("EMPLOYEE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("EMPLOYEE_PHONE >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("EMPLOYEE_PHONE <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("EMPLOYEE_PHONE like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("EMPLOYEE_PHONE not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("EMPLOYEE_PHONE in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("EMPLOYEE_PHONE not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PHONE between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PHONE not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIsNull() {
            addCriterion("EMPLOYEE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIsNotNull() {
            addCriterion("EMPLOYEE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptEqualTo(String value) {
            addCriterion("EMPLOYEE_DEPT =", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotEqualTo(String value) {
            addCriterion("EMPLOYEE_DEPT <>", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptGreaterThan(String value) {
            addCriterion("EMPLOYEE_DEPT >", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_DEPT >=", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLessThan(String value) {
            addCriterion("EMPLOYEE_DEPT <", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_DEPT <=", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLike(String value) {
            addCriterion("EMPLOYEE_DEPT like", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotLike(String value) {
            addCriterion("EMPLOYEE_DEPT not like", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIn(List<String> values) {
            addCriterion("EMPLOYEE_DEPT in", values, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotIn(List<String> values) {
            addCriterion("EMPLOYEE_DEPT not in", values, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_DEPT between", value1, value2, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_DEPT not between", value1, value2, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoIsNull() {
            addCriterion("EMPLOYEE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoIsNotNull() {
            addCriterion("EMPLOYEE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoEqualTo(String value) {
            addCriterion("EMPLOYEE_INFO =", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoNotEqualTo(String value) {
            addCriterion("EMPLOYEE_INFO <>", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoGreaterThan(String value) {
            addCriterion("EMPLOYEE_INFO >", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_INFO >=", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoLessThan(String value) {
            addCriterion("EMPLOYEE_INFO <", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_INFO <=", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoLike(String value) {
            addCriterion("EMPLOYEE_INFO like", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoNotLike(String value) {
            addCriterion("EMPLOYEE_INFO not like", value, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoIn(List<String> values) {
            addCriterion("EMPLOYEE_INFO in", values, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoNotIn(List<String> values) {
            addCriterion("EMPLOYEE_INFO not in", values, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_INFO between", value1, value2, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEmployeeInfoNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_INFO not between", value1, value2, "employeeInfo");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("ENTRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("ENTRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(String value) {
            addCriterion("ENTRY_TIME =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(String value) {
            addCriterion("ENTRY_TIME <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(String value) {
            addCriterion("ENTRY_TIME >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(String value) {
            addCriterion("ENTRY_TIME <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_TIME <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLike(String value) {
            addCriterion("ENTRY_TIME like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotLike(String value) {
            addCriterion("ENTRY_TIME not like", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<String> values) {
            addCriterion("ENTRY_TIME in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<String> values) {
            addCriterion("ENTRY_TIME not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(String value1, String value2) {
            addCriterion("ENTRY_TIME not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("\"LEAVE_ TIME\" is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("\"LEAVE_ TIME\" is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("\"LEAVE_ TIME\" =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("\"LEAVE_ TIME\" <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("\"LEAVE_ TIME\" >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("\"LEAVE_ TIME\" >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("\"LEAVE_ TIME\" <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("\"LEAVE_ TIME\" <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("\"LEAVE_ TIME\" like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("\"LEAVE_ TIME\" not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("\"LEAVE_ TIME\" in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("\"LEAVE_ TIME\" not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("\"LEAVE_ TIME\" between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("\"LEAVE_ TIME\" not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNull() {
            addCriterion("CHECK_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNotNull() {
            addCriterion("CHECK_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageEqualTo(String value) {
            addCriterion("CHECK_MESSAGE =", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotEqualTo(String value) {
            addCriterion("CHECK_MESSAGE <>", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThan(String value) {
            addCriterion("CHECK_MESSAGE >", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_MESSAGE >=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThan(String value) {
            addCriterion("CHECK_MESSAGE <", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThanOrEqualTo(String value) {
            addCriterion("CHECK_MESSAGE <=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLike(String value) {
            addCriterion("CHECK_MESSAGE like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotLike(String value) {
            addCriterion("CHECK_MESSAGE not like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIn(List<String> values) {
            addCriterion("CHECK_MESSAGE in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotIn(List<String> values) {
            addCriterion("CHECK_MESSAGE not in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageBetween(String value1, String value2) {
            addCriterion("CHECK_MESSAGE between", value1, value2, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotBetween(String value1, String value2) {
            addCriterion("CHECK_MESSAGE not between", value1, value2, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNull() {
            addCriterion("FILLER1 is null");
            return (Criteria) this;
        }

        public Criteria andFiller1IsNotNull() {
            addCriterion("FILLER1 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller1EqualTo(String value) {
            addCriterion("FILLER1 =", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotEqualTo(String value) {
            addCriterion("FILLER1 <>", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThan(String value) {
            addCriterion("FILLER1 >", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER1 >=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThan(String value) {
            addCriterion("FILLER1 <", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1LessThanOrEqualTo(String value) {
            addCriterion("FILLER1 <=", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Like(String value) {
            addCriterion("FILLER1 like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotLike(String value) {
            addCriterion("FILLER1 not like", value, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1In(List<String> values) {
            addCriterion("FILLER1 in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotIn(List<String> values) {
            addCriterion("FILLER1 not in", values, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1Between(String value1, String value2) {
            addCriterion("FILLER1 between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller1NotBetween(String value1, String value2) {
            addCriterion("FILLER1 not between", value1, value2, "filler1");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNull() {
            addCriterion("FILLER2 is null");
            return (Criteria) this;
        }

        public Criteria andFiller2IsNotNull() {
            addCriterion("FILLER2 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller2EqualTo(String value) {
            addCriterion("FILLER2 =", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotEqualTo(String value) {
            addCriterion("FILLER2 <>", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThan(String value) {
            addCriterion("FILLER2 >", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER2 >=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThan(String value) {
            addCriterion("FILLER2 <", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2LessThanOrEqualTo(String value) {
            addCriterion("FILLER2 <=", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Like(String value) {
            addCriterion("FILLER2 like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotLike(String value) {
            addCriterion("FILLER2 not like", value, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2In(List<String> values) {
            addCriterion("FILLER2 in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotIn(List<String> values) {
            addCriterion("FILLER2 not in", values, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2Between(String value1, String value2) {
            addCriterion("FILLER2 between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller2NotBetween(String value1, String value2) {
            addCriterion("FILLER2 not between", value1, value2, "filler2");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNull() {
            addCriterion("FILLER3 is null");
            return (Criteria) this;
        }

        public Criteria andFiller3IsNotNull() {
            addCriterion("FILLER3 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller3EqualTo(String value) {
            addCriterion("FILLER3 =", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotEqualTo(String value) {
            addCriterion("FILLER3 <>", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThan(String value) {
            addCriterion("FILLER3 >", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER3 >=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThan(String value) {
            addCriterion("FILLER3 <", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3LessThanOrEqualTo(String value) {
            addCriterion("FILLER3 <=", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Like(String value) {
            addCriterion("FILLER3 like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotLike(String value) {
            addCriterion("FILLER3 not like", value, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3In(List<String> values) {
            addCriterion("FILLER3 in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotIn(List<String> values) {
            addCriterion("FILLER3 not in", values, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3Between(String value1, String value2) {
            addCriterion("FILLER3 between", value1, value2, "filler3");
            return (Criteria) this;
        }

        public Criteria andFiller3NotBetween(String value1, String value2) {
            addCriterion("FILLER3 not between", value1, value2, "filler3");
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