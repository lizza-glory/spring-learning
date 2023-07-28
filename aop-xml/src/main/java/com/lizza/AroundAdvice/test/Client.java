package com.lizza.AroundAdvice.test;

import com.lizza.AroundAdvice.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-03-26
 */
public class Client {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans2.xml")	;
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
