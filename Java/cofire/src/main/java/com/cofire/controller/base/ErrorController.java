package com.cofire.controller.base;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cofire.common.Result;

@Controller
@RequestMapping("/error")
public class ErrorController {
    private Result<Map<String, String>> c_result = new Result<Map<String, String>>();

    private String c_retMessage;

    private boolean c_success = false;

    @RequestMapping(value = "/400", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> error400() {
        c_retMessage = "HTTP 400 错误 - 请求无效";
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/401", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> error401() {
        c_retMessage = " HTTP 401 错误 - 未授权";
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/404", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> error404() {
        c_retMessage = " HTTP 404 错误 - 页面未找到";
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/500", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> error500() {
        c_retMessage = " HTTP 500 错误 - 服务器出错";
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/notLogin", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> notLogin() {
        c_retMessage = " 未登录或登录超时，请重新登录！";
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }
}
