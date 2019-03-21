package com.boot.main.filter;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用配置的方式注册过滤器
 */
@Configuration
public class WebComponentConfig {


    @Bean
    public FilterRegistrationBean filter1(){
        //新建注册过滤器注册类
        FilterRegistrationBean  registrationBean =new FilterRegistrationBean();
        //添加filter
        registrationBean.setFilter(new SessionFilter());
        //添加过滤路径
        registrationBean.addUrlPatterns("/eat");
        return registrationBean;
    }

}
