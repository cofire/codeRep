package com.cofire.controller.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/visitor")
@Controller
public class VisitorPageController {

    /**
     * 
     * @Title: choose
     * @author ly
     * @Description:选择访客类型页面
     * @return
     * @return String 返回类型
     */
    @RequestMapping("/choose")
    public String choose() {
        return "choose";
    }

    /**
     * 
     * @Title: ordinary
     * @author ly
     * @Description:普通访客页面
     * @return
     * @return String 返回类型
     */
    @RequestMapping("/ordinary")
    public String ordinary() {
        return "ordinary";
    }

    /**
     * 
     * @Title: supplier
     * @author ly
     * @Description:供应商访客页面
     * @return
     * @return String 返回类型
     */
    @RequestMapping("/supplier")
    public String supplier() {
        return "supplier";
    }

    /**
     * 
     * @Title: employee
     * @author ly
     * @Description:员工访客页面
     * @return
     * @return String 返回类型
     */
    @RequestMapping("/employee")
    public String employee() {
        return "employee";
    }

    /**
     * 
     * @Title: result
     * @author mc
     * @Description:结果页面
     * @return
     * @return String 返回类型
     */
    @RequestMapping(value = "/result", method = { RequestMethod.GET })
    public String result() {
        return "result";
    }

    /**
     * 
     * @Title: webSocket
     * @author ly
     * @Description:webSocket推送功能
     * @return
     * @return String 返回类型
     */
    @RequestMapping(value = "/webSocket", method = { RequestMethod.GET })
    public String webSocket() {
        return "webSocket";
    }

}
