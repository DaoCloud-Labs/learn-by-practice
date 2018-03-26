package io.daocloud.labs.learn.ioc;

public interface BeanFactory {
    <T> T getBean(Class<T> clazz);

    void parse(Class root);
}
