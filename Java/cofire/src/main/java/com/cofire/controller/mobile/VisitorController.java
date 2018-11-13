package com.cofire.controller.mobile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cofire.common.CommonConstant;
import com.cofire.common.PicFolderEnum;
import com.cofire.common.Result;
import com.cofire.common.VisitorIdTypeEnum;
import com.cofire.common.VisitorStatusEnum;
import com.cofire.common.VisitorTypeEnum;
import com.cofire.dao.domain.Employee;
import com.cofire.dao.domain.Visitor;
import com.cofire.service.IEmployeeService;
import com.cofire.service.IVisitorService;
import com.cofire.util.CommonUtils;
import com.cofire.util.DateUtils;
import com.cofire.util.UHttpServlet;

@RequestMapping("/visitor")
@Controller
public class VisitorController {

    @Value("${picRootPath}")
    private String c_picRootPath;

    @Autowired
    private IVisitorService c_visitorService;

    @Autowired
    private IEmployeeService c_employeeService;

    private Result<Visitor> c_result = new Result<Visitor>();

    private String c_retMessage;

    private boolean c_success;

    private static final Logger logger = LoggerFactory.getLogger(VisitorController.class);

    @RequestMapping("/index")
    public String visitor() {
        return "visitor";
    }

    @RequestMapping("/ordinarySave")
    @ResponseBody
    public Result<Visitor> ordinarySave(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile p_file)
            throws UnsupportedEncodingException {
        c_success = false;
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_visitor = CommonUtils.mapToBean(params, Visitor.class);
        // 非空必填判断
        if (StringUtils.isEmpty(m_visitor.getName())) {
            c_retMessage = "姓名不能为空！";
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }

        String m_uuid = CommonUtils.getUUID();

        // 照片上传处理
        if (p_file != null) {
            if (p_file.isEmpty()) {
                c_retMessage = "请上传照片！";
                c_result.setRetMessage(c_retMessage);
                c_result.setSuccess(c_success);
                return c_result;
            }

            String m_oriFileName = p_file.getOriginalFilename();
            String m_suffix = CommonUtils.getSuffix(m_oriFileName);
            String m_picUrl = CommonUtils.getPath(PicFolderEnum.VISITOR.getCode()) + m_uuid + "." + m_suffix;
            File m_dest = new File(c_picRootPath + m_picUrl);
            // 判断文件父目录是否存在
            if (!m_dest.getParentFile().exists()) {
                m_dest.getParentFile().mkdirs();
            }
            try {
                // 保存文件
                p_file.transferTo(m_dest);
                m_visitor.setPicUrl(m_picUrl);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 数据入库
        try {
            c_retMessage = "保存成功！";
            c_success = true;
            int m_res = 0;
            if (StringUtils.isEmpty(m_visitor.getdId())) {
                m_visitor.setdId(m_uuid);
                m_visitor.setStatus(VisitorStatusEnum.PREPARE.getCode());
                m_visitor.setVisitorType(VisitorTypeEnum.VISITOR.getCode());
                Date date = new Date();
                m_visitor.setCreateTime(DateUtils.dataTimeToNumber(date));
                m_res = c_visitorService.addVisotor(m_visitor);
                if (m_res == 0) {
                    c_success = false;
                    c_retMessage = "保存失败！";
                }
            } else {
                m_res = c_visitorService.updateVisitor(m_visitor);
                if (m_res == 0) {
                    c_success = false;
                    c_retMessage = "保存失败！";
                }
            }
            Visitor m_visitorRes = c_visitorService.selectByPrimaryKey(m_visitor.getdId());
            List<Visitor> m_Visitors = new ArrayList<>();
            m_Visitors.add(m_visitorRes);
            c_result.setDataList(m_Visitors);
        } catch (Exception e) {
            c_retMessage = "保存失败！";
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    /**
     * 
     * @Title: supplierSave
     * @author ly
     * @Description:供应商提交访客信息
     * @param request
     * @param p_file
     * @return
     * @throws UnsupportedEncodingException
     * @return Result<Visitor> 返回类型
     */
    @RequestMapping("/supplierSave")
    @ResponseBody
    public Result<Visitor> supplierSave(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile p_file)
            throws UnsupportedEncodingException {
        c_success = false;
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Visitor m_visitor = CommonUtils.mapToBean(params, Visitor.class);
        // 非空必填判断
        if (StringUtils.isEmpty(m_visitor.getName())) {
            c_retMessage = "姓名不能为空！";
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            return c_result;
        }

        String m_uuid = CommonUtils.getUUID();

        // 照片上传处理
        if (p_file != null) {
            if (p_file.isEmpty()) {
                c_retMessage = "请上传照片！";
                c_result.setRetMessage(c_retMessage);
                c_result.setSuccess(c_success);
                return c_result;
            }

            String m_oriFileName = p_file.getOriginalFilename();
            String m_suffix = CommonUtils.getSuffix(m_oriFileName);
            String m_picUrl = CommonUtils.getPath(PicFolderEnum.VISITOR.getCode()) + m_uuid + "." + m_suffix;
            File m_dest = new File(c_picRootPath + m_picUrl);
            // 判断文件父目录是否存在
            if (!m_dest.getParentFile().exists()) {
                m_dest.getParentFile().mkdirs();
            }
            try {
                // 保存文件
                p_file.transferTo(m_dest);
                m_visitor.setPicUrl(m_picUrl);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 数据入库
        try {
            c_retMessage = "保存成功！";
            c_success = true;
            int m_res = 0;
            if (StringUtils.isEmpty(m_visitor.getdId())) {
                m_visitor.setdId(m_uuid);
                m_visitor.setStatus(VisitorStatusEnum.PREPARE.getCode());
                m_visitor.setVisitorType(VisitorTypeEnum.CONTRACTOR.getCode());
                Date date = new Date();
                m_visitor.setCreateTime(DateUtils.dataTimeToNumber(date));
                m_res = c_visitorService.addVisotor(m_visitor);
                if (m_res == 0) {
                    c_success = false;
                    c_retMessage = "保存失败！";
                }
            } else {
                m_res = c_visitorService.updateVisitor(m_visitor);
                if (m_res == 0) {
                    c_success = false;
                    c_retMessage = "保存失败！";
                }
            }
            Visitor m_visitorRes = c_visitorService.selectByPrimaryKey(m_visitor.getdId());
            List<Visitor> m_Visitors = new ArrayList<>();
            m_Visitors.add(m_visitorRes);
            c_result.setDataList(m_Visitors);
        } catch (Exception e) {
            c_retMessage = "保存失败！";
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

    /**
     * 
     * @Title: staffSearchSave
     * @author yjb
     * @Description:员工访客信息提交查询
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     * @return Result<Visitor> 返回类型
     */
    @RequestMapping("/employeeSave")
    @ResponseBody
    public Result<Visitor> employeeSave(@RequestParam("employeeId") String p_employeeId, @RequestParam("employeeName") String p_employeeName) throws Exception {
        c_success = false;
        List<Employee> m_employees = new ArrayList<>();
        Visitor m_visitor = new Visitor();
        if (StringUtils.isEmpty(p_employeeId) || StringUtils.isEmpty(p_employeeName)) {
            c_retMessage = "员工姓名和编号都不能为空！";
            c_result.setRetMessage(c_retMessage);
            c_result.setSuccess(c_success);
            c_result.setDataList(null);
            return c_result;
        } else {
            try {
                int m_res = 0;
                m_employees = c_employeeService.selectByIdAndName(p_employeeId, p_employeeName);
                c_result.setTotal(m_employees.size());
                c_success = true;
                c_retMessage = "查询成功";
                if (c_result.getTotal() == 0) {
                    c_success = false;
                    c_retMessage = "员工姓名或员工编号错误";
                }
                String m_uuid = CommonUtils.getUUID();
                if (StringUtils.isEmpty(m_visitor.getdId())) {
                    for (Employee employee : m_employees) {
                        m_visitor.setdId(m_uuid);
                        m_visitor.setName(employee.getEmployeeName());
                        m_visitor.setPhone(employee.getEmployeePhone());
                        m_visitor.setIdCard(employee.getEmployeeIdCard());
                        m_visitor.setIdType(VisitorIdTypeEnum.IDENTITY.getCode());
                        m_visitor.setGender(employee.getEmployeeGender());
                        m_visitor.setVisitedDept(employee.getEmployeeDept());
                        m_visitor.setStatus(VisitorStatusEnum.PREPARE.getCode());
                        Date date = new Date();
                        m_visitor.setCreateTime(DateUtils.dataTimeToNumber(date));
                        m_visitor.setVisitorType(VisitorTypeEnum.STAFF.getCode());
                        m_visitor.setPicUrl(employee.getPicUrl());
                        m_res = c_visitorService.addVisotor(m_visitor);
                        c_success = true;
                        c_retMessage = "保存成功";
                        if (m_res == 0) {
                            c_success = false;
                            c_retMessage = "保存失败！";
                        }
                    }
                } else {
                    m_res = c_visitorService.updateVisitor(m_visitor);
                    if (m_res == 0) {
                        c_success = false;
                        c_retMessage = "保存失败！";
                    }
                }
                Visitor m_visitorRes = c_visitorService.selectByPrimaryKey(m_visitor.getdId());
                List<Visitor> m_Visitors = new ArrayList<>();
                m_Visitors.add(m_visitorRes);
                c_result.setDataList(m_Visitors);
            } catch (Exception e) {
                c_success = false;
                c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
                logger.error("查询失败：", e);
            }
        }
        c_result.setRetMessage(c_retMessage);
        c_result.setSuccess(c_success);
        return c_result;
    }

}
