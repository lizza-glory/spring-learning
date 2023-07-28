package com.lizza.service;

import com.google.common.collect.Maps;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-07
 */
public abstract class AbstractUserService {

    @Resource
    private UserServiceFactory userServiceFactory;

    public abstract String userType();

    @PostConstruct
    public void init() {
        userServiceFactory.register(userType(), this);
    }
}
