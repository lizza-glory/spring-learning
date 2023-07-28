package com.lizza.strategy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-26
 */
@Component
public abstract class AbstractStrategy implements IStrategy {

    @Resource
    private StrategyHolder strategyHolder;

    public void init() {
        strategyHolder.registerStrategyMap(getStrategyName(), this);
    }

    abstract String getStrategyName();
}
