package com.beg.core;

//The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
public class StaticKeyword {

    int roll;
    String name;
    static String college="DIATM";

    StaticKeyword(int n , String s){
        roll = n;
        name = s;
    }
    public void display(){
        System.out.println(roll + " " + name + " " + college);
    }

    public static void main(String args[]){
        StaticKeyword sk = new StaticKeyword(1,"vinay");
        sk.display();
    }
}
