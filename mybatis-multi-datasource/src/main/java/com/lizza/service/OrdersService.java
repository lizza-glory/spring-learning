package com.lizza.service;

import com.lizza.dao.orders.OrdersMapper;
import com.lizza.entity.Orders;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-14
 */
//@Service
public class OrdersService {

    @Resource
    private OrdersMapper ordersDao;

    public Orders select(int id) {
        return ordersDao.select(id);
    }
}
