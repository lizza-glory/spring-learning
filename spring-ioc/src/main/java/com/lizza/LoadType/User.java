package com.lizza.LoadType;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-11-23
 */
public class User {

    private String userName;
    private Integer age;

    public User() {
        System.out.println("User 初始化...");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
