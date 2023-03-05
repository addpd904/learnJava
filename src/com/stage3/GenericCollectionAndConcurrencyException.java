package com.stage3;

public class GenericCollectionAndConcurrencyException {
    /*
    *
    * A.CollectionAndConcurrencyException
    a.1 content
        1.1当我们从集合中找出某个元素并删除的时候可能出现一种并发修改异常问题。
        1.2哪些遍历存在问题？
        迭代器遍历集合且直接用集合删除元素的时候可能出现。
        增强for循环遍历集合且直接用集合删除元素的时候可能出现。
        1.3哪种遍历且删除元素不出问题
        迭代器遍历集合但是用迭代器自己的删除方法操作可以解决。
        使用for循环遍历并删除元素不会存在这个问题。
    * */

//    B.Generic
    /*
    * a.1theory
    *  把出现泛型变量的地方全部替换成传输的真实数据类型。
    * a.2content
    * a.2.1 generic class 修饰符 class 类名<泛型变量>{  }
    * a.2.2 generic method
    * ： public <T> void show(T t) {  }
     * a.2.3 generic interface
     * public interface Data<E>{}
     * 实现类可以在实现接口的时候传入自己操作的数据类型，这样重写的方法都将是针对于该类型的操作。
     * \
     * */

    /*
    * b. wildcard
    *  ? extends Car    : ?必须是Car或者其子类
        ? super Car     ： ?必须是Car或者其父类

    * */
}
