
package com.stage2;
/*
*a.1 content 抽象方法只有方法签名，不能声明方法体。
  一个类中如果定义了抽象方法，这个类必须声明成抽象类，否则报错。
  不能用abstract修饰变量、代码块、构造器。
  抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
 */

/*
b. application scene:
当父类知道子类一定要完成某些行为，但是每个子类该行为的实现又不同，于是该父类就把该行为定义成抽象方法的形式，
具体实现交给子类去完成。此时这个类就可以声明成抽象类。
*
* */
abstract class telephone{
    abstract protected void network();
}
class HuaWei extends telephone{
    @Override
    protected void network() {
        System.out.println("using 5G");
    }
}
/*
* c. connection between final and abstract
* 互斥关系
abstract定义的抽象类作为模板让子类继承，final定义的类不能被继承。
* */
/*
* d.application :模板方法模式(通用结构)
* d.1 content   1、定义一个抽象类。2、定义2个方法，一个是模板方法：把相同代码放里面去，不同代码定义成抽象方法
3、子类继承抽象类，重写抽象方法。
* */
abstract class composition{
//    模板方法我们是建议使用final修饰的，这样会更专业，那么为什么呢？
//    模板方法是给子类直接使用的，不是让子类重写的，
//    一旦子类重写了模板方法，则模板方法就失效了，
    final void title(){
        System.out.println("this is a title:a happy day");
    }
    abstract void content();
    final void end(){
        System.out.println("the composition end");
    }
}
class pupil extends composition{
    @Override
    void content() {
        System.out.println("i play table tennis ,i am very happy");
    }
}

class college extends composition{

    @Override
    void content() {
        System.out.println("i learned java so that i can write a web application!");
    }
}
public class oop2AbstractClass {

}

