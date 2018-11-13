package com.cofire.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class SysparamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public SysparamExample() {
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

        public Criteria andParamgroupIdIsNull() {
            addCriterion("PARAMGROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdIsNotNull() {
            addCriterion("PARAMGROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdEqualTo(String value) {
            addCriterion("PARAMGROUP_ID =", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdNotEqualTo(String value) {
            addCriterion("PARAMGROUP_ID <>", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdGreaterThan(String value) {
            addCriterion("PARAMGROUP_ID >", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMGROUP_ID >=", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdLessThan(String value) {
            addCriterion("PARAMGROUP_ID <", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdLessThanOrEqualTo(String value) {
            addCriterion("PARAMGROUP_ID <=", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdLike(String value) {
            addCriterion("PARAMGROUP_ID like", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdNotLike(String value) {
            addCriterion("PARAMGROUP_ID not like", value, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdIn(List<String> values) {
            addCriterion("PARAMGROUP_ID in", values, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdNotIn(List<String> values) {
            addCriterion("PARAMGROUP_ID not in", values, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdBetween(String value1, String value2) {
            addCriterion("PARAMGROUP_ID between", value1, value2, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamgroupIdNotBetween(String value1, String value2) {
            addCriterion("PARAMGROUP_ID not between", value1, value2, "paramgroupId");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNull() {
            addCriterion("PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNotNull() {
            addCriterion("PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParamIdEqualTo(String value) {
            addCriterion("PARAM_ID =", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotEqualTo(String value) {
            addCriterion("PARAM_ID <>", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThan(String value) {
            addCriterion("PARAM_ID >", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_ID >=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThan(String value) {
            addCriterion("PARAM_ID <", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThanOrEqualTo(String value) {
            addCriterion("PARAM_ID <=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLike(String value) {
            addCriterion("PARAM_ID like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotLike(String value) {
            addCriterion("PARAM_ID not like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdIn(List<String> values) {
            addCriterion("PARAM_ID in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotIn(List<String> values) {
            addCriterion("PARAM_ID not in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdBetween(String value1, String value2) {
            addCriterion("PARAM_ID between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotBetween(String value1, String value2) {
            addCriterion("PARAM_ID not between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamValIsNull() {
            addCriterion("PARAM_VAL is null");
            return (Criteria) this;
        }

        public Criteria andParamValIsNotNull() {
            addCriterion("PARAM_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andParamValEqualTo(String value) {
            addCriterion("PARAM_VAL =", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValNotEqualTo(String value) {
            addCriterion("PARAM_VAL <>", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValGreaterThan(String value) {
            addCriterion("PARAM_VAL >", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_VAL >=", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValLessThan(String value) {
            addCriterion("PARAM_VAL <", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValLessThanOrEqualTo(String value) {
            addCriterion("PARAM_VAL <=", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValLike(String value) {
            addCriterion("PARAM_VAL like", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValNotLike(String value) {
            addCriterion("PARAM_VAL not like", value, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValIn(List<String> values) {
            addCriterion("PARAM_VAL in", values, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValNotIn(List<String> values) {
            addCriterion("PARAM_VAL not in", values, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValBetween(String value1, String value2) {
            addCriterion("PARAM_VAL between", value1, value2, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamValNotBetween(String value1, String value2) {
            addCriterion("PARAM_VAL not between", value1, value2, "paramVal");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNull() {
            addCriterion("PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNotNull() {
            addCriterion("PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamNameEqualTo(String value) {
            addCriterion("PARAM_NAME =", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotEqualTo(String value) {
            addCriterion("PARAM_NAME <>", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThan(String value) {
            addCriterion("PARAM_NAME >", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME >=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThan(String value) {
            addCriterion("PARAM_NAME <", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME <=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLike(String value) {
            addCriterion("PARAM_NAME like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotLike(String value) {
            addCriterion("PARAM_NAME not like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameIn(List<String> values) {
            addCriterion("PARAM_NAME in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotIn(List<String> values) {
            addCriterion("PARAM_NAME not in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameBetween(String value1, String value2) {
            addCriterion("PARAM_NAME between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotBetween(String value1, String value2) {
            addCriterion("PARAM_NAME not between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyIsNull() {
            addCriterion("IF_CANMODIFY is null");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyIsNotNull() {
            addCriterion("IF_CANMODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyEqualTo(String value) {
            addCriterion("IF_CANMODIFY =", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyNotEqualTo(String value) {
            addCriterion("IF_CANMODIFY <>", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyGreaterThan(String value) {
            addCriterion("IF_CANMODIFY >", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyGreaterThanOrEqualTo(String value) {
            addCriterion("IF_CANMODIFY >=", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyLessThan(String value) {
            addCriterion("IF_CANMODIFY <", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyLessThanOrEqualTo(String value) {
            addCriterion("IF_CANMODIFY <=", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyLike(String value) {
            addCriterion("IF_CANMODIFY like", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyNotLike(String value) {
            addCriterion("IF_CANMODIFY not like", value, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyIn(List<String> values) {
            addCriterion("IF_CANMODIFY in", values, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyNotIn(List<String> values) {
            addCriterion("IF_CANMODIFY not in", values, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyBetween(String value1, String value2) {
            addCriterion("IF_CANMODIFY between", value1, value2, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andIfCanmodifyNotBetween(String value1, String value2) {
            addCriterion("IF_CANMODIFY not between", value1, value2, "ifCanmodify");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("MODIFY_TIME like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("MODIFY_TIME not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("MODIFY_USER like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("MODIFY_USER not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
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

        public Criteria andFiller4IsNull() {
            addCriterion("FILLER4 is null");
            return (Criteria) this;
        }

        public Criteria andFiller4IsNotNull() {
            addCriterion("FILLER4 is not null");
            return (Criteria) this;
        }

        public Criteria andFiller4EqualTo(String value) {
            addCriterion("FILLER4 =", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4NotEqualTo(String value) {
            addCriterion("FILLER4 <>", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4GreaterThan(String value) {
            addCriterion("FILLER4 >", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4GreaterThanOrEqualTo(String value) {
            addCriterion("FILLER4 >=", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4LessThan(String value) {
            addCriterion("FILLER4 <", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4LessThanOrEqualTo(String value) {
            addCriterion("FILLER4 <=", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4Like(String value) {
            addCriterion("FILLER4 like", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4NotLike(String value) {
            addCriterion("FILLER4 not like", value, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4In(List<String> values) {
            addCriterion("FILLER4 in", values, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4NotIn(List<String> values) {
            addCriterion("FILLER4 not in", values, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4Between(String value1, String value2) {
            addCriterion("FILLER4 between", value1, value2, "filler4");
            return (Criteria) this;
        }

        public Criteria andFiller4NotBetween(String value1, String value2) {
            addCriterion("FILLER4 not between", value1, value2, "filler4");
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