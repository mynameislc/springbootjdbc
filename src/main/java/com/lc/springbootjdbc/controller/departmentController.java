package com.lc.springbootjdbc.controller;

import com.lc.springbootjdbc.bean.*;
import com.lc.springbootjdbc.service.empMapperImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lc.springbootjdbc.mapper.*;

@RestController
public class departmentController {
    @Autowired
    depatmentMapper depatmentMapper;
    @Autowired
    empMapper empMapper;
    @Autowired
    empMapperImp empMapperImp;

    @GetMapping("/dept")
    public department getdepatmentById(Integer id){
        department department = depatmentMapper.getDeparmentById(1);
        return department;
    }


    @GetMapping("/emp")
    public employee getdemployeeById(Integer id){
        employee employee = empMapperImp.getempByid(id);
        return employee;
    }

}