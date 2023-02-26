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
    public static  void proControl(){
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
    }
    public static void main(String[] args){
        proControl();
    }
}
