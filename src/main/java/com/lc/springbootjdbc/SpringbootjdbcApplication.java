package com.lc.springbootjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan(value = "com.lc.springbootjdbc.mapper")
@SpringBootApplication
public class SpringbootjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
	}

}

