package com.lizza.service;

import com.lizza.dao.UserDao;
import com.lizza.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-31
 */
@Service
public class ServiceA {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ServiceB serviceB;

    @Transactional
    public void update(User user) {
        user.setAge(1);
        userDao.update(user);
        serviceB.update(user);
    }
}
