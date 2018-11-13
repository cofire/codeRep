package com.cofire.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 访客状态枚举类
 * 
 * @ClassName: VisitorStatusEnum
 * @Description:
 * @author ly
 * @date 2018年10月23日
 *
 */
public enum VisitorStatusEnum {
    PREPARE("0", "入场申请"), EXIT("1", "入场"), ENTER("2", "离场");

    private String code;
    private String name;

    private VisitorStatusEnum() {

    }

    private VisitorStatusEnum(String code, String name) {
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
        for (VisitorStatusEnum visitorStatus : VisitorStatusEnum.values()) {
            if (visitorStatus.getCode().equals(code)) {
                return visitorStatus.getName();
            }
        }
        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (VisitorStatusEnum item : VisitorStatusEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("cnName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
