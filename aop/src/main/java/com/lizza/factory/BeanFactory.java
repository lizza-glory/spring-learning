package com.lizza.factory;

import com.lizza.service.UserService;
import com.lizza.util.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK动态代理, 生成代理后的UserService对象, 该对象支持事务
 */
public class BeanFactory {

    private UserService userService;

    private TransactionManager txManager;

    public UserService getUserService() {
        return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;
                        try {
                            // 1. 开启事务
                            txManager.start();
                            // 2. 执行操作
                            result = method.invoke(userService, args);
                            // 3. 提交事务
                            txManager.commit();
                        } catch (Exception e) {
                            // 4. 异常回滚
                            txManager.rollBack();
                            e.printStackTrace();
                        } finally {
                            // 5. 释放资源
                            txManager.release();
                        }

                        return result;
                    }
                });
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }
}
