package com.lizza.Annotation.controller;

import com.lizza.Annotation.config.SpringConfig;
import com.lizza.Annotation.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 利用Spring注解来配置IOC容器
 */
@Controller
public class BookController {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
