package com.cofire.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 员工审核状态枚举类
 * 
 * @ClassName:EmployeeCheckStatusEnum
 * @Description:
 * @author mc
 * @date 2018-10-24
 *
 */
public enum EmployeeCheckStatusEnum {
    UNAPPROVED("0", "未经审核"), APPROVED("1", "员工信息审核通过"), NOTAPPROVED("2", "员工信息审核不通过");

    private String code;
    private String name;

    private EmployeeCheckStatusEnum() {

    }

    private EmployeeCheckStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(String code) {
        for (EmployeeCheckStatusEnum employeeCheckStatus : EmployeeCheckStatusEnum.values()) {
            if (employeeCheckStatus.getCode().equals(code)) {
                return employeeCheckStatus.getName();
            }
        }
        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (EmployeeCheckStatusEnum item : EmployeeCheckStatusEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("nzName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
