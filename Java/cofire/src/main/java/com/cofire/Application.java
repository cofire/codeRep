package com.cofire;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.cofire.filter.CORSFilter;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.cofire.dao.mapper")
public class Application extends SpringBootServletInitializer {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setName("greeting");
        CORSFilter corsFilter = new CORSFilter();
        filterRegistrationBean.setFilter(corsFilter);
        filterRegistrationBean.setOrder(1);
        List<String> urlList = new ArrayList<>();
        urlList.add("/*");
        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
