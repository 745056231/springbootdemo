package com.javasm.springbootdemo.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionIntercept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object userInfo = request.getSession().getAttribute("userInfo");
        if(userInfo != null){
            return true;
        }else{
            request.getRequestDispatcher("/login").forward(request,response );
            return false;
        }
    }
}

