package com.lizza.main;

import com.lizza.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-01-27
 */
public class Application {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.in.read();
    }
}
