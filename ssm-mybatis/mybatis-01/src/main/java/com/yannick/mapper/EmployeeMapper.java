package com.yannick.mapper;

import com.yannick.pojo.Employee;

import java.util.Map;

public interface EmployeeMapper {

    Employee selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    Map<String ,Object> selectEmpNameAndMaxSalary();
}
