package com.lizza.service;

import com.lizza.entity.Goods;
import com.lizza.entity.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-13
 */
public class MultiDataSourceTest {

    @Test
    public void testMultiDataSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GoodsService goodsService = context.getBean("goodsService", GoodsService.class);
        OrdersService ordersService = context.getBean("ordersService", OrdersService.class);
        Goods goods = goodsService.select(1);
        Orders orders = ordersService.select(1);
        System.out.println(goods);
        System.out.println(orders);
    }
}
