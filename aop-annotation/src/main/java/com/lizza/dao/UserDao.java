package com.lizza.dao;

import org.springframework.stereotype.Service;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-05-25
 */
@Service
public class UserDao {

    public void delete() {
        System.out.println("删除用户");
    }

    public void save() {
        System.out.println("保存用户");
    }

    public void select() {
        System.out.println("查询用户");
    }
}
