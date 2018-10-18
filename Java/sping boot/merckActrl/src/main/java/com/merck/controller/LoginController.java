package com.merck.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.merck.dao.domain.User;
import com.merck.filter.WebSecurityConfig;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loginVerify")
    public String loginVerify(String username, String password, HttpSession session) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);

        // boolean verify = loginService.verifyLogin(user);
        boolean verify = true;
        if (verify) {
            session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
            return "index";
        } else {
            return "redirect:/login";
        }
    }
}
