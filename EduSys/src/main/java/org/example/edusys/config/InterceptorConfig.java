package org.example.edusys.config;

import org.example.edusys.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，除了指定的白名单路径
        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/news/list")
                .excludePathPatterns("/school/teachers/excellent")
                .excludePathPatterns("/school/teachers/reports")
                .excludePathPatterns("/school/teachers/edu-distribution")
                .excludePathPatterns("/school/teachers/title-distribution")
                .excludePathPatterns("/api/competitions/{activityid}")
                .excludePathPatterns("/school/students/competitions");
    }
}

