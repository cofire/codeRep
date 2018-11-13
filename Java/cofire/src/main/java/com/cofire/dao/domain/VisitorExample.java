package com.cofire.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public VisitorExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("D_ID like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("D_ID not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonIsNull() {
            addCriterion("VISITED_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonIsNotNull() {
            addCriterion("VISITED_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonEqualTo(String value) {
            addCriterion("VISITED_PERSON =", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonNotEqualTo(String value) {
            addCriterion("VISITED_PERSON <>", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonGreaterThan(String value) {
            addCriterion("VISITED_PERSON >", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonGreaterThanOrEqualTo(String value) {
            addCriterion("VISITED_PERSON >=", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonLessThan(String value) {
            addCriterion("VISITED_PERSON <", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonLessThanOrEqualTo(String value) {
            addCriterion("VISITED_PERSON <=", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonLike(String value) {
            addCriterion("VISITED_PERSON like", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonNotLike(String value) {
            addCriterion("VISITED_PERSON not like", value, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonIn(List<String> values) {
            addCriterion("VISITED_PERSON in", values, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonNotIn(List<String> values) {
            addCriterion("VISITED_PERSON not in", values, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonBetween(String value1, String value2) {
            addCriterion("VISITED_PERSON between", value1, value2, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedPersonNotBetween(String value1, String value2) {
            addCriterion("VISITED_PERSON not between", value1, value2, "visitedPerson");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptIsNull() {
            addCriterion("VISITED_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptIsNotNull() {
            addCriterion("VISITED_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptEqualTo(String value) {
            addCriterion("VISITED_DEPT =", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptNotEqualTo(String value) {
            addCriterion("VISITED_DEPT <>", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptGreaterThan(String value) {
            addCriterion("VISITED_DEPT >", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptGreaterThanOrEqualTo(String value) {
            addCriterion("VISITED_DEPT >=", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptLessThan(String value) {
            addCriterion("VISITED_DEPT <", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptLessThanOrEqualTo(String value) {
            addCriterion("VISITED_DEPT <=", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptLike(String value) {
            addCriterion("VISITED_DEPT like", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptNotLike(String value) {
            addCriterion("VISITED_DEPT not like", value, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptIn(List<String> values) {
            addCriterion("VISITED_DEPT in", values, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptNotIn(List<String> values) {
            addCriterion("VISITED_DEPT not in", values, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptBetween(String value1, String value2) {
            addCriterion("VISITED_DEPT between", value1, value2, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andVisitedDeptNotBetween(String value1, String value2) {
            addCriterion("VISITED_DEPT not between", value1, value2, "visitedDept");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(String value) {
            addCriterion("IN_TIME =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(String value) {
            addCriterion("IN_TIME <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(String value) {
            addCriterion("IN_TIME >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_TIME >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(String value) {
            addCriterion("IN_TIME <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(String value) {
            addCriterion("IN_TIME <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLike(String value) {
            addCriterion("IN_TIME like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotLike(String value) {
            addCriterion("IN_TIME not like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<String> values) {
            addCriterion("IN_TIME in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<String> values) {
            addCriterion("IN_TIME not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(String value1, String value2) {
            addCriterion("IN_TIME between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(String value1, String value2) {
            addCriterion("IN_TIME not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("OUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("OUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(String value) {
            addCriterion("OUT_TIME =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(String value) {
            addCriterion("OUT_TIME <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(String value) {
            addCriterion("OUT_TIME >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_TIME >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(String value) {
            addCriterion("OUT_TIME <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(String value) {
            addCriterion("OUT_TIME <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLike(String value) {
            addCriterion("OUT_TIME like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotLike(String value) {
            addCriterion("OUT_TIME not like", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<String> values) {
            addCriterion("OUT_TIME in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<String> values) {
            addCriterion("OUT_TIME not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(String value1, String value2) {
            addCriterion("OUT_TIME between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(String value1, String value2) {
            addCriterion("OUT_TIME not between", value1, value2, "outTime");
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

        public Criteria andVisitorTypeIsNull() {
            addCriterion("VISITOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeIsNotNull() {
            addCriterion("VISITOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeEqualTo(String value) {
            addCriterion("VISITOR_TYPE =", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotEqualTo(String value) {
            addCriterion("VISITOR_TYPE <>", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeGreaterThan(String value) {
            addCriterion("VISITOR_TYPE >", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_TYPE >=", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLessThan(String value) {
            addCriterion("VISITOR_TYPE <", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_TYPE <=", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLike(String value) {
            addCriterion("VISITOR_TYPE like", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotLike(String value) {
            addCriterion("VISITOR_TYPE not like", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeIn(List<String> values) {
            addCriterion("VISITOR_TYPE in", values, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotIn(List<String> values) {
            addCriterion("VISITOR_TYPE not in", values, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeBetween(String value1, String value2) {
            addCriterion("VISITOR_TYPE between", value1, value2, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotBetween(String value1, String value2) {
            addCriterion("VISITOR_TYPE not between", value1, value2, "visitorType");
            return (Criteria) this;
        }

        public Criteria andIsTrainedIsNull() {
            addCriterion("IS_TRAINED is null");
            return (Criteria) this;
        }

        public Criteria andIsTrainedIsNotNull() {
            addCriterion("IS_TRAINED is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrainedEqualTo(String value) {
            addCriterion("IS_TRAINED =", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedNotEqualTo(String value) {
            addCriterion("IS_TRAINED <>", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedGreaterThan(String value) {
            addCriterion("IS_TRAINED >", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRAINED >=", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedLessThan(String value) {
            addCriterion("IS_TRAINED <", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedLessThanOrEqualTo(String value) {
            addCriterion("IS_TRAINED <=", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedLike(String value) {
            addCriterion("IS_TRAINED like", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedNotLike(String value) {
            addCriterion("IS_TRAINED not like", value, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedIn(List<String> values) {
            addCriterion("IS_TRAINED in", values, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedNotIn(List<String> values) {
            addCriterion("IS_TRAINED not in", values, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedBetween(String value1, String value2) {
            addCriterion("IS_TRAINED between", value1, value2, "isTrained");
            return (Criteria) this;
        }

        public Criteria andIsTrainedNotBetween(String value1, String value2) {
            addCriterion("IS_TRAINED not between", value1, value2, "isTrained");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIsNull() {
            addCriterion("ACCESS_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIsNotNull() {
            addCriterion("ACCESS_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdEqualTo(String value) {
            addCriterion("ACCESS_CARD_ID =", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotEqualTo(String value) {
            addCriterion("ACCESS_CARD_ID <>", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdGreaterThan(String value) {
            addCriterion("ACCESS_CARD_ID >", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_CARD_ID >=", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdLessThan(String value) {
            addCriterion("ACCESS_CARD_ID <", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_CARD_ID <=", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdLike(String value) {
            addCriterion("ACCESS_CARD_ID like", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotLike(String value) {
            addCriterion("ACCESS_CARD_ID not like", value, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdIn(List<String> values) {
            addCriterion("ACCESS_CARD_ID in", values, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotIn(List<String> values) {
            addCriterion("ACCESS_CARD_ID not in", values, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdBetween(String value1, String value2) {
            addCriterion("ACCESS_CARD_ID between", value1, value2, "accessCardId");
            return (Criteria) this;
        }

        public Criteria andAccessCardIdNotBetween(String value1, String value2) {
            addCriterion("ACCESS_CARD_ID not between", value1, value2, "accessCardId");
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