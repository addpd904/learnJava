package com.stage3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class SetAndList {
    /*
    * a.1 content
    * 集合的大小不固定，启动后可以动态变化，类型也可以选择不固定。集合更像气球。
    * a.2 caution
    * 集合只能存储引用数据类型的数据。
    * a.3 difference in array set
    * 数组适合做数据个数和类型确定的场景。
        集合适合做数据个数不确定，且要做增删元素的场景，集合种类更多，功能更强大。
    *a.4 set and genericity
   * 泛型可以约定集合存储元素的类型
   *
   * a.5 classification
   * 1. Collection单列集合，每个元素（数据）只包含一个值。(set list)
    Map双列集合，每个元素包含两个值（键值对）。
    2. Set系列集合：添加的元素是无序、不重复、无索引。
        HashSet: 无序、不重复、无索引；LinkedHashSet: 有序、不重复、无索引。
        TreeSet：按照大小默认升序排序、不重复、无索引。
    3. List系列集合：添加的元素是有序、可重复、有索引。
        ArrayList、LinekdList ：有序、可重复、有索引。

     * */
    /*
    * b.1 Collection API
    public boolean add(E e)     把给定的对象添加到当前集合中
    public void clear()         清空集合中所有的元素
    public boolean remove(E e)  把给定的对象在当前集合中删除
    public boolean contains(Object obj) 判断当前集合中是否包含给定的对象
    public boolean isEmpty()    判断当前集合是否为空
    public int size()           返回集合中元素的个数。
    public Object[] toArray()   把集合中的元素，存储到数组中
    * */
    /*
    * b.2 traverse(three way)
    * b.2.1. iterator
    *迭代器遍历 , 遍历就是一个一个的把容器中的元素访问一遍。
     *1.1 get iterator
     * Iterator<E> iterator()
     * 1.2. API of iterator
     *方法名称
    boolean hasNext()   询问当前位置是否有元素存在，存在返回true ,不存在返回false
    E next()            获取当前位置的元素，并同时将迭代器对象移向下一个位置，注意防止取出越界。
    *
    * b.2.2 foreach
    * for(String ele : list) {    System.out.println(ele);}
    * b.2.3 lambda
    *
    * */
    public void testCollection(){
        Collection <Student> students=new ArrayList<>();
        students.add(new Student("jane",23));
        students.add(new Student("mary",19));
//        way 1 foreach
        for (Student stu : students){
            System.out.println(stu.getName());
        }
//        way2 lambda
        students.forEach(stu->System.out.println(stu.getName()));
//        equivalent to
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student stu) {
                System.out.println(stu.getName());
            }
        });
    }
    /*
    * c.LinekdList
    *c.1  ArrayList、LinekdList ：有序，可重复，有索引。
    * c.2 special API
    void add(int index,E element)   在此集合中的指定位置插入指定的元素
    E remove(int index)             删除指定索引处的元素，返回被删除的元素
    E set(int index,E element)      修改指定索引处的元素，返回被修改的元素
    E get(int index)                返回指定索引处的元素
    * for循环（因为List集合存在索引）
    *c.3
        * ArrayList底层是基于数组实现的，根据查询元素快，增删相对慢。
        *LinkedList底层基于双链表实现的，查询元素慢，增删首尾元素是非常快的。
        * 底层数据结构是双链表，查询慢，首尾操作的速度是极快的，所以多了很多首尾操作的特有API。
     * */
    /*
    * d.4 ArrayList
    *  第一次创建集合并添加第一个元素的时候，在底层创建一个默认长度为10的数组。
    *
     * */

}
class Student{
    private String name;
    private int age;

    public Student(String name , int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
