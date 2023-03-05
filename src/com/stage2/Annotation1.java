package com.stage2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotation1 {
//    对Java中类、方法、成员变量做标记，然后进行特殊处理，至于到底做何种处理由业务需求来决定。
//    例如：JUnit框架中，标记了注解@Test的方法就可以被当成测试方法执行，而没有标记的就不能当成测试方法执行。
    /*
    * A.
    *a.元注解：注解注解的注解。
    a.1 classification
    * 元注解有两个：
     @Target: 约束自定义注解只能在哪些地方使用，
     @Retention：申明注解的生命周期
     a.2  @Target (约束自定义注解可以标记的范围。)
     * TYPE，类，接口
        FIELD, 成员变量
        METHOD, 成员方法
        PARAMETER, 方法参数
        CONSTRUCTOR, 构造器
        LOCAL_VARIABLE, 局部变量

        * a.3 @Retention
        *  SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在
         CLASS：  注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值.
         RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）
         *
      b.注解的解析
      * 注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容。
      * b.1 AnnotatedElement:
      * 该接口定义了与注解解析相关的解析方法
      * b.2 api
        Annotation[]    getDeclaredAnnotations()    获得当前对象上使用的所有注解，返回注解数组。
        T getDeclaredAnnotation(Class<T> annotationClass)   根据注解类型获得对应注解对象
        boolean isAnnotationPresent(Class<Annotation> annotationClass)  判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false
        b.3 caution
        * 所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力：
      *
        c.
        * 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
		* public interface MyAnno extends java.lang.annotation.Annotation {}
     * */

}
/*
* B. DIY annotation
* public @interface 注解名称 { public 属性类型 属性名() default 默认值 ;}
* 属性：接口中的抽象方法
 * */

//元注解
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD}) // 元注解
@Retention(RetentionPolicy.RUNTIME) // 一直活着，在运行阶段这个注解也不消失
@interface Book {
    String value(); // 特殊属性
    double price() ;
    //double price() default 9.9;
}
//use annotation
@Book(value = "learn java",price = 200)
class MyBook{

}

