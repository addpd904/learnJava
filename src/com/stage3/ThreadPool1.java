package com.stage3;

public class ThreadPool1 {
    /*
    * A.get Thread Pool object
    *
    * a. way1  使用ExecutorService的实现类ThreadPoolExecutor自创建一个线程池对象
    * a.1 constructor
    * public ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,  long keepAliveTime,TimeUnit unit,
    * BlockingQueue<Runnable> workQueue,ThreadFactory threadFactory,RejectedExecutionHandler handler)
    *   a.1.1argument
        参数一：指定线程池的线程数量（核心线程）： corePoolSize
        参数二：指定线程池可支持的最大线程数： maximumPoolSize
        参数三：指定临时线程的最大存活时间： keepAliveTime
        参数四：指定存活时间的单位(秒、分、时、天)： unit
        参数五：指定任务队列： workQueue
        参数六：指定用哪个线程工厂创建线程： threadFactory
        参数七：指定线程忙，任务满的时候，新任务来了怎么办： handler
       a.1.2example :ExecutorService pools = new ThreadPoolExecutor(3, 5, 8 , TimeUnit.SECONDS, new ArrayBlockingQueue<>(6),
       Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy());
      a.2 线程池如何处理Runnable任务
        使用ExecutorService的方法：
        void  execute(Runnable target)
      a.3   线程池如何处理Callable任务，并得到任务执行完后返回的结果。
            使用ExecutorService的方法：
            Future<T> submit(Callable<T> command)

      * b.  way 2使用Executors（线程池的工具类）调用方法返回不同特点的线程池对象
      * Executors的底层其实也是基于线程池的实现类ThreadPoolExecutor创建线程池对象的。
        b.1 API
        public static ExecutorService newCachedThreadPool()             线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了一段时间则会被回收掉。
        public static ExecutorService newFixedThreadPool (int nThreads) 创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
        public static ExecutorService newSingleThreadExecutor ()        创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。
        public static ScheduledExecutorService newScheduledThreadPool (int corePoolSize)    创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。
        b.2 shortcoming
            存在问题
        public static ExecutorService newFixedThreadPool (int nThreads)     允许请求的任务队列长度是Integer.MAX_VALUE，可能出现OOM错误（ java.lang.OutOfMemoryError ）
        public static ExecutorService newSingleThreadExecutor()
        public static ExecutorService newCachedThreadPool()                 创建的线程数量最大上限是Integer.MAX_VALUE，线程数可能会随着任务1:1增长，也可能出现OOM错误（ java.lang.OutOfMemoryError ）
        public static ScheduledExecutorService newScheduledThreadPool (int corePoolSize)

        * *
    * */

    /*
    * B. ExecutorService
    * a. API
        void execute(Runnable command)      执行任务/命令，没有返回值，一般用来执行 Runnable 任务
        Future<T> submit(Callable<T> task)  执行任务，返回未来任务对象获取线程结果，一般拿来执行 Callable 任务
        void shutdown()                     等任务执行完毕后关闭线程池
        List<Runnable>  shutdownNow()       立刻关闭，停止正在执行的任务，并返回队列中未执行的任务

    *
    * */
}
