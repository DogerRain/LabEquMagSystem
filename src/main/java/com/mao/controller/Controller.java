package com.mao.controller;

import com.mao.pojo.User;
import com.mao.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ksdhc on 2015/3/30.
 */

//@Controller
@RequestMapping("/user")
public class Controller {

    @Resource
    private UserService userService;

    public String login1(User user,HttpServletRequest request){

        return "LoginUser";
    }

    public String login(User user,HttpServletRequest request){

        //System.out.println(JSON.toJSONString(user));
        if(userService.login(user)!=null){

          //  return "redirect:/getAll.do";
            return "LoginUser";

        }
        else{
            return "LoginUser";
        }
    }
}
