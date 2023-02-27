package com.basisgrammar;

public class StingAndArrayList {
    private static void ArrayList(){
//
    }



    public static void main(String []args){
        Str str1=new Str();
        str1.str();
    }
}
class Str{
//    A. string
    /*a.1caution
    a.1.1 const string
        以“”方式给出的字符串对象，在字符串常量池中存储。
        String变量每次的修改其实都是产生并指向了新的字符串对象。原来的字符串对象都是没有改变的，所以称不可变字符串。
        String s2 = new String("abc"); 这句代码实际上创建了两个对象
    a.1.2 字符串的内容比较不适合用“==”比较,we need to use method equals
    */
//    b. generate string object
    /*
        直接使用“”定义
        public String()                 创建一个空白字符串对象，不含有任何内容
        public String(String original)  根据传入的字符串内容，来创建字符串对象
        public String(char[] chs)       根据字符数组的内容，来创建字符串对象
        public String(byte[] chs)       根据字节数组的内容，来创建字符串对象
    *
    * */
    //    c.method
    public static void str(){
        String st1="hello";
        String st2="hello";
//    1. equal
        boolean boo1=st1.equals(st2);
        System.out.println(boo1);
//  equals ignore Case
       String st3="HELLO";
        st3.equalsIgnoreCase(st1);
//        2. other method
    /*
    public int length()     返回此字符串的长度
    public char charAt(int index)       获取某个索引位置处的字符
    public char[] toCharArray()：        将当前字符串转换成字符数组返回
    public String substring(int beginIndex, int endIndex)       根据开始和结束索引进行截取，得到新的字符串（包前不包后）
    public String substring(int beginIndex)     从传入的索引处截取，截取到末尾，得到新的字符串
    public String replace(CharSequence target, CharSequence replacement)        使用新值，将字符串中的旧值替换，得到新的字符串
    public String[] split(String regex)     根据传入的规则切割字符串，得到字符串数组返回
      */
    }
}

//B
class ArrayLis{
// a.1 cautionArrayList 集合的大小是不固定的。
//   泛型只能支持引用数据类型，不支持基本数据类型。
//    a.2 genericity
   /* ArrayList<String> ：此集合只能操作字符串类型的元素。
    ArrayList<Integer>：此集合只能操作整数类型的元素。*/

//    b.method
/*
    public E get(int index)             返回指定索引处的元素
    public int size()                   返回集合中的元素的个数
    public E remove(int index)          删除指定索引处的元素，返回被删除的元素
    public boolean remove(Object o)     删除指定的元素，返回删除是否成功
    public E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
 */



}