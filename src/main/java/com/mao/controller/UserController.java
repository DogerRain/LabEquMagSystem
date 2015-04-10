package com.mao.controller;

import com.alibaba.fastjson.JSON;
import com.mao.pojo.User;
import com.mao.service.UserService;




import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ksdhc on 2015/3/30.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userservice;

    @RequestMapping("/login1")
    public String login1(User user,HttpServletRequest request){

        return "LoginUser";


    }

    @RequestMapping("/login")
    public String login(User user,HttpServletRequest request){
        System.out.println(JSON.toJSONString(userservice.login(user)));
        if(userservice.login(user)!=null){
            System.out.println("success！！！");

            return "index1";
        }
        else{
            return "LoginUser";
        }


    }

}
