package com.stage3;

public class CollectionSum {
    /*
    * a. application scene
    * 1.如果希望元素可以重复，又有索引，索引查询要快？
        用ArrayList集合，基于数组的。（用的最多）
        2.  如果希望元素可以重复，又有索引，增删首尾操作快？
        用LinkedList集合，基于链表的。
        3.  如果希望增删改查都快，但是元素不重复、无序、无索引。
        用HashSet集合，基于哈希表的。
        4.  如果希望增删改查都快，但是元素不重复、有序、无索引。
        用LinkedHashSet集合，基于哈希表和双链表。
        5.  如果要对对象进行排序。
        用TreeSet集合，基于红黑树。后续也可以用List集合实现排序。
    * */
    /*
    * b Collections : a utility class
    *b.1 method
    * 使用范围：只能对于List集合的排序。
    public static <T> void sort(List<T> list)               将集合中元素按照默认规则排序
        注意：本方式不可以直接对自定义类型的List集合排序，除非自定义类型实现了比较规则Comparable接口。
    public static <T> void sort(List<T> list，Comparator<? super T> c)   将集合中元素按照指定规则排序
    * */
}
