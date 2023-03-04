package com.stage2;
/*
* a.content,interface is a standard
* a.1JDK8之前接口中只能是抽象方法和常量，没有其他成分了。
    接口不能实例化。
    接口中的成员都是public修饰的，写不写都是，因为规范的目的是为了公开化。
    接口和接口的关系：多继承，一个接口可以同时继承多个接口。
   a.2接口多继承的作用
    规范合并，整合多个接口为同一个接口，便于子类实现。
   a.3 new application ;value :丰富接口功能的同时,可以不实现类实现这些方法。
        1.default method(from JDK 8),there is no need to implement for sub_class
        类似之前写的普通实例方法：必须用default修饰
        默认会public修饰。需要用接口的实现类的对象来调用
        2.static method (from JDK 8)
          there is no need to implement for sub_class
        3.private method (from JDK 9)
          there is no need to implement for sub_class
* */
/*
* b. interface and abstract class
* 一个类实现接口，必须重写完全部接口的全部抽象方法，否则这个类需要定义成抽象类。
 * */
interface communication{
//    default modifier: public abstract
    void version();

}
interface charge{
    void speed();
}
//规范合并，整合多个接口为同一个接口，便于子类实现。
interface teleStandard extends communication,charge{
    //    default modifier: public abstract
    void teleName();
    //  default method  from JDK8
    default void video(){
        System.out.println("ability to play video");
    }
    //  static method  from JDK8
    static void music(){
        System.out.println("ability to play music");
    }
//   private method from JDK9
    private void chip(){
        System.out.println("a phone chip");
    }
}

class Huawei implements teleStandard{

    @Override
    public void version() {

    }

    @Override
    public void speed() {

    }

    @Override
    public void teleName() {

    }
}

public class oop5interface{

}
/*
* other caution
    一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
    一个类实现多个接口，多个接口的规范不能冲突

    一个类实现多个接口，多个接口中有同样的静态方法不冲突。
    一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。
    一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。

* */
