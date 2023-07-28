package com.lizza.CircularDependency.Constructor;

import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;
    public B(A a) {
        this.a = a;
    }
    public A getA() {
        return a;
    }
    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
