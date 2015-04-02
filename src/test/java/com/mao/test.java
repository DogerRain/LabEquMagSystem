package com.mao;

import com.mao.pojo.User;
import com.mao.service.UserService;
import com.mao.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;


/**
 * Created by ksdhc on 2015/3/31.
 */
public class test {
    private ApplicationContext ac=null;

   //@Resource
    private UserService userService=null;

    @Before
    public void before(){

        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
       userService=(UserService)ac.getBean("userService");
        //userService=new UserServiceImpl();
    }

    @Test
    public void test1(){

        User user=new User();
        user.setName("mao");
        user.setPassword("123");
        System.out.println("12321");
        //System.getProperty("user.dir");
        System.out.println(userService.login(user).getId());
    }

}
