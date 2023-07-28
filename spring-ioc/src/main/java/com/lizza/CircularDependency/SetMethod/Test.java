package com.lizza.CircularDependency.SetMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Set方法循环依赖
 */
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        A a = context.getBean("a", A.class);
        System.out.println(a);
    }
}
