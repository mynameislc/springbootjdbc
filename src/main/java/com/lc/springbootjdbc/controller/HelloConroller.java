package com.lc.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloConroller {
    @Autowired
    JdbcTemplate JdbcTemplate;
    @RequestMapping("/hello")
    public Map<String, Object> hello(){
        List<Map<String, Object>> maps = JdbcTemplate.queryForList("select * from department");
        return maps.get(0);

    }
}