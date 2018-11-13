package com.cofire.dao.domain;

/**
 * @数表名称 tb_user
 * @开发日期 2018-11-13
 * @开发作者 by:ly 
 */
public class User {
    /** 用户名称 (主健ID) (无默认值) */
    private String userName;

    /** 密码 (无默认值) */
    private String passwd;

    /** 预留字段 (无默认值) */
    private String filler1;

    /** 预留字段 (无默认值) */
    private String filler2;

    /** 预留字段 (无默认值) */
    private String filler3;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
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