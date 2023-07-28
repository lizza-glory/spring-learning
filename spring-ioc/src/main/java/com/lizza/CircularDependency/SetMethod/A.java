package com.lizza.CircularDependency.SetMethod;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
