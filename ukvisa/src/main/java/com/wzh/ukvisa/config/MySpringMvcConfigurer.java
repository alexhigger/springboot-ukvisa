package com.wzh.ukvisa.config;


import com.wzh.ukvisa.component.MyLocaleResolver;
import com.wzh.ukvisa.interceptor.LoginHandleInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MySpringMvcConfigurer implements WebMvcConfigurer {
    //增加视图控制
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            //添加视图控制
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("main/login");
                registry.addViewController("/index.html").setViewName("main/login");
                registry.addViewController("/main.html").setViewName("main/index");
            }
            //添加拦截器

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandleInterceptor())
                        .addPathPatterns("/**")//拦截所有请求
                        .excludePathPatterns("/","/index.html","/login",
                                "/css/**","/img/**","/js/**");//排除不需要拦截的请求
                //SpringBoot2+中要排除静态资源路径, 因访问时不会加/static，所以配置如上一行


            }
        };
        return webMvcConfigurer;
    }


    //需要替换mvc自动配置类中区域解析器,
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}