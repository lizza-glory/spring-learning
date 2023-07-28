package com.lizza.dao;

import com.lizza.entity.User;

import java.util.List;

public interface UserDao {

    int addOne(User user);

    int deleteOne(int id);

    int updateOne(User user);

    User findOne(int id);

    List<User> findAll();
}
