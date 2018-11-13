package com.cofire.dao.domain;

/**
 * @数表名称 tb_visitor
 * @开发日期 2018-11-13
 * @开发作者 by:ly 
 */
public class Visitor {
    /** ID (主健ID) (无默认值) */
    private String dId;

    /** 姓名 (无默认值) */
    private String name;

    /** 手机号 (无默认值) */
    private String phone;

    /** 证件号 (无默认值) */
    private String idCard;

    /** 证件类型：0-身份证；1-驾驶证；2-社保证；3-护照； (无默认值) */
    private String idType;

    /** 性别：0-女；1-男;2-其他 (无默认值) */
    private String gender;

    /** 访问人 (无默认值) */
    private String visitedPerson;

    /** 访问部门 (无默认值) */
    private String visitedDept;

    /** 状态：0-入场申请；1-入场；2-离场 (无默认值) */
    private String status;

    /** 提交时间 (无默认值) */
    private String createTime;

    /** 入场时间 (无默认值) */
    private String inTime;

    /** 离场时间 (无默认值) */
    private String outTime;

    /** 照片URL (无默认值) */
    private String picUrl;

    /** 访客类型：0-访客；1-承包商；2-员工 (无默认值) */
    private String visitorType;

    /** 是否已培训：0-否；1-是； (无默认值) */
    private String isTrained;

    /** 发放卡号 (无默认值) */
    private String accessCardId;

    /** 预留字段 (无默认值) */
    private String filler1;

    /** 预留字段 (无默认值) */
    private String filler2;

    /** 预留字段 (无默认值) */
    private String filler3;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getVisitedPerson() {
        return visitedPerson;
    }

    public void setVisitedPerson(String visitedPerson) {
        this.visitedPerson = visitedPerson == null ? null : visitedPerson.trim();
    }

    public String getVisitedDept() {
        return visitedDept;
    }

    public void setVisitedDept(String visitedDept) {
        this.visitedDept = visitedDept == null ? null : visitedDept.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime == null ? null : inTime.trim();
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime == null ? null : outTime.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType == null ? null : visitorType.trim();
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained == null ? null : isTrained.trim();
    }

    public String getAccessCardId() {
        return accessCardId;
    }

    public void setAccessCardId(String accessCardId) {
        this.accessCardId = accessCardId == null ? null : accessCardId.trim();
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1 == null ? null : filler1.trim();
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2 == null ? null : filler2.trim();
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3 == null ? null : filler3.trim();
    }
}