package com.cofire.dao.domain;

/**
 * @数表名称 tb_employee
 * @开发日期 2018-11-13
 * @开发作者 by:ly 
 */
public class Employee {
    /** 员工编号 (主健ID) (无默认值) */
    private String employeeId;

    /** 员工姓名 (无默认值) */
    private String employeeName;

    /** 年龄 (无默认值) */
    private Integer employeeAge;

    /** 性别:0-女；1-男;2-其他 (无默认值) */
    private String employeeGender;

    /** 身份证号 (无默认值) */
    private String employeeIdCard;

    /** 手机号 (无默认值) */
    private String employeePhone;

    /** 所属部门 (无默认值) */
    private String employeeDept;

    /** 职位信息 (无默认值) */
    private String employeeInfo;

    /** 入职时间 (无默认值) */
    private String entryTime;

    /** 离职时间 (无默认值) */
    private String leaveTime;

    /** 照片URL (无默认值) */
    private String picUrl;

    /** 审核状态：0-待审核，1-审核通过，2-审核拒绝 (无默认值) */
    private String checkStatus;

    /**  (无默认值) */
    private String checkMessage;

    /** 预留字段 (无默认值) */
    private String filler1;

    /** 预留字段 (无默认值) */
    private String filler2;

    /** 预留字段 (无默认值) */
    private String filler3;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender == null ? null : employeeGender.trim();
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard == null ? null : employeeIdCard.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept == null ? null : employeeDept.trim();
    }

    public String getEmployeeInfo() {
        return employeeInfo;
    }

    public void setEmployeeInfo(String employeeInfo) {
        this.employeeInfo = employeeInfo == null ? null : employeeInfo.trim();
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime == null ? null : entryTime.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getCheckMessage() {
        return checkMessage;
    }

    public void setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage == null ? null : checkMessage.trim();
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