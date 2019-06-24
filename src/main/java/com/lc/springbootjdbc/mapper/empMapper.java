package com.lc.springbootjdbc.mapper;
import com.lc.springbootjdbc.bean.employee;
import org.apache.ibatis.annotations.Mapper;


public interface empMapper {

    public employee getEmployeeById(Integer id);
    public employee addEmployee(employee employee);
}