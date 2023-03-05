package com.stage3;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Multithreading1 {
    /*
    * A.create thread
    * Java是通过java.lang.Thread 类来代表线程的。
    * a. way 1 extend Thread
    * 定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
    创建MyThread类的对象
    调用线程对象的start()方法启动线程（启动后还是执行run方法的）
    * b. way 2 implement Runnable interface
    * 定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
        创建MyRunnable任务对象
        把MyRunnable任务对象交给Thread处理。
        调用线程对象的start()方法启动线程

    * c. way 3 implement Callable interface
    *优点是：可以得到线程执行的结果。
    得到任务对象
        定义类实现Callable接口，重写call方法，封装要做的事情。
        用FutureTask把Callable对象封装成线程任务对象。
    把线程任务对象交给Thread处理。
    调用Thread的start方法启动线程，执行任务
    线程执行完毕后、通过FutureTask的get方法去获取任务执行的结果。
     * */
    public void testCallableThread(){
        Callable<String> worker=new Worker();
        //  FutureTask对象的作用1： 是Runnable的对象（实现了Runnable接口），可以交给Thread了
        //  FutureTask对象的作用2： 可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果
        FutureTask<String> f1 =new FutureTask<String>(worker);
        //交给线程处理
        Thread t1 =new Thread(f1);
        t1.start();
//        get the result of returning
        try {
//            blocking 如果f1任务没有执行完毕，这里的代码会等待，直到线程1跑完才提取结果。
            String res=f1.get();
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
    * B.Thread class
    * a.1 constructor
        public Thread(String name)      可以为当前线程指定名称
        public Thread(Runnable target)  封装Runnable对象成为线程对象
        public Thread(Runnable target ，String name )    封装Runnable对象成为线程对象，并指定线程名称
      b. api
        public static Thread currentThread()：       返回对当前正在执行的线程对象的引用
        public static void sleep(long time)         让当前线程休眠指定的时间后再继续执行，单位为毫秒。
    * */

    /*
    * C. thread security and thread synchronization /ˌsɪŋkrənaɪˈzeɪʃ(ə)n/
     *a.
    * 1.definition
    * 多个线程同时操作同一个共享资源的时候可能会出现业务安全问题，称为线程安全问题。
    * 2.reason 存在多线程并发 同时访问共享资源 存在修改共享资源
    * b.solution : thread synchronization
    * 让多个线程实现先后依次访问共享资源，这样就解决了安全问题
    * 加锁：让多个线程实现先后依次访问共享资源，这样就解决了安全问题。
    * b.1 同步代码块
    * 作用：把出现线程安全问题的核心代码给上锁。
    * 原理：每次只能一个线程进入，执行完毕后自动解锁，其他线程才可以进来执行。
    * format :
        synchronized(同步锁对象) {	操作共享资源的代码(核心代码)}
    锁对象的规范要求
        规范上：建议使用共享资源作为锁对象。
        对于实例方法建议使用this作为锁对象。
        对于静态方法建议使用字节码（类名.class）对象作为锁对象。
        b.2同步方法 每次只能一个线程进入，执行完毕以后自动解锁，其他线程才可以进来执行。
        * format :修饰符 synchronized 返回值类型 方法名称(形参列表) {	操作共享资源的代码}
        同步方法底层原理
        同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
        如果方法是实例方法：同步方法默认用this作为的锁对象。但是代码要高度面向对象！
        如果方法是静态方法：同步方法默认用类名.class作为的锁对象。
        b.3Lock锁
        * Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来构建Lock锁对象。
        * b.3.1 constructor
            public ReentrantLock ()   获得Lock锁的实现类对象
        * b.3.2 API
        void lock()     获得锁
        void unlock()   释放锁
     * */

    /*
    D.Thread communication
    所谓线程通信就是线程间相互发送数据，线程间共享一个资源即可实现线程通信。
    a.通过共享一个数据的方式实现。
        根据共享数据的情况决定自己该怎么做，以及通知其他线程怎么做。
    b.API
        void wait   ()  让当前线程等待并释放所占锁，直到另一个线程调用notify()方法或 notifyAll()方法
        void notify ()  唤醒正在等待的单个线程
        void notifyAll  ()  唤醒正在等待的所有线程
        caution :上述方法应该使用当前同步锁对象进行调用

    */
    public static void main(String[]args){
        Multithreading1 test=new Multithreading1();
        test.testCallableThread();
    }
}

class Worker implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("making cookie");
        return "a cookie";
    }
}
