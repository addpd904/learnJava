package com.stage3;

public class Exception1 {
    /*
    * A.
    * a.
    * a.1 content 异常一旦出现了，如果没有提前处理，程序就会退出JVM虚拟机而终止.
     * 语法错误不算在异常体系中。
    * */
    /*
    * B.classification
    * a content of classification
    * a.1 Error 系统级别问题、JVM退出等，代码无法控制。
     *a.2 Exception
     * java.lang包下，称为异常类，它表示程序本身可以处理的问题
     * a.2.1  运行时异常 RuntimeException及其子类：运行时异常，编译阶段不会报错。 (空指针异常，数组索引越界异常)
     *a.2.2    受检异常 除RuntimeException之外所有的异常：编译时异常，编译期必须处理的，否则程序不能通过编译。 (日期格式化异常)。
     *
     * b.RuntimeException
     * b.1 example
     * 类型转换异常：ClassCastException
     *  数字转换异常： NumberFormatException
     *  数组索引越界异常: ArrayIndexOutOfBoundsException
     *c.编译时异常(受检异常 ) 不是RuntimeException或者其子类的异常
     * c.1 example 日期解析异常：ParseException
     * */

    /*
    * C.default handle process
     * 默认异常处理机制。 (默认的异常处理机制并不好，一旦真的出现异常，程序立即死亡！)
    *   默认会在出现异常的代码那里自动的创建一个异常对象：Exception。
        异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机。
        虚拟机接收到异常对象后，先在控制台直接输出异常栈信息数据。
        直接从当前执行的异常点干掉当前程序。
        后续代码没有机会执行了，因为程序已经死亡。
    *
    * b. handle exception(way 1) : throws
    * throws：用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理。
    *  content
    * 方法 throws Exception{}
    * c.way 2 try…catch…
    *    try{// 监视可能出现异常的代码
    * }catch(异常类型1 变量){ // 处理异常
    * }catch(异常类型2 变量){// 处理异常  }...
    *d.summary
       * 在开发中按照规范来说第三种方式是最好的：底层的异常抛出去给最外层，最外层集中捕获处理。
        建议在最外层调用处集中捕获处理即可。
    * * */

    /*
    * D.DIY exception
    * a.DIY 编译时异常
    * 定义一个异常类继承Exception.
    *重写构造器。
     在出现异常的地方用throw new 自定义对象抛出，
    作用：编译时异常是编译阶段就报错，提醒更加强烈，一定需要处理！
    * b. DIY RuntimeException
    * 定义一个异常类继承RuntimeException.
        重写构造器。
        在出现异常的地方用throw new 自定义对象抛出!
        作用：提醒不强烈，编译阶段不报错！！运行时才可能出现！！
    * */
}
