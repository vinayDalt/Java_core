package com.beg.core;

public class Constructor {

    //instance variable
    int num;
    String s1;
    //default contructor
    Constructor()
    {
        System.out.println("this is constructor");

    }
    //parametrized constructor
    Constructor(int n, String s){
        num = n;
        s1 = s;

    }
    public void display(){
        System.out.println(num +" "+ s1);
    }
    public static void main(String args[])
    {
        Constructor constructor = new Constructor(1, "vinay");
        constructor.display();

    }
}
