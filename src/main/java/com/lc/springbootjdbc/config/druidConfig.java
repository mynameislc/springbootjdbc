package com.lc.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.sun.javafx.collections.MappingChange;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class druidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
//    配置druid监控
//    配置servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean Bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initparams = new HashMap<>();
        initparams.put("loginUsername","admin");
        initparams.put("loginPassword","123456");
        initparams.put("allow","");
        Bean.setInitParameters(initparams);
        return Bean;
    }
//    配置filter
    @Bean
    public FilterRegistrationBean webstatfilter(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new WebStatFilter());
        Map<String,String> initparams = new HashMap<>();
        initparams.put("exclusions","*.js,*.css,/druid/*");
        filter.setInitParameters(initparams);
        filter.setUrlPatterns(Arrays.asList("/*"));
        return filter;
    }
}