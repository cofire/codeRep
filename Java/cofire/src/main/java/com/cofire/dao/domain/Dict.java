package com.cofire.dao.domain;

/**
 * @数表名称 tb_dict
 * @开发日期 2018-11-13
 * @开发作者 by:ly 
 */
public class Dict {
    /** 段号 (主健ID)(必填项) (无默认值) */
    private String groupId;

    /** 参数号(必填项) (主健ID) (无默认值) */
    private String dictValue;

    /** 段名 (无默认值) */
    private String groupName;

    /** 参数名 (无默认值) */
    private String dictName;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
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