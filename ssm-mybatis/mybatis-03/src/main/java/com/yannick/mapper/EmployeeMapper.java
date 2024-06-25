package com.yannick.mapper;

import com.yannick.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> query(@Param("name") String name, @Param("salary") Double salary);
}
