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