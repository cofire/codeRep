package com.cofire.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cofire.dao.domain.Employee;
import com.cofire.dao.domain.EmployeeExample;
import com.cofire.dao.mapper.EmployeeMapper;
import com.cofire.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeMapper c_employeeMapper;

    @Override
    public Employee selectEmployeeByEmployeeId(String p_employeeId) {
        Employee m_employee = c_employeeMapper.selectByPrimaryKey(p_employeeId);
        return m_employee;
    }

    @Override
    public List<Employee> selectByIdAndName(String p_employeeId, String p_employeeName) throws Exception {
        EmployeeExample m_example = new EmployeeExample();
        EmployeeExample.Criteria m_criteria = m_example.createCriteria();
        if (!"".equals(p_employeeId)) {
            m_criteria.andEmployeeIdEqualTo(p_employeeId);
        }
        if (!"".equals(p_employeeName)) {
            m_criteria.andEmployeeNameEqualTo(p_employeeName);
        }
        List<Employee> m_employeeList = c_employeeMapper.selectByExample(m_example);
        return m_employeeList;
    }

    public List<Employee> selectEmployeeByConditions(Employee p_employee, Integer p_pageNo, Integer p_pageSize) {
        EmployeeExample m_example = new EmployeeExample();
        EmployeeExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty(p_employee.getEmployeeId())) {
            m_criteria.andEmployeeIdEqualTo(p_employee.getEmployeeId());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeName())) {
            m_criteria.andEmployeeNameLike(p_employee.getEmployeeName());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeIdCard())) {
            m_criteria.andEmployeeIdCardEqualTo(p_employee.getEmployeeIdCard());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeePhone())) {
            m_criteria.andEmployeePhoneEqualTo(p_employee.getEmployeePhone());
        }
        m_example.setLimitStart((p_pageNo - 1) * p_pageSize);
        m_example.setLimitSize(p_pageSize);
        List<Employee> m_employeeList = c_employeeMapper.selectByExample(m_example);
        return m_employeeList;
    }

    @Override
    public int countSelectEmployeeByConditions(Employee p_employee) {
        EmployeeExample m_example = new EmployeeExample();
        EmployeeExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty(p_employee.getEmployeeId())) {
            m_criteria.andEmployeeIdEqualTo(p_employee.getEmployeeId());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeName())) {
            m_criteria.andEmployeeNameLike(p_employee.getEmployeeName());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeIdCard())) {
            m_criteria.andEmployeeIdCardEqualTo(p_employee.getEmployeeIdCard());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeePhone())) {
            m_criteria.andEmployeePhoneEqualTo(p_employee.getEmployeePhone());
        }
        int count = (int) c_employeeMapper.countByExample(m_example);
        return count;
    }

    @Override
    public int deleteEmployeeByEmployeeId(String p_employeeId) {
        String[] ids = p_employeeId.split(",");
        int m_res = 0;
        for (String id : ids) {
            m_res = c_employeeMapper.deleteByPrimaryKey(id);
        }
        return m_res;
    }

    @Override
    public int reviewEmployeeInfo(Employee p_employee) {
        int m_res = c_employeeMapper.updateByPrimaryKeySelective(p_employee);
        return m_res;
    }

    @Override
    public int addEmployee(Employee p_employee) throws Exception {
        int m_res = c_employeeMapper.insertSelective(p_employee);
        return m_res;
    }

    @Override
    public int updateEmployee(Employee p_employee) throws Exception {
        int m_res = c_employeeMapper.updateByPrimaryKeySelective(p_employee);
        return m_res;
    }

    @Override
    public List<Employee> selectUncheckedEmployeeByConditions(Employee p_employee, Integer p_pageNo, Integer p_pageSize) {
        EmployeeExample m_example = new EmployeeExample();
        EmployeeExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty(p_employee.getEmployeeId())) {
            m_criteria.andEmployeeIdEqualTo(p_employee.getEmployeeId());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeName())) {
            m_criteria.andEmployeeNameLike(p_employee.getEmployeeName());
        }
        if (StringUtils.isNotEmpty(p_employee.getCheckStatus())) {
            m_criteria.andCheckStatusEqualTo(p_employee.getCheckStatus());
        }
        m_example.setLimitStart((p_pageNo - 1) * p_pageSize);
        m_example.setLimitSize(p_pageSize);
        List<Employee> m_employeeList = c_employeeMapper.selectByExample(m_example);
        return m_employeeList;
    }

    @Override
    public int countSelectUncheckedEmployeeByConditions(Employee p_employee) {
        EmployeeExample m_example = new EmployeeExample();
        EmployeeExample.Criteria m_criteria = m_example.createCriteria();
        if (StringUtils.isNotEmpty(p_employee.getEmployeeId())) {
            m_criteria.andEmployeeIdEqualTo(p_employee.getEmployeeId());
        }
        if (StringUtils.isNotEmpty(p_employee.getEmployeeName())) {
            m_criteria.andEmployeeNameLike(p_employee.getEmployeeName());
        }
        if (StringUtils.isNotEmpty(p_employee.getCheckStatus())) {
            m_criteria.andCheckStatusEqualTo(p_employee.getCheckStatus());
        }
        int count = (int) c_employeeMapper.countByExample(m_example);
        return count;
    }

}
