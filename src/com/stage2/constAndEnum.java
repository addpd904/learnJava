package com.stage2;
/*
* A.final
* a. effect
* 修饰类：表明该类是最终类，不能被继承。
修饰方法：表明该方法是最终方法，不能被重写。
修饰变量：表示该变量第一次赋值后，不能再次被赋值(有且仅能被赋值一次)。
* when embellishing the variable ,just life c's const:final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生变化的。
*  */

/*
 * B.public static final: just like c's Macro definition
 * 在编译阶段会进行“宏替换”：把使用常量的地方全部替换成真实的字面量
 *规范：英文单词全部大写
 * */

/*
* C.enum
* essence :枚举类都是继承了枚举类型：java.lang.Enum
            枚举都是最终类，不可以被继承。
            构造器都是私有的，枚举对外不能创建对象。
* */
enum Seanson{
    SPRING,SUMMER,AUTUMN,WINTER
}
public class constAndEnum {
}
