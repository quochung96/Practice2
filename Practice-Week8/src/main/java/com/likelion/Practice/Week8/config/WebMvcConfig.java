package com.likelion.Practice.Week8.config;

import com.likelion.Practice.Week8.Interceptor.LoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Autowired
    WebMvcConfig webMvcConfig;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoggingInterceptor());
    }

}
