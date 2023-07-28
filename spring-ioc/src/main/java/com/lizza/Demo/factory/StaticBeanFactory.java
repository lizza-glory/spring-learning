package com.lizza.Demo.factory;

import com.lizza.Demo.dao.UserDao;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-07
 */
public class StaticBeanFactory {

    public static UserDao getUserDao() {
        return new UserDao();
    }
}
