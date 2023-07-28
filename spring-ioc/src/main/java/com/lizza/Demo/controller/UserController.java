package com.lizza.Demo.controller;

import com.lizza.Demo.dao.UserDao;
import com.lizza.Demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-06
 */
public class UserController {

    public static void main(String[] args){
        // 1. 创建核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_1.xml");
        // 2. 获取对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.saveUser();
        UserDao userDao = context.getBean("userDao5", UserDao.class);
        userDao.saveUser();
    }
}
