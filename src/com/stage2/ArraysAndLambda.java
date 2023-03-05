package com.stage2;

import java.util.Arrays;

public class ArraysAndLambda {
    //
    /*
    A. Arrays is a tool class
    a.1 method
    * 方法名
        public static String toString (类型[] a)  返回数组的内容（字符串形式）
        public static void sort (类型[] a)        对数组进行默认升序排序
        public static <T> void sort (类型[] a, Comparator<? super T> c)   使用比较器对象自定义排序
        public static int binarySearch (int[] a, int key)                二分搜索数组中的数据，存在返回索引，不存在返回-1
    * */
    public void testArrays() {
        int[] arr = {1, 22, 54, 6};
        Arrays.sort(arr);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
//        B. Lambda (from JDK8)
        /*
         * a.1 content
         * 函数式接口：首先必须是接口、其次接口中有且仅有一个抽象方法的形式
         * Lambda表达式只能简化函数式接口的匿名内部类的写法形式
         * */
    }

    public void testLambda(){
        sp((int a)->{
            System.out.println("run fast");
        });

    }

    /*Lambda表达式的省略写法（进一步在Lambda表达式的基础上继续简化）
    参数类型可以省略不写。
    如果只有一个参数，参数类型可以省略，同时()也可以省略。
    如果Lambda表达式的方法体代码只有一行代码。可以省略大括号写,同时要省略分号！
    如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。此时，如果这行代码是return语句，
    必须省略return不写，同时也必须省略";"不写
     */
    public void testLambda55(){
        sp( a->
            System.out.println("run fast"));
    }
// equivalent to
     public void testLambda2(){
        sp(new Sports() {
            @Override
            public void run(int a) {
                System.out.println("run fast");
            }
        });
    }
    // equivalent to
    public void testLambda3(){
        class Spo implements Sports{
            @Override
            public void run(int a) {
                System.out.println("run fast");
            }
        }
        Sports sp=new Spo();
        sp(sp);
    }

    public void sp(Sports sp){
        sp.run(3);
    }


    public static void main(String[] args) {
        ArraysAndLambda aal = new ArraysAndLambda();
        aal.testArrays();
    }
}

interface Sports{
    abstract void run(int a);
}