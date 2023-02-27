package com.basisgrammar;
//object-oriented
//A.basis grammar
//a.1 caution:
/* a.1.1一个Java文件中可以定义多个class类，但只能一个类是public修饰，而且public修饰的类名必须成为代码文件名。
实际开发中建议还是一个文件定义一个class类。
a.1.2 成员变量的完整格式是：修饰符 数据类型 变量名称 = 初始化值； 一般无需为成员变量指定初始化值，存在默认值。
a.1.3    当堆内存中的对象，没有被任何变量引用（指向）时，就会被判定为内存中的“垃圾”。Java存在自动垃圾回收器，会定期进行清理。

*/

public class oop {
    public static void constru(){

    }
    public static void main(String[] args){

    }
}

class Student {
    String name;
    int age;
    //b. constructor: 修饰符 类名(形参列表)
//    c.this :the address of current object
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public Student(){
    }
    public void prin(){
        int a;
//          d. local variable and member variable
//          局部变量,没有默认值，使用之前需要完成赋值
//        System.out.println(a); error
//        member variable,有默认值,无需初始化
        System.out.println(this.age);

    }
}
//B.encapsulation , for example, Socket object  encapsulates /ɪnˈkæpsjuleɪt/ many functions.
//a.1 caution
/*a.1.1对象代表什么，就得封装对应的数据，并提供数据对应的行为。
* a.1.2一般建议对成员变量使用private(私有、隐藏)关键字修饰进（private修饰的成员只能在当前类中访问）。
*/
class Teacher {
    private String name;
    private int age;
    //b. constructor: 修饰符 类名(形参列表)
    public Teacher(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
}
