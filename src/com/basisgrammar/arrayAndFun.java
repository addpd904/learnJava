package com.basisgrammar;

public class arrayAndFun {
    public static void array(){
//        A. array
//        array is a reference data type,cause the array name is a pointer that point to address of first element
//static initialization /ɪ,nɪʃəlaɪ'zeɪʃən/
        String[] names={"zs","zjl"};
//property  length
        System.out.println(names.length);
//        dynamic initialization:just ensure the length and data type ,the specific data will be ensured later on .
//        default value
        /* caution 局部变量,没有默认值，使用之前需要完成赋值
         member variable 才有初始值
        * byte、short、int 、char、long类型数组元素的默认值都是0
        float、double类型数组元素的默认值都是0.0
        boolean类型数组元素的默认值是false、String类型数组元素的默认值是null
        * */
        int[] arr=new int [3];
    }
//    B. function
//    B.1 同一个类中，出现多个方法名称相同，但是形参列表是不同的(形参的个数、类型、顺序不同)，那么这些方法就是重载方法。
//    value:可读性好，方法名称相同提示是同一类型的功能，通过形参不同实现功能差异化的选择，这是一种专业的代码设计。
    public static void func(int a){
    }
    public static void func(int a,int c){
    }
    public static void main(String args[]){

    }
}
