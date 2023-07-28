package com.lizza.service;

import com.lizza.dao.UserDao;
import com.lizza.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-31
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int insert(User user) {
        return userDao.insert(user);
    }

    public int delete(int id) {
        return userDao.delete(id);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public User select(int id) {
        return userDao.select(id);
    }

    public List<User> list() {
        return userDao.list();
    }

    public int transferMoney(int fromId, int toId, double money) {
        // 1. 获取付款账户和收款账户
        User from_user = userDao.select(fromId);
        User to_user = userDao.select(toId);
        // 2. 付款账户付款，收款账户收款
        from_user.setMoney(from_user.getMoney() - money);
        to_user.setMoney(to_user.getMoney() + money);
        // 3. 更新账户信息
        updateAccount(from_user, to_user);
        return 0;
    }

    @Transactional
    public void updateAccount(User fromUser, User toUser) {
        userDao.update(fromUser);
        int i = 1 / 0;
        userDao.update(toUser);
    }
}
