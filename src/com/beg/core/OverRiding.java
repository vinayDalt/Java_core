package com.beg.core;

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//Rules for Java Method Overriding
//The method must have the same name as in the parent class
//The method must have the same parameter as in the parent class.
//There must be an IS-A relationship (inheritance).
public class OverRiding {

    public void parentFunction(){

        System.out.println("this is parent class");
    }

}
class Child extends OverRiding{

    public static void main(String[] args){
        Child obj = new Child();
        obj.parentFunction();
    }
}
