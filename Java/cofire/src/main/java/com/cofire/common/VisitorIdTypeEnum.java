package com.cofire.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum VisitorIdTypeEnum {
    IDENTITY("0", "身份证"), DRIVING("1", "驾驶证"), SOCIAL("2", "社保证"), PASSPORT("3", "护照");

    private String code;
    private String name;

    private VisitorIdTypeEnum() {

    }

    private VisitorIdTypeEnum(String code, String name) {
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
        for (VisitorIdTypeEnum visitorIdTypes : VisitorIdTypeEnum.values()) {
            if (visitorIdTypes.getCode().equals(code)) {
                return visitorIdTypes.getName();
            }
        }
        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (VisitorIdTypeEnum item : VisitorIdTypeEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("cnName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
