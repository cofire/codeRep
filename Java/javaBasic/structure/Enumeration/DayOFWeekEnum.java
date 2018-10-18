package Enumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum DayOFWeekEnum {
    MONDAY("MONDAY", "星期一"), TUESDAY("TUESDAY", "星期二"), WEDNESDAY("WEDNESDAY", "星期三"), THURSDAY("THURSDAY", "星期四"), FRIDAY("FRIDAY",
            "星期五"), SATURDAY("SATURDAY", "星期六"), SUNDAY("SUNDAY", "星期六");

    private String code;
    private String name;

    private DayOFWeekEnum() {

    }

    private DayOFWeekEnum(String code, String name) {
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
        for (DayOFWeekEnum dayOFWeekEnum : DayOFWeekEnum.values()) {
            if (dayOFWeekEnum.getCode().equals(code)) {
                return dayOFWeekEnum.getName();
            }
        }
        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (DayOFWeekEnum item : DayOFWeekEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("cnName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
