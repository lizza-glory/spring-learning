package com.lizza.CircularDependency.Constructor;

import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;
    public A(B b) {
        this.b = b;
    }
    public B getB() {
        return b;
    }
    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
