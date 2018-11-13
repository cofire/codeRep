package com.cofire.controller.pc;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cofire.common.CommonConstant;
import com.cofire.common.CurrentLoginUserMap;
import com.cofire.common.Result;
import com.cofire.dao.domain.User;
import com.cofire.service.IUserService;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IUserService c_userService;

    private Result<Map<String, String>> c_result = new Result<Map<String, String>>();

    private String c_retMessage;

    private boolean c_success;

    @RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> login(@RequestParam("userName") String p_userName, @RequestParam("password") String p_password, HttpSession session) {
        c_success = false;
        if (StringUtils.isEmpty(p_userName) || StringUtils.isEmpty(p_password)) {
            c_retMessage = "账号和密码都不能为空！";
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }
        // TODO
        // 密码加密解密
        User m_user = new User();
        try {
            m_user = c_userService.selectUserByUserNameAndPwd(p_userName, p_password);
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("用户查询失败：", e);
        }
        if (m_user == null) {
            c_retMessage = "账号或密码错误";
        } else {

            // 检查当前请求登录的session是否在currentLoginMap中存在，并进行相关操作
            CurrentLoginUserMap.checkCurrentLoginUser(m_user.getUserName(), session);
            session.setAttribute("user", m_user);// 保存x`登录的
            c_success = true;
            c_retMessage = "登陆成功";
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    /**
     * 
     * @Title: loginOut
     * @author ly
     * @Description:系统登出接口
     * @param @param session
     * @param @return 参数
     * @return Result<Map<String,String>> 返回类型
     */
    @RequestMapping(value = "/loginOut", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> loginOut(HttpSession session) {
        c_success = false;
        c_retMessage = "登出失败";
        User loginUser = null;
        try {
            loginUser = (User) session.getAttribute("user");
            if (loginUser != null) {
                c_success = true;
                c_retMessage = "登出成功";
            }
            // 移除所有Session中的键值
            session.removeAttribute("user");
        } catch (Exception e) {
            logger.error("记录登出日志出错！", e);
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }
}
