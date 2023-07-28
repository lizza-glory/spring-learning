package com.lizza.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-04-06
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lizza")
public class SpringConfig {

}
