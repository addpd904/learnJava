package com.stage3;

public class Set2 {
    /*
    * a.1 characteristic
    *  HashSet : 无序、不重复、无索引。
        LinkedHashSet：有序、不重复、无索引。(这里的有序指的是保证存储和取出的元素顺序一致)
        TreeSet：排序、不重复、无索引。
    * */

    /*
    * b HashSet 哈希表: 数组+链表+红黑树组成(from JDK8)  哈希表是一种对于增删改查数据性能都较好的结构。
    哈希值:是JDK根据对象的地址，按照某种规则算出来的int类型的数值。
        b.1 theory
        哈希表的详细流程
         创建一个默认长度16，默认加载因为0.75的数组，数组名table
         根据元素的哈希值跟数组的长度计算出应存入的位置
         判断当前位置是否为null，如果是null直接存入，如果位置不为null，表示有元素，  则调用equals方法比较属性值，如果一样，则不存，如果不一样，则存入数组。
         当数组存满到16*0.75=12时，就自动扩容，每次扩容原先的两倍
        结论：如果希望Set集合认为2个内容一样的对象是重复的，
        必须重写对象的hashCode()和equals()方法
     * */

    /*
    *c.TreeSet
    * c.1 content TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。
        注意：TreeSet集合是一定要排序的，可以将元素按照指定的规则进行排序。
             对于自定义类型如Student对象，TreeSet无法直接排序。
             想要使用TreeSet存储自定义类型，需要制定排序规则
       c.2 realize sorting
            way1 实现Comparable接口重写里面的compareTo方法来定制比较规则。
            way2 TreeSet集合有参数构造器，可以设置Comparator接口对应的比较器对象，来定制比较规则。
            caution :如果TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序。
    * */


}
