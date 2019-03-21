package com.boot.main.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {


        System.out.println("preHandleObject:"+o);
//        httpServletResponse.addCookie(new Cookie("chiPre","xiangxiang"));
        System.out.println("preHandle::::responseIsCommitted:"+httpServletResponse.isCommitted());
        httpServletResponse.addHeader("wwww","lll");
        httpServletResponse.setHeader("wwwwSet","llll");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle::::responseIsCommitted:"+httpServletResponse.isCommitted());
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion::::responseIsCommitted:"+httpServletResponse.isCommitted());

        //        httpServletResponse.addCookie(new Cookie("chiAfter","xiangxiang"));
    }
}