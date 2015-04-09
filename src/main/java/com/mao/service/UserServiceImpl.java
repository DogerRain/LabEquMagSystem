package com.mao.service;

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

   @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
    /* User user1=new User();
     user1.setId(2);
     user1.setName("mao1");
     user1.setPassword("213312");
*/
       // return user1;
     System.out.println("123");
//     return userDao.login(user);
     return userDao.userlogin(user);
    }
}
