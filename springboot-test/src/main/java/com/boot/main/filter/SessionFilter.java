package com.boot.main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebFilter(filterName = "sessionFilter",urlPatterns = {"/*"})
public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("bootTestFilter:initServlet");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request =(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        String url =request.getRequestURI();
        System.out.println("requestUrl:"+url);
        response.addHeader("user-sss","hahah");
        response.addCookie(new Cookie("eat","shishi"));
        filterChain.doFilter(request,response);
        System.out.println("shibu:::::::::::::"+response.isCommitted());
    }

    @Override
    public void destroy() {
        System.out.println("bootTestFilter:destroy");

    }
}
