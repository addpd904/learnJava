package com.stage3;

public class Map1 {
    /*
    * A. basic grammar
    * a.1 content
    * format :{key1=value1 , key2=value2 , key3=value3 , ...}\
    * Map集合的键 无序、不重复的 ; Map集合的键值对都可以为null。
     * */

    /*
    * B.application
    * a.1 application scene
    * 使用最多的Map集合是HashMap。
     *
    * */

    /*
    * C.method
    * a.API
    * 方法名称
    V put(K key,V value)    添加元素
    V remove(Object key)    根据键删除键值对元素
    void clear()            移除所有的键值对元素
    boolean containsKey(Object key)     判断集合是否包含指定的键
    boolean containsValue(Object value) 判断集合是否包含指定的值
    boolean isEmpty()   判断集合是否为空
    int size()          集合的长度，也就是集合中键值对的个数
    *
    * b.2 traverse
        方式一：键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值。
            Set<K> keySet()     获取所有键的集合
            V get(Object key)   根据键获取值
        方式二：键值对的方式遍历，把“键值对“看成一个整体，难度较大。
            Set<Map.Entry<K,V>> entrySet()    获取所有键值对对象的集合
            K  getKey()                       获得键
            V  getValue()                     获取值
        方式三：JDK 1.8开始之后的新技术：Lambda表达式。
        default void forEach(BiConsumer<? super K, ? super V> action) 结合lambda遍历Map集合
        maps.forEach((k , v) -> {   System.out.println(k +"----->" + v);});
    * */

    /*
    * D. implement class
    * a. HashMap
    * a.1 Set and HashMap
    * Set系列集合的底层就是Map实现的，只是Set集合中的元素只要键数据，不要值数据而
    * a.2 caution
    * 如果键要存储的是自定义对象，需要重写hashCode和equals方法。
    *
    * b. LinkedHashMap
    * b.1 theory
    * 原理：底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
    *c. TreeMap
    * c.1 caution
    * TreeMap集合是一定要排序的，可以默认排序，也可以将键按照指定的规则进行排序
    * c.2 DIY sort ruler (2 way)
    * 类实现Comparable接口，重写比较规则。
    集合自定义Comparator比较器对象，重写比较规则。
       c.3 TreeMap and TreeSet
       * TreeMap跟TreeSet一样底层原理是一样的。
     d.summary
     * HashMap:元素按照键是无序，不重复，无索引，值不做要求，基于哈希表（与Map体系一致）
        LinkedHashMap:元素按照键是有序，不重复，无索引，值不做要求，基于哈希表
        TreeMap：元素只能按照键排序，不重复，无索引的，值不做要求，可以做排序
     * */
}
