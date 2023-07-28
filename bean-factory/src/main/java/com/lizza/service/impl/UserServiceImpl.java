package com.lizza.service.impl;

import com.lizza.dao.UserDao;
import com.lizza.service.UserService;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-06
 */
public class UserServiceImpl implements UserService {

    // new的方式创建对象，增加了耦合度
    private UserDao userDao = new UserDao();

    private int i;

    @Override
    public void saveUser(){
        userDao.saveUser();
        System.out.println(i);
        i++;
    }
}
