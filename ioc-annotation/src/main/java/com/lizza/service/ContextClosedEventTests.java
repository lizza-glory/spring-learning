package com.lizza.service;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

public class ContextClosedEventTests {

    @EventListener(ContextClosedEvent.class)
    public void handlerEvent(Object event) {
        System.out.println("容器销毁");
    }
}
