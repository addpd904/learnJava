package com.basisgrammar;

import java.util.Scanner;

public class basisGrammar {
    // a. operator
    public static void oper(){
        int a=4;
        int b=66;
        // a.1 logic operator
        //       and
        boolean boo=a==b&a>=b;
        //        short-circuit and
        boolean boo1=a==b&&a>=b;
        //        short-circuit or
        boolean boo2=a==b||a>=b;
        System.out.println(boo1);
        //      a.2 condition expression
        int max=(a>b) ? a:b;
        System.out.println(max);
    }
    //b.process control
    public static  void proControl1(){
//        b.1 if
        int a=100;
        int num2=33;
//        way1 if there is just one statement,we can omit braces
        if(a>=num2)
            System.out.println("a is larger than num2");
//        way2
        if (a==num2){

        }else if (a>=num2){

        }
//        way3
        if (a==num2){

        }else if (a>=num2){

        }else {

        }
//        b.2 switch
//        b.2.1 basis grammar
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a num,please\n");
        num3=sc.nextInt();

        switch (num3){
            case 1:
                System.out.println("that is great");
                break;
            case 2:
                System.out.println("welcome to java");
                break;
            default:
                System.out.println("well down");
        }
//        b.2.2 caution 1.the switch has penetrativity penɪtrəˈtɪvəti
//                      2. don't support double float long

    }
    public static void proControl2(){
//        b.3 for loop :structure :initiation statement ,loop condition ,iteration statement
        for (int i=0;i<4;i++){
            System.out.println("a for statement");
            if (i==2)
                break;
        }
//        b.4 while
        int i=0;
        while (i<3){
            i++;
        }
//        b.5 do while :post-conditions
        int j=0;
        do{
            System.out.println("this is a post-condition");
            j++;
        }while (j<2);
//         b.6 endless loop
//        for (;;){}
//        while (true){}
    }

    public static void main(String[] args){
        proControl2();
    }
}
