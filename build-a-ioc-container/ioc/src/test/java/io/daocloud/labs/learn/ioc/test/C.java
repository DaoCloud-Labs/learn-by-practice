package io.daocloud.labs.learn.ioc.test;

import javax.inject.Singleton;

@Singleton
public class C {

    private String name = "test";


    public String getName() {
        return name;
    }
}
