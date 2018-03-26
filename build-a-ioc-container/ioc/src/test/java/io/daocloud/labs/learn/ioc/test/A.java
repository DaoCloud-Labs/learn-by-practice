package io.daocloud.labs.learn.ioc.test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class A {

    @Inject
    private B b;

    public B getB() {
        return b;
    }
}
