package com.lizza.dao.orders;

import com.lizza.entity.Orders;

public interface OrdersDao {
    Orders select(int id);
}
