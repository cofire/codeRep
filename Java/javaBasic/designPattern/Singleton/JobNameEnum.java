package Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum JobNameEnum {
    MATCHING_ASSET("MATCHING_ASSET", "投资金额匹配资产"), FILL_ASSET("FILL_ASSET", "超级债权人补标"), REPEAT_INVEST("REPEAT_INVEST", "复投"), QUIT_PLAN("QUIT_PLAN",
            "投资人退出计划"), ACCEPT_DEBT("ACCEPT_DEBT", "超级债权人接收未匹配债转"), LIQUIDATION_INCOME("LIQUIDATION_INCOME", "清算投资人收益");
    private String code;
    private String name;

    private JobNameEnum() {
    }

    private JobNameEnum(String code, String name) {
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

    public void setName(String word) {
        this.name = word;
    }

    public static String getName(String code) {

        for (JobNameEnum item : JobNameEnum.values()) {
            if (item.getCode().equals(code)) {
                return item.getName();
            }
        }

        return null;
    }

    public static List<Map<String, String>> getCodeNameList() {
        List<Map<String, String>> m_list = new ArrayList<>();
        Map<String, String> m_map = null;
        for (JobNameEnum item : JobNameEnum.values()) {
            m_map = new HashMap<>();
            m_map.put("code", item.getCode());
            m_map.put("cnName", item.getName());
            m_list.add(m_map);
        }
        return m_list;
    }
}
