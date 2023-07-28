package com.lizza.aop;

import com.lizza.datasource.DataSourceType;
import com.lizza.datasource.DataSourceTypeManager;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-13
 */
@Aspect
@Order(0)
@Component
public class DataSourceInterceptor {

    @Pointcut("execution(* com.lizza.dao.orders.*.*(..))")
    public void dataSourceOrders(){}

    @Before("dataSourceOrders()")
    public void beforeOrders() {
        DataSourceTypeManager.set(DataSourceType.DS_ORDERS);
    }

    @Pointcut("execution(* com.lizza.dao.goods.*.*(..))")
    public void dataSourceGoods(){}

    @Before("dataSourceOrders()")
    public void beforeGoods() {
        DataSourceTypeManager.set(DataSourceType.DS_GOODS);
    }
}
