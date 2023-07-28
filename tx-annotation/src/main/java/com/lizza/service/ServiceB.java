package com.lizza.service;

import com.lizza.dao.UserDao;
import com.lizza.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-31
 */
@Service
public class ServiceB {

    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(User user) {
        user.setAge(2);
        userDao.update(user);
        int i = 1 / 0;
    }
}
