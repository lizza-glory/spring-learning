package com.lizza.service;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-07-07
 */
@Component
public class UserServiceFactory {
    private Map<String, AbstractUserService> map = Maps.newHashMap();
    public void register(String type, AbstractUserService userService) {
        map.put(type, userService);
    }

    public AbstractUserService get(String type) {
        return map.get(type);
    }
}
