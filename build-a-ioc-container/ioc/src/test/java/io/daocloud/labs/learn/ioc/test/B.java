package io.daocloud.labs.learn.ioc.test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class B {

    @Inject
    private C c;

    public C getC() {
        return c;
    }
}
