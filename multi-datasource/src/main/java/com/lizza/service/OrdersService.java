package com.lizza.service;

import com.lizza.dao.orders.OrdersDao;
import com.lizza.entity.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-13
 */
@Service
public class OrdersService {

    @Resource
    private OrdersDao ordersDao;

    public Orders select(int id) {
        return ordersDao.select(id);
    }
}
