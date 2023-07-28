package com.lizza.service;

import com.lizza.controller.OrderController;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderController orderController;

    public String hello() {
        return orderController.hello();
    }
}
