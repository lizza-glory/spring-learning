package com.lizza.CircularDependency.SetMethod;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class B {
    private A a;
    public B() {}
    public void setA(A a) {
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
