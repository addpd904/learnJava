package com.stage3;

public class ImmutableSetStream {
    /*
    * A.Immutable set
    * a. content
    * 集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变。否则报错。
    * 当集合对象被不可信的库调用时，不可变形式是安全的。
    * b. create a immutable set
        static <E>  List<E>  of(E…elements)         创建一个具有指定元素的List集合对象
        static <E>  Set<E>  of(E…elements)           创建一个具有指定元素的Set集合对象
        static <K , V>   Map<K，V>  of(E…elements)   创建一个具有指定元素的Map集合对象
     * */

    /*
    *B. Stream
    * a.content
    先得到集合或者数组的Stream流（就是一根传送带）。把元素放上去。然后就用这个Stream流简化的API来方便的操作元素。
    b. get Stream
        default Stream<E> stream()                      获取当前集合对象的Stream流
        public static <T> Stream<T> stream(T[] array)   获取当前数组的Stream流
        public static<T> Stream<T> of(T... values)      获取当前数组/可变数据的Stream流

    c.method
    c.1 classification
    获取Stream流
        创建一条流水线，并把数据放到流水线上准备进行操作
    中间方法 支持链式编程。
        流水线上的操作。一次操作完毕之后，还可以继续进行其他操作。
    终结方法
    一个Stream流只能有一个终结方法，是流水线上的最后一个操作
    c.2 middle method
        Stream<T> filter(Predicate<? super T> predicate)    用于对流中的数据进行过滤。
        Stream<T> limit (long maxSize)                      获取前几个元素
        Stream<T> skip (long n)                             跳过前几个元素
        Stream<T> distinct ()                               去除流中重复的元素。依赖(hashCode和equals方法)
        static <T> Stream<T> concat (Stream a, Stream b)    合并a和b两个流为一个流
     d. end method
     * 名称
        void forEach (Consumer action)  对此流的每个元素执行遍历操作
        long count ()                   返回此流中的元素数
     e.collect stream
        R collect (Collector collector)      开始收集Stream流，指定收集器
        Collectors工具类提供了具体的收集方式
        public static <T> Collector toList ()       把元素收集到List集合中
        public static <T> Collector toSet ()        把元素收集到Set集合中
        public static  Collector toMap (Function keyMapper , Function valueMapper)      把元素收集到Map集合中

     *
    d.summary
    * Stream流：方便操作集合/数组的手段。
        集合/数组：才是开发中的目的。
        操作的结果数据最终要恢复到集合或者数组中去。(collect )
    * */
}
