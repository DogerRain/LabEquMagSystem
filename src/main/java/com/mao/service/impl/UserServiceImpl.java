package com.mao.service.impl;

import com.mao.dao.UserDao;
import com.mao.pojo.User;
import com.mao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ksdhc on 2015/3/31.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        User user1=new User();
        System.out.println("1");
        user1=userDao.login(user);
        System.out.println("2");
        System.out.println(user1.getId());
        return user1;
    }
}
