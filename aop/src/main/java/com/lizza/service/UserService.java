package com.lizza.service;

import com.lizza.dao.UserDao;
import com.lizza.entity.User;

import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-11
 */
public class UserService {

    private UserDao userDao;

    // 使用set注入dao
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addOne(User user) {
        return userDao.addOne(user);
    }

    public int deleteOne(int id) {
        return userDao.deleteOne(id);
    }

    public int updateOne(User user) {
        return userDao.updateOne(user);
    }

    public User findOne(int id) {
        return userDao.findOne(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 转账操作
     * @author: lizza1643@gmail.com
     * @date: 2020/3/20 11:36 下午
     * @param originAccount
     * @param targetAccount
     * @param money
     * @return int
     */
    public int transferMoney(Integer originAccount, Integer targetAccount, Double money) {
        User originUser = userDao.findOne(originAccount);
        User targetUser = userDao.findOne(targetAccount);
        double originMoney = originUser.getMoney() - money;
        originUser.setMoney(originMoney);
        double targetMoney = targetUser.getMoney() + money;
        targetUser.setMoney(targetMoney);
        userDao.updateOne(originUser);
//        int num = 1/0;
        return userDao.updateOne(targetUser);
    }
}
