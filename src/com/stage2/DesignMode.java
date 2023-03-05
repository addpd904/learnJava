package com.stage2;

public class DesignMode {
    /*
    * A. Dynamic Proxy
    *  代理就是被代理者没有能力或者不愿意去完成某件事情，需要找个人代替自己去完成这件事，动态代理就是用来对业务功能（方法）进行代理的。
     a. step
    1.必须有接口，实现类要实现接口（代理通常是基于接口实现的）。
    3.创建一个实现类的对象，该对象为业务对象，紧接着为业务对象做一个代理对象。
    b.Proxy class
     * * */

    /*
    * B. Factory Pattern
    * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一，  这种类型的设计模式属于创建型模式，它提供了一种获取对象的方式。
     a. value
        工厂的方法可以封装对象的创建细节，比如：为该对象进行加工和数据注入。
        可以实现类与类之间的解耦操作（核心思想）。
      * */

    /*
    * C. decorator Pattern
    *装饰模式指的是在不改变原类的基础上, 动态地扩展一个类的功能。
    *a. example InputStream(抽象父类)FileInputStream(实现子类，读写性能较差)
    *           BufferedInputStream(实现子类，装饰类，读写性能高)
     *
     * b.定义父类。
        定义原始类，继承父类，定义功能。
        定义装饰类，继承父类，包装原始类，增强功能！！
    * */

}
