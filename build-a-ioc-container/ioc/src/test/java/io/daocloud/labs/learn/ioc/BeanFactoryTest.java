package io.daocloud.labs.learn.ioc;

import io.daocloud.labs.learn.ioc.test.A;
import io.daocloud.labs.learn.ioc.test.B;
import io.daocloud.labs.learn.ioc.test.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeanFactoryTest {

    private BeanFactory beanFactory;

    @Before
    public void before() {
        //TODO init beanFactory
    }

    @Test
    public void test_getBean() {
        beanFactory.parse(A.class);

        Assert.assertNotNull(beanFactory.getBean(A.class));
        Assert.assertNotNull(beanFactory.getBean(B.class));
        Assert.assertNotNull(beanFactory.getBean(C.class));


        A a1 = beanFactory.getBean(A.class);
        A a2 = beanFactory.getBean(A.class);
        Assert.assertTrue(a1.equals(a2));

        Assert.assertNotNull(a1.getB());
        Assert.assertNotNull(a1.getB().getC());
        Assert.assertTrue(a1.getB().getC().getName().equals("test"));
    }
}