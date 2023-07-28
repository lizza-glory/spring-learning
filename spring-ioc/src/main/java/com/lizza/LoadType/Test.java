package com.lizza.LoadType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 验证
 * 1. BeanFactory加载Bean是延迟加载
 * 2. ApplicationContext加载Bean是饿汉式加载
 */
public class Test {

    public static void main(String[] args){
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans_2.xml"));
//        System.out.println("BeanFactory 加载完成...");
//        User user = factory.getBean("user", User.class);
//        System.out.println(user);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans_2.xml");
        System.out.println("ApplicationContext 加载完成...");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
