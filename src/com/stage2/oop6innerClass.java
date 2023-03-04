package com.stage2;
interface power{
//    default modifier: public abstract
    void chargeSpeed();
}
interface phoneStandard extends power{
//    form Jdk 8
    static void screen(){
        System.out.println("phone has a screen");
    }
}

class Honor implements phoneStandard{
    @Override
    public void chargeSpeed() {
        System.out.println("10 A/s");
    }
//    static inner class
    static class chip{
        protected int price;
        public void dealData(){
            System.out.println("deal big data");
        }
        public chip(){};
        public chip(int price){
            this.price=price;
        };
    }
//    member inner class
    public class camera{
        protected int price;

        public camera(){};
        public camera(int price){
            this.price=price;
        };
        public void dealData(){
            System.out.println("take a photo");
        }
//        在成员内部类中访问所在外部类对象 ，格式：外部类名.this
        public void printChargespeed() {
            Honor.this.chargeSpeed();
        }
    }

}
    /*
    * a. content
    内部类通常可以方便访问外部类的成员，包括私有的成员。
     * */

public class oop6innerClass {
    public void testStaticInnerClass(){
    /*
    * b.static inner class
    * b.1 feature :特点、使用与普通类是一样的，类有的成分它都有，只是位置在别人里面而已。
                   访问总结：可以直接访问外部类的静态成员，不能直接访问外部类的实例成员
    * */
        Honor.chip chipkirin=new Honor.chip(999);
        System.out.println(chipkirin.price);
    }
    public void testMemberInnerClass(){
/*
* c.member inner class
*format:外部类名.内部类名 对象名 = new  外部类构造器().new 内部类构造器();
* 可以直接访问外部类对象的实例成员
* 在成员内部类中访问所在外部类对象 ，格式：外部类名.this
 * */
        Honor.camera honorCamera=new Honor().new camera(390);
        System.out.println(honorCamera.price);
    }
/*
//   d.Anonymous əˈnɒnɪməs inner class
* new 类|抽象类名|或者接口名() {    重写方法;};
放在方法、代码块、构造器等执行体中。
匿名内部类的对象类型，相当于是当前new的那个类型的子类类型。
 * */
    public void AnonymousInnerClass(){
        power power1=new power() {
            @Override
            public void chargeSpeed() {
                System.out.println("create a power");
                System.out.println("speed : 1000 w/s");
            }
        };
        power1.chargeSpeed();
    }
    public static void main(String[] args){
        oop6innerClass test=new oop6innerClass();
        test.AnonymousInnerClass();
    }

}
