package com.beg.core;


//Method overloading increases the readability of the program.
//Different ways to overload the method
//There are two ways to overload the method in java
//By changing number of arguments
//By changing the data type
public class OverLoading {

    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
class Add{

    public static void main(String[] args){
        OverLoading ov = new OverLoading();
        System.out.println(ov.sum(3,5));
        System.out.println(ov.sum(4,6,8));
    }
}
