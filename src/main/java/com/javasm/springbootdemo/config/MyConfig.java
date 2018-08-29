package com.javasm.springbootdemo.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyConfig implements WebMvcConfigurer {
    //转换页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login/login_page");

    }
    @Override
    //注册日期转换(这样可以直接在controller用Date参数接收日期了)
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new MyDateFormat());

    }


    //拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionIntercept()).addPathPatterns("/**")
                .excludePathPatterns("/")
                .excludePathPatterns("/login")
                .excludePathPatterns("/login/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/index.html")
                .excludePathPatterns("/bootstrap/**")
                .excludePathPatterns("/jquery/**");
    }

}
