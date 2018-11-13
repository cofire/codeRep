package com.cofire.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum PicFolderEnum {
    VISITOR("visitor", "访客照片目录"), EMPLOYEE("employee", "员工照片目录");

    private String code;
    private String name;

    private PicFolderEnum() {

    }

    private PicFolderEnum(String code, String name) {
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
        for (PicFolderEnum picFolder : PicFolderEnum.values()) {
            if (picFolder.getCode().equals(code)) {
                return picFolder.getName();
            }
        }
        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (PicFolderEnum item : PicFolderEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("cnName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
