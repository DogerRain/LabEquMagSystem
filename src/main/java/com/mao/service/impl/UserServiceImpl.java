package com.mao.service.impl;

import com.mao.dao.UserDao;
import com.mao.pojo.User;
import com.mao.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ksdhc on 2015/3/31.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
