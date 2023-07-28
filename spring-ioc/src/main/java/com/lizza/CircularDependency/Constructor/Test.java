package com.lizza.CircularDependency.Constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 构造器循环依赖
 */
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        A a = context.getBean("a", A.class);
        System.out.println(a);
    }
}
