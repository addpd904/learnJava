package com.stage2;

public class StaticAndExtend {

    public static void sta(){

    }
    public static void main(String[] args){
        codeBlo cod=new codeBlo();
        System.out.println(cod.b);
    }
}
//A static ,code block,The single instance design pattern
//a. static
//    a.static member ,归属于类,可以被类的所有对象共享（访问、修改)。可以被类的所有对象共享（访问、修改)。 store in 静态变量区
/*    a.1 caution :access 类名.静态成员变量(推荐)
     静态方法中是不可以出现this关键字的。
     b.application : tool class
    工具类无需创建对象，建议将工具类的构造器进行私有。*/
class Numtool{
//    constructor privately
    private Numtool(){}
    public static int add(int a,int b){
        return a+b;
    }
    public static int mult(int a,int b){
        return a*b;
    }
}

//b. code block
class codeBlo{
    public int a;
    public int b;
//    code block 每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
    {
        a=100;
        b=99;
    }
//   static code block 并且自动触发、只执行一次; 使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。
    static {

    }

}
//c. The single instance design pattern 可以保证系统中，应用该模式的这个类永远只有一个实例，即一个类永远只能创建一个对象。
class sinConD{
//    饿汉单例设计模式
    //    定义一个静态变量存储一个对象即可 :属于类，与类一起加载一次
    public static sinConD instance=new sinConD();
//    constructor privately
    private sinConD(){}
}

//B.extend 子类们相同特征（共性属性，共性方法）放在父类中定义。
//value :把相同的属性和行为抽离出来
//a.1 caution 但是子类不能继承父类的构造器。
//b.super and this
class People {
//    mutual ˈmjuːtʃuəl property
//    the sub_class can not access the private member of super_class directly
//    just can access private member of super_class directly by addressable method of super_class
    private int age;
    public People() {}
    public People(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*
c.在子类方法中访问成员（成员变量、成员方法）满足：
就近原则，子类没有找子类、子类没有找父类、父类没有就报错！*/
/*d. method override 子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法。
建议重写方法都加@Override注解，代码安全，优雅！
    d.1 ruler
    类重写父类方法时，访问权限必须大于或者等于父类 （暂时了解 ：缺省 < protected < public）
    子类不能重写父类的静态方法，如果重写会报错的。
*/
/*e. super_class constructor
子类中所有的构造器默认都会先访问父类中无参的构造器，再执行自己。
子类构造器的第一行语句默认都是：super()，不写也存在。
* */
class Student extends People{
    int scores;
    public Student(){
//      this() call the sub_class constructor
        this(98);
//      注意：this(…) super(…) 都只能放在构造器的第一行，所以二者不能共存在同一个构造器中。
    }
    public Student(int age){
        super(age);
    }

}