package com.cofire.dao.domain;

/**
 * @数表名称 tb_sysparam
 * @开发日期 2018-11-13
 * @开发作者 by:ly 
 */
public class Sysparam {
    /** 段号 (主健ID)(必填项) (无默认值) */
    private String paramgroupId;

    /** 参数ID(必填项) (主健ID) (无默认值) */
    private String paramId;

    /** 参数值 (无默认值) */
    private String paramVal;

    /** 参数名 (无默认值) */
    private String paramName;

    /** 是否可修改 (无默认值) */
    private String ifCanmodify;

    /** 备注 (无默认值) */
    private String remark;

    /** 最后修改时间 (无默认值) */
    private String modifyTime;

    /** 最后修改人 (无默认值) */
    private String modifyUser;

    /** 预留字段1 (无默认值) */
    private String filler1;

    /** 预留字段2 (无默认值) */
    private String filler2;

    /** 预留字段3 (无默认值) */
    private String filler3;

    /** 预留字段4 (无默认值) */
    private String filler4;

    public String getParamgroupId() {
        return paramgroupId;
    }

    public void setParamgroupId(String paramgroupId) {
        this.paramgroupId = paramgroupId == null ? null : paramgroupId.trim();
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    public String getParamVal() {
        return paramVal;
    }

    public void setParamVal(String paramVal) {
        this.paramVal = paramVal == null ? null : paramVal.trim();
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getIfCanmodify() {
        return ifCanmodify;
    }

    public void setIfCanmodify(String ifCanmodify) {
        this.ifCanmodify = ifCanmodify == null ? null : ifCanmodify.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
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

    public String getFiller4() {
        return filler4;
    }

    public void setFiller4(String filler4) {
        this.filler4 = filler4 == null ? null : filler4.trim();
    }
}