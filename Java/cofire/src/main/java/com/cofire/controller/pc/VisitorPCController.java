package com.cofire.controller.pc;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cofire.common.CommonConstant;
import com.cofire.common.Result;
import com.cofire.dao.domain.Visitor;
import com.cofire.service.IVisitorService;
import com.cofire.util.CommonUtils;
import com.cofire.util.HttpUtil;
import com.cofire.util.UHttpServlet;

@RequestMapping("/pcVisitor")
@Controller
public class VisitorPCController {

    private static final Logger logger = LoggerFactory.getLogger(VisitorPCController.class);

    @Autowired
    private IVisitorService c_visitorService;

    private Result<Map<String, String>> c_result = new Result<Map<String, String>>();

    private String c_retMessage;

    private boolean c_success;

    @RequestMapping(value = "/dayRecords", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Visitor> dayVisitor(HttpServletRequest request, @RequestParam("pageNo") Integer p_pageNo, @RequestParam("pageSize") Integer p_pageSize)
            throws Exception {
        c_success = false;
        Result<Visitor> m_result = new Result<Visitor>();
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_Visitor = CommonUtils.mapToBean(params, Visitor.class);
        List<Visitor> m_visitors = new ArrayList<>();
        try {
            m_visitors = c_visitorService.selectVisitorByDayPage(m_Visitor, p_pageNo, p_pageSize);
            m_result.setDataList(m_visitors);
            m_result.setTotal(c_visitorService.selectVisitorByDay(m_Visitor).size());
            c_success = true;
            c_retMessage = "查询成功";
            if (m_result.getTotal() == 0) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;

    }

    @RequestMapping(value = "/historyRecords", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Visitor> historyVisitor(HttpServletRequest request, @RequestParam("pageNo") Integer p_pageNo, @RequestParam("pageSize") Integer p_pageSize)
            throws Exception {
        c_success = false;
        Result<Visitor> m_result = new Result<Visitor>();
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_Visitor = CommonUtils.mapToBean(params, Visitor.class);
        List<Visitor> m_visitors = new ArrayList<>();
        try {
            m_visitors = c_visitorService.selectVisitorByHistoryPage(m_Visitor, p_pageNo, p_pageSize);
            m_result.setDataList(m_visitors);
            m_result.setTotal(c_visitorService.selectVisitorByHistory(m_Visitor).size());
            c_success = true;
            c_retMessage = "查询成功";
            if (m_result.getTotal() == 0) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;

    }

    @RequestMapping(value = "/detail", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Visitor> oneVisitor(@RequestParam("dId") String p_dId) {
        c_success = false;
        Result<Visitor> m_result = new Result<Visitor>();
        Visitor m_visitor = new Visitor();
        try {
            if (p_dId == "") {
                c_retMessage = "id不能为空";
                m_result.setRetMessage(c_retMessage);
                m_result.setData(null);
                return m_result;
            }
            m_visitor = c_visitorService.selectByPrimaryKey(p_dId);
            List<Visitor> m_visitorList = new ArrayList<>();
            m_visitorList.add(m_visitor);
            m_result.setDataList(m_visitorList);
            c_success = true;
            c_retMessage = "查询成功";
            if (StringUtils.isEmpty(m_visitor)) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;
    }

    @RequestMapping(value = "/enter", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> enter(@RequestParam("accessCardId") String p_accessCardId, HttpServletRequest request)
            throws UnsupportedEncodingException {
        c_success = false;
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_visitor = CommonUtils.mapToBean(params, Visitor.class);
        if (m_visitor.getdId() == null) {
            c_retMessage = "未登记访客！";
            c_success = false;
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }
        if (StringUtils.isEmpty(m_visitor.getAccessCardId())) {
            c_retMessage = "未输入门禁卡号";
            c_success = false;
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }
        try {
            c_retMessage = "发卡入场成功！";
            c_success = true;
            m_visitor.setAccessCardId(p_accessCardId);
            m_visitor.setStatus("1");
            int m_res = c_visitorService.issueAccessCard(m_visitor);
            if (m_res == 0) {
                c_retMessage = "发卡入场失败！";
                c_success = false;
            }
        } catch (Exception e) {
            c_retMessage = "发卡入场失败！";
            c_success = false;
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/exit", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Map<String, String>> exit(HttpServletRequest request) throws UnsupportedEncodingException {
        c_success = false;
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_visitor = CommonUtils.mapToBean(params, Visitor.class);
        if (m_visitor.getdId() == null) {
            c_retMessage = "未登记访客！";
            c_success = false;
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }
        try {
            c_retMessage = "还卡离场成功！";
            c_success = true;
            m_visitor.setStatus("2");
            int m_res = c_visitorService.visitorleaving(m_visitor);
            if (m_res == 0) {
                c_retMessage = "还卡离场失败！";
                c_success = false;
            }
        } catch (Exception e) {
            c_retMessage = "还卡离场失败！";
            c_success = false;
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    @RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Visitor> delete(@RequestParam("dId") String p_dId) throws Exception {
        c_success = false;
        Result<Visitor> m_result = new Result<Visitor>();
        if (StringUtils.isEmpty(p_dId)) {
            c_retMessage = "未输入访客编号！";
            c_success = false;
            m_result.setRetMessage(c_retMessage);
            m_result.setSuccess(c_success);
            return m_result;
        }
        try {
            c_retMessage = "访客信息删除成功！";
            c_success = true;
            int m_res = c_visitorService.deleteByPrimaryKey(p_dId);
            if (m_res == 0) {
                c_retMessage = "信息删除失败！";
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("删除失败：", e);
            c_success = false;
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;
    }

    @RequestMapping(value = "/sendPost", method = { RequestMethod.POST })
    @ResponseBody
    public String sendPost(@RequestParam("accessCardId") String p_accessCardId, HttpServletRequest request) throws Exception {
        String url = "http://localhost:8081/merckDm/visitor/save";
        // HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        // Visitor m_visitor = CommonUtils.mapToBean(params, Visitor.class);
        // m_visitor.setAccessCardId(p_accessCardId);
        return HttpUtil.httpPost(url, p_accessCardId);

    }
}
