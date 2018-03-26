# 第一课：构建一个IOC容器

## 背景
Spring Bean的创建是典型的工厂模式，这一系列的Bean工厂，也即IOC容器为开发者管理对象间的依赖关系提供了很多便利和基础服务，在Spring中有许多的IOC容器的实现供用户选择和使用。大致架构如下图所示 ![Pic](https://images0.cnblogs.com/blog/400827/201409/172219470349285.x-png) 


## 需求
实现一个BeanFactory类，可以根类扫描，构建初始化所有的Class。

## 判断
通过所有的测试!  
测试类在 io.daocloud.labs.learn.ioc.BeanFactoryTest#test_getBean


## Tips
1. 可能使用到了技术是[反射](https://blog.csdn.net/sinat_38259539/article/details/71799078)
2. 可以参考Spring的ApplicationContext实现。