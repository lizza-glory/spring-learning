package com.lizza.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrdersServiceTest {

    @Resource
    private OrdersService ordersService;

    @Test
    public void select() {
        System.out.println(ordersService.select(1));
    }
}