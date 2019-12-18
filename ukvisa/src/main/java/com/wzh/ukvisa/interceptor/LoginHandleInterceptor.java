package com.wzh.ukvisa.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义登录拦截器（还要添加到容器中）
 */
public class LoginHandleInterceptor implements HandlerInterceptor {
    //调用目标方法之前被拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser != null){
            //已经登陆过，放行
            return true;
        }
        //未登录，转到登陆界面
        request.setAttribute("msg","未登录，请先登录");
        request.getRequestDispatcher("index.html").forward(request,response);
        return false;

    }
}
