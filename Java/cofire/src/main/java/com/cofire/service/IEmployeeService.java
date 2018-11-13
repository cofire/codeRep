package com.cofire.service;

import java.util.List;

import com.cofire.dao.domain.Employee;

public interface IEmployeeService {
    /**
     * 员工信息管理表
     * 
     * @Title:selectEmployeeByEmployeeID
     * @author mc
     * @Description:
     * @param employeeId
     * @return Employee
     * @throws Exception
     * @return Employee 返回类型
     */
    Employee selectEmployeeByEmployeeId(String p_employeeId);

    /**
     * 员工信息查询
     * 
     * @Title: selectByIdAndName
     * @author Yjb
     * @Description:
     * @param employeeId
     * @param p_employeeName
     * @return
     * @throws Exception
     * @return List<Employee> 返回类型
     */
    List<Employee> selectByIdAndName(String p_employeeId, String p_employeeName) throws Exception;

    /**
     * 员工信息管理表
     * 
     * @Title:selectEmployeeByConditions
     * @author mc
     * @Description:
     * @param employeeId
     * @return List<Emloyee>
     * @throws Exception
     * @return
     */
    List<Employee> selectEmployeeByConditions(Employee p_employee, Integer p_pageNo, Integer p_pageSize);

    /**
     * 员工信息管理表
     * 
     * @Title:countSelectEmployeeByConditions
     * @author mc
     * @Description:
     * @param employeeId
     * @return int
     * @throws Exception
     * @return
     */
    int countSelectEmployeeByConditions(Employee p_employee);

    /**
     * 员工信息管理表
     * 
     * @Title:selectUncheckedEmployeeByConditions
     * @author mc
     * @Description:
     * @param p_employee
     * @return List<Emloyee>
     * @throws Exception
     * @return
     */
    List<Employee> selectUncheckedEmployeeByConditions(Employee p_employee, Integer p_pageNo, Integer p_pageSize);

    /**
     * 员工信息管理表
     * 
     * @Title:countSelectUncheckedEmployeeByConditions
     * @author mc
     * @Description:
     * @param p_employee
     * @return int
     * @throws Exception
     * @return
     */
    int countSelectUncheckedEmployeeByConditions(Employee p_employee);

    /**
     * 员工信息管理表
     * 
     * @Title: deleteEmployeeByEmployeeId
     * @author mc
     * @Description:
     * @param employeeId
     * @return int
     * @throws Exception
     * @return
     */
    int deleteEmployeeByEmployeeId(String p_employeeId);

    /**
     * 员工信息管理表
     * 
     * @Title: reviewEmployeeInfo
     * @author mc
     * @Description:
     * @param p_checkStatus
     * @return
     * @throws Exception
     * @return
     */
    int reviewEmployeeInfo(Employee p_employee);

    /**
     * 员工信息入表
     * 
     * @Title: addEmployee
     * @author yjb
     * @Description:
     * @param p_employee
     * @return
     * @throws Exception
     * @return Integer 返回类型
     */
    int addEmployee(Employee p_employee) throws Exception;

    /**
     * 更新员工信息表
     * 
     * @Title: addEmployee
     * @author yjb
     * @Description:
     * @param p_employee
     * @return
     * @throws Exception
     * @return Integer 返回类型
     */
    int updateEmployee(Employee p_employee) throws Exception;

}
