package com.cofire.controller.pc;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cofire.common.CommonConstant;
import com.cofire.common.EmployeeCheckStatusEnum;
import com.cofire.common.PicFolderEnum;
import com.cofire.common.Result;
import com.cofire.dao.domain.Employee;
import com.cofire.service.IEmployeeService;
import com.cofire.util.CommonUtils;
import com.cofire.util.UHttpServlet;

@RequestMapping("/pcEmployee")
@Controller
public class EmployeeController {

    @Value("${picRootPath}")
    private String c_picRootPath;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IEmployeeService c_employeeService;

    private String c_retMessage;

    private boolean c_success;

    @RequestMapping(value = "/detail", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Employee> detail(@RequestParam("employeeId") String p_employeeId) {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        if (StringUtils.isEmpty(p_employeeId)) {
            c_retMessage = "未输入员工编号！";
            c_success = false;
            m_result.setRetMessage(c_retMessage);
            m_result.setSuccess(c_success);
            return m_result;
        }
        Employee m_employee = null;
        try {
            c_retMessage = "单个员工信息查询成功！";
            c_success = true;
            m_employee = c_employeeService.selectEmployeeByEmployeeId(p_employeeId);
            if (m_employee == null) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
            c_success = false;
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        m_result.setData(m_employee);
        return m_result;
    }

    @RequestMapping(value = "/query", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Employee> query(@RequestParam("pageNo") Integer p_pageNo, @RequestParam("pageSize") Integer p_pageSize, HttpServletRequest request)
            throws UnsupportedEncodingException {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Employee m_employee = CommonUtils.mapToBean(params, Employee.class);
        List<Employee> m_dataList = null;
        int m_count = 0;
        if (StringUtils.isEmpty(p_pageNo.toString())) {
            p_pageNo = 1;
        }
        if (StringUtils.isEmpty(p_pageSize.toString())) {
            p_pageSize = 5;
        }
        try {
            c_retMessage = "查询成功！";
            c_success = true;
            m_dataList = c_employeeService.selectEmployeeByConditions(m_employee, p_pageNo, p_pageSize);
            m_count = c_employeeService.countSelectEmployeeByConditions(m_employee);
            if (m_dataList == null) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
            c_success = false;
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        m_result.setDataList(m_dataList);
        m_result.setTotal(m_count);
        return m_result;
    }

    @RequestMapping("/uploadPic")
    @ResponseBody
    public Result<Employee> uploadPicture(@RequestParam(value = "file", required = false) MultipartFile p_file) {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        String m_uuid = CommonUtils.getUUID();
        // 照片上传处理
        if (p_file != null) {
            if (p_file.isEmpty()) {
                c_retMessage = "请上传照片！";
                m_result.setRetMessage(c_retMessage);
                m_result.setSuccess(c_success);
                return m_result;
            }

            String m_oriFileName = p_file.getOriginalFilename();
            String m_suffix = CommonUtils.getSuffix(m_oriFileName);
            String m_picUrl = CommonUtils.getPath(PicFolderEnum.EMPLOYEE.getCode()) + m_uuid + "." + m_suffix;
            File m_dest = new File(c_picRootPath + m_picUrl);
            // 判断文件父目录是否存在
            if (!m_dest.getParentFile().exists()) {
                m_dest.getParentFile().mkdirs();
            }
            try {
                // 保存文件
                p_file.transferTo(m_dest);
                // m_employee.setPicUrl(m_picUrl);
                m_result.setRetMessage("上传图片成功");
                m_result.setSuccess(true);
                m_result.setData(m_picUrl);
                return m_result;
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    @RequestMapping("/save")
    @ResponseBody
    public Result<Employee> employeeSave(HttpServletRequest request) throws Exception {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Employee m_employee = CommonUtils.mapToBean(params, Employee.class);
        // 非空必填判断
        if (StringUtils.isEmpty(m_employee.getEmployeeName()) || StringUtils.isEmpty(m_employee.getEmployeeId())
                || StringUtils.isEmpty(m_employee.getEmployeeGender()) || StringUtils.isEmpty(m_employee.getEmployeeAge().toString())
                || StringUtils.isEmpty(m_employee.getEmployeeIdCard())) {
            c_retMessage = "员工信息不能为空！";
            m_result.setRetMessage(c_retMessage);
            m_result.setSuccess(c_success);
            return m_result;
        }

        // 数据入库
        try {
            c_retMessage = "保存成功！";
            c_success = true;
            int m_res = 0;
            if (!StringUtils.isEmpty(m_employee.getEmployeeId())) {
                if (c_employeeService.selectEmployeeByEmployeeId(m_employee.getEmployeeId()) != null) {
                    if (StringUtils.equals("edit", params.get("saveFlag"))) {
                        m_employee.setCheckStatus("0");
                        m_res = c_employeeService.updateEmployee(m_employee);
                        c_retMessage = "更新成功";
                        if (m_res == 0) {
                            c_success = false;
                            c_retMessage = "保存失败！";
                        }
                    } else if (StringUtils.equals("add", params.get("saveFlag"))) {
                        c_success = false;
                        c_retMessage = "该员工编号已占用，请确认输入信息无误！";
                    }
                } else {
                    m_employee.setCheckStatus("0");
                    m_res = c_employeeService.addEmployee(m_employee);
                    if (m_res == 0) {
                        c_success = false;
                        c_retMessage = "保存失败！";
                    }
                }
            }
            Employee m_employeeRes = c_employeeService.selectEmployeeByEmployeeId(m_employee.getEmployeeId());
            List<Employee> m_Employees = new ArrayList<>();
            m_Employees.add(m_employeeRes);
            m_result.setDataList(m_Employees);
        } catch (Exception e) {
            c_retMessage = "保存失败！";
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;
    }

    // @RequestMapping("/save")
    // @ResponseBody
    // public Result<Employee> employeeSave(HttpServletRequest request, @RequestParam(value = "file", required = false)
    // MultipartFile p_file) throws Exception {
    // c_success = false;
    // Result<Employee> m_result = new Result<Employee>();
    // HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
    // Employee m_employee = CommonUtils.mapToBean(params, Employee.class);
    // // 非空必填判断
    // if (StringUtils.isEmpty(m_employee.getEmployeeName()) || StringUtils.isEmpty(m_employee.getEmployeeId())
    // || StringUtils.isEmpty(m_employee.getEmployeeGender()) ||
    // StringUtils.isEmpty(m_employee.getEmployeeAge().toString())
    // || StringUtils.isEmpty(m_employee.getEmployeeIdCard())) {
    // c_retMessage = "员工信息不能为空！";
    // m_result.setRetMessage(c_retMessage);
    // m_result.setSuccess(c_success);
    // return m_result;
    // }
    // // 照片上传处理
    // if (p_file != null) {
    // if (p_file.isEmpty()) {
    // c_retMessage = "请上传照片！";
    // m_result.setRetMessage(c_retMessage);
    // m_result.setSuccess(c_success);
    // return m_result;
    // }
    //
    // String m_oriFileName = p_file.getOriginalFilename();
    // String m_suffix = CommonUtils.getSuffix(m_oriFileName);
    // String m_picUrl = CommonUtils.getPath(PicFolderEnum.EMPLOYEE.getCode()) + m_employee.getEmployeeId() + "." +
    // m_suffix;
    // File m_dest = new File(c_picRootPath + m_picUrl);
    // // 判断文件父目录是否存在
    // if (!m_dest.getParentFile().exists()) {
    // m_dest.getParentFile().mkdirs();
    // }
    // try {
    // // 保存文件
    // p_file.transferTo(m_dest);
    // m_employee.setPicUrl(m_picUrl);
    // } catch (IllegalStateException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    // // 数据入库
    // try {
    // c_retMessage = "保存成功！";
    // c_success = true;
    // int m_res = 0;
    // if (!StringUtils.isEmpty(m_employee.getEmployeeId())) {
    // if (c_employeeService.selectEmployeeByEmployeeId(m_employee.getEmployeeId()) != null) {
    // m_employee.setCheckStatus("0");
    // m_res = c_employeeService.updateEmployee(m_employee);
    // c_retMessage = "更新成功";
    // if (m_res == 0) {
    // c_success = false;
    // c_retMessage = "保存失败！";
    // }
    // } else {
    // m_employee.setCheckStatus("0");
    // m_res = c_employeeService.addEmployee(m_employee);
    // if (m_res == 0) {
    // c_success = false;
    // c_retMessage = "保存失败！";
    // }
    // }
    // }
    // Employee m_employeeRes = c_employeeService.selectEmployeeByEmployeeId(m_employee.getEmployeeId());
    // List<Employee> m_Employees = new ArrayList<>();
    // m_Employees.add(m_employeeRes);
    // m_result.setDataList(m_Employees);
    // } catch (Exception e) {
    // c_retMessage = "保存失败！";
    // }
    // m_result.setRetMessage(c_retMessage);
    // m_result.setSuccess(c_success);
    // return m_result;
    // }

    @RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Employee> delete(@RequestParam("dId") String p_employeeId) {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        if (StringUtils.isEmpty(p_employeeId)) {
            c_retMessage = "未输入员工编号！";
            c_success = false;
            m_result.setRetMessage(c_retMessage);
            m_result.setSuccess(c_success);
            return m_result;
        }
        try {
            c_retMessage = "员工信息删除成功！";
            c_success = true;
            int m_res = c_employeeService.deleteEmployeeByEmployeeId(p_employeeId);
            if (m_res == 0) {
                c_retMessage = "员工信息删除失败！";
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

    // 员工信息待审核查询
    @RequestMapping(value = "/queryUnchecked", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Employee> queryUnchecked(@RequestParam("pageNo") Integer p_pageNo, @RequestParam("pageSize") Integer p_pageSize, HttpServletRequest request)
            throws UnsupportedEncodingException {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        HashMap<String, String> params = UHttpServlet.GetRequestParameters(request);
        Employee m_employee = CommonUtils.mapToBean(params, Employee.class);
        List<Employee> m_dataList = null;
        int m_count = 0;
        if (StringUtils.isEmpty(p_pageNo.toString())) {
            p_pageNo = 1;
        }
        if (StringUtils.isEmpty(p_pageSize.toString())) {
            p_pageSize = 5;
        }
        try {
            c_retMessage = "查询成功！";
            c_success = true;
            m_dataList = c_employeeService.selectUncheckedEmployeeByConditions(m_employee, p_pageNo, p_pageSize);
            m_count = c_employeeService.countSelectUncheckedEmployeeByConditions(m_employee);
            if (m_dataList == null) {
                c_retMessage = CommonConstant.ERROR_EMPTY_MSG;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("查询失败：", e);
            c_success = false;
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        m_result.setDataList(m_dataList);
        m_result.setTotal(m_count);
        return m_result;
    }

    // 员工信息审核
    @RequestMapping(value = "/check", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Result<Employee> check(@RequestParam("employeeId") String p_employeeId, @RequestParam("checkStatus") String p_checkStatus,
            @RequestParam("checkMessage") String p_checkMessage) throws UnsupportedEncodingException {
        c_success = false;
        Result<Employee> m_result = new Result<Employee>();
        Employee m_employee = new Employee();
        m_employee.setEmployeeId(p_employeeId);
        m_employee.setCheckStatus(p_checkStatus);
        m_employee.setCheckMessage(p_checkMessage);
        try {
            c_retMessage = "员工信息审核成功！";
            c_success = true;
            int m_res = c_employeeService.reviewEmployeeInfo(m_employee);
            if (m_res == 1 && "1".equals(m_employee.getCheckStatus())) {
                c_retMessage = EmployeeCheckStatusEnum.getName("1");
            }
            if (m_res == 1 && "2".equals(m_employee.getCheckStatus())) {
                c_retMessage = EmployeeCheckStatusEnum.getName("2");
            }
            if (m_res == 0 || "0".equals(m_employee.getCheckStatus())) {
                c_retMessage = "员工信息审核失败！";
                c_success = false;
            }
        } catch (Exception e) {
            c_retMessage = CommonConstant.ERROR_EXCEPTION_MSG;
            logger.error("审核失败：", e);
            c_success = false;
        }
        m_result.setRetMessage(c_retMessage);
        m_result.setSuccess(c_success);
        return m_result;
    }

}
