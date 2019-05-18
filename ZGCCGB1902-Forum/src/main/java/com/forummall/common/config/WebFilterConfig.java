package com.forummall.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

@Configuration
public class WebFilterConfig {
    //忽略警告注解 忽略"rawtypes","unchecked"两种警告信息
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	//过滤器注册
	public FilterRegistrationBean shiroFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //选择过滤器
        registration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        //启动过滤器
        registration.setEnabled(true);
        //设置过滤器优先级
        registration.setOrder(Integer.MAX_VALUE - 1);
        //设置过滤器url拦截地址
        registration.addUrlPatterns("/*");
        return registration;
    }
}
