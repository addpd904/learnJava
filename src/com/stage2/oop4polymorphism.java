package com.stage2;
//polymorphism /ˌpɒlɪˈmɔːfɪz(ə)m/
/*a.1format
父类类型 对象名称 = new 子类构造器;*/

/*
    b.feature
    多态中成员访问特点
    方法调用：编译看左边，运行看右边。
    变量调用：编译看左边，运行也看左边。（注意）
    多态的前提
    有继承/实现关系；有父类引用指向子类对象；有方法重写（多态侧重行为多态）。
*/
abstract class Animal{
    protected int age=100;
    protected void run(){
        System.out.println("the animal is running");
    }
    abstract void eat();
}

class Cat extends Animal{
    protected int age=33;
    @Override
    void eat() {
        System.out.println("eat apple");
    }
    @Override
    protected void run(){
        System.out.println("cat is running");
    }
    void subSpecificMeth(){
        System.out.println("miao miao miao~~~~");
    }
}
class Dog extends Animal{
    protected int age=33;
    @Override
    void eat() {
        System.out.println("dog is eating watermelon ");
    }
    @Override
    protected void run(){
        System.out.println("dog is running");
    }
    void subSpecificMeth(){
        System.out.println("wang wang wang~~~~");
    }
}
public class oob4polymorphism {
    protected static void testVariableAndPoly(){
        //   方法调用：编译看左边，运行看右边。
        Animal cat1=new Cat();
        cat1.run();
        //   变量调用：编译看左边，运行也看左边。print 100 (Animal's age)
        System.out.println(cat1.age);
    }
    protected static void typeCast(){
/*c.shortcoming: 多态下不能使用子类的独有功能,unless transform super_class type into sub_class type
solution :Type Cast: super_class to sub_class
变量名a instanceof 类型type1:judge that if a's type is type1.
*/
        Animal a1=new Cat();
        Animal a2=new Dog();
        if(a1 instanceof Dog){
//            Type Cast
            Dog dog1=(Dog) a1;
//          call the sub_class specific method
            dog1.subSpecificMeth();
        }
        if(a1 instanceof Cat){
            Cat cat1=(Cat) a1;
            cat1.subSpecificMeth();
        }
    }
    public static void main(String args[]){
        typeCast();
    }
}
