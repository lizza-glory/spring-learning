package com.lizza.Demo.factory;

import com.lizza.Demo.dao.UserDao;

/**
 * 模拟jar包中的工厂方法（我们无法通过修改源码的方式来提供默认构造器）
 */
public class BeanFactory {

    public UserDao getUserDao() {
        return new UserDao();
    }
}
