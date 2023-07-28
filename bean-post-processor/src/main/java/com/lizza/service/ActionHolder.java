package com.lizza.service;

import com.lizza.action.IAction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-02-25
 */
@Component
public class ActionHolder implements BeanPostProcessor {

    private Map<String, IAction> actionMap = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof IAction) {
            actionMap.put(beanName, (IAction) bean);
        }
        return bean;
    }

    public Map<String, IAction> getActionMap() {
        return actionMap;
    }
}
