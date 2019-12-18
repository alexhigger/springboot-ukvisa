package com.wzh.ukvisa.controller;



import com.wzh.ukvisa.entities.User;
import com.wzh.ukvisa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public String login(String username, String password, Map<String,Object> map, HttpSession session){
        //判断用户名不为空并且密码匹配时，登陆成功 
        if(! StringUtils.isEmpty(username) && ! StringUtils.isEmpty(password)){
            //查询数据库用户是否存在
            User user = userMapper.getUserByUsername(username);
            if(user != null && password.equals(user.getPassword())) {
                //登录成功
                session.setAttribute("loginUser", user);
                //重定向 redirect：可以重定向到任意一个请求中（包括其他项目），地址栏改变
                return "redirect:/main.html";
            }
        }
        map.put("msg","用户名或密码错误!");
        return"main/login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        //1.清空seesion
        session.removeAttribute("loginUser");
        //2.注销session
        session.invalidate();
        return "redirect:/index.html";
    }
}
