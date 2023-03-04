package com.stage2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrapperClassAndRE {
    /*
    * brief: Java为了实现一切皆对象，为8种基本类型提供了对应的引用类型。
    后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型。
    * */
    /*
    * A.WrapperClass
    * a.1自动装箱：基本类型的数据和变量可以直接赋值给包装类型的变量。
    * 自动拆箱：包装类型的变量可以直接赋值给基本数据类型的变量。
    *a.2可以把字符串类型的数值转换成真实的数据类型（真的很有用）
    * Integer.parseInt(“字符串类型的整数”)
     *  */

    /*
    * B.RE
    *a.1字符串对象提供了匹配正则表达式的方法 public boolean matches(String regex)
     *
     * a.2 content
     *  [abc]	           只能是a, b, 或c
        [^abc]	           除了a, b, c之外的任何字符
        [a-zA-Z]           a到z A到Z，包括（范围）
        [a-d[m-p]]	       a到d，或m通过p：（[a-dm-p]联合）
        [a-z&&[def]]	   d, e, 或f(交集)
        [a-z&&[^bc]]	   a到z，除了b和c：（[ad-z]减法）
        [a-z&&[^m-p]]      a到z，除了m到p：（[a-lq-z]减法）
     * */

    /*
    *   .	任何字符
        \d	一个数字： [0-9]
        \D	非数字： [^0-9]
        \s	一个空白字符： [ \t\n\x0B\f\r]
        \S	非空白字符： [^\s]
        \w	[a-zA-Z_0-9] 英文、数字、下划线
        \W	 [^\w] 一个非单词字符
    * */

    /*
    X?	    X , 一次或根本不
    X*	        X，零次或多次
    X+	        X , 一次或多次
    X {n}	    X，正好n次
    X {n, }	    X，至少n次
    X {n,m}	    X，至少n但不超过m次
    * */

    /*
    * a.3 method
     public String replaceAll(String regex,String newStr)   按照正则表达式匹配的内容进行替换
     public String[] split(String regex)：                    按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。
    * */
    public void testRE(){
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱"+
        "itcast@itcast.cn,电话18762832633，0203232323"+
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
        // 需求：从上面的内容中爬取出 电话号码和邮箱。
        // 1.定义爬取规则
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|"+
                "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|(400-?\\d{3,8}-?\\d{3,8})";
        // 2.编译正则表达式成为一个匹配规则对象
         Pattern pattern = Pattern.compile(regex);
         // 3.通过匹配规则对象得到一个匹配数据内容的匹配器对象
         Matcher matcher = pattern.matcher(rs);
         // 4.通过匹配器去内容中爬取出信息
         while(matcher.find()){  System.out.println(matcher.group());};
//        matcher.find();
//          System.out.println(matcher.group());
    }

    public static void main(String args[]){
        WrapperClassAndRE wcar=new WrapperClassAndRE();
        wcar.testRE();
    }
}
