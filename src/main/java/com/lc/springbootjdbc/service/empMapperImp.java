package com.lc.springbootjdbc.service;

import com.lc.springbootjdbc.bean.employee;
import com.lc.springbootjdbc.mapper.empMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@CacheConfig(cacheNames = "emp")
@Service
public class empMapperImp {
    @Autowired
    empMapper empMapper;

    @Cacheable(value = "emp")
    public employee getempByid(Integer id){
        System.out.println("当前员工"+id);
        employee employee = empMapper.getEmployeeById(id);
        return employee;
    }
}