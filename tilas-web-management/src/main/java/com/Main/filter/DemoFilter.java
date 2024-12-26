package com.Main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {
    @Override//初始化方法，只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init初始化方法执行了");
    }

    @Override//拦截到请求之后调用，调用多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Demo:拦截到请求了");
        System.out.println("Demo:执行放行前的逻辑");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Demo:执行放行后的逻辑");
    }

    @Override//销毁方法，只调用一次
    public void destroy() {
        System.out.println("destory初始化方法执行了");
    }
}
