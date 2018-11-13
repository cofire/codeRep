package com.cofire.controller.base;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cofire.common.EmployeeGenderEnum;
import com.cofire.common.Result;
import com.cofire.common.VisitorGenderEnum;
import com.cofire.common.VisitorStatusEnum;
import com.cofire.common.VisitorTrainedEnum;
import com.cofire.common.VisitorTypeEnum;

@Controller
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/getEnum")
    @ResponseBody
    public Result<Map<String, String>> getEnum(@RequestParam("enumName") String p_enumName) {
        Result<Map<String, String>> m_result = new Result<Map<String, String>>();
        String m_retMessage = "查询成功";
        boolean m_success = true;
        List<Map<String, String>> m_list = null;
        switch (p_enumName) {
            case "VisitorTrainedEnum":
                m_list = VisitorTrainedEnum.getCodeNameList();
                break;
            case "VisitorGenderEnum":
                m_list = VisitorGenderEnum.getCodeNameList();
                break;
            case "VisitorStatusEnum":
                m_list = VisitorStatusEnum.getCodeNameList();
                break;
            case "VisitorTypeEnum":
                m_list = VisitorTypeEnum.getCodeNameList();
                break;
            case "EmployeeGenderEnum":
                m_list = EmployeeGenderEnum.getCodeNameList();
                break;
            default:
                m_success = false;
                m_retMessage = "查询无结果";
                break;
        }
        m_result.setRetMessage(m_retMessage);
        m_result.setSuccess(m_success);
        m_result.setDataList(m_list);
        return m_result;
    }
}
