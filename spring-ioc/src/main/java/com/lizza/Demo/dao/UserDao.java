package com.lizza.Demo.dao;

public class UserDao {

    public void saveUser() {
        System.out.println("UserDao: user saved!");
    }

    public void init() {
        System.out.println("UserDao: object created!");
    }

    public void destroy() {
        System.out.println("UserDao: object destroyed!");
    }
}
