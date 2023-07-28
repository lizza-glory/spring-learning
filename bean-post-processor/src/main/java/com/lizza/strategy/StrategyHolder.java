package com.lizza.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-26
 */
@Component
public class StrategyHolder {

    Map<String, IStrategy> strategyMap = new HashMap<>();

    public void registerStrategyMap(String name, IStrategy strategy) {
        strategyMap.put(name, strategy);
    }
}
