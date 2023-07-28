package com.lizza.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-04-06
 */
@Configuration
@ComponentScan("com.lizza")
@Import({JdbcConfig.class, TransactionConfig.class})
@EnableTransactionManagement()
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
