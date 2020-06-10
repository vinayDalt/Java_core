package com.beg.core;

public class ThisKeyword {
    /*  this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method. */
    int roll;
    String name;

    public void display(int roll, String name){
        //referring current instant variables
        this.roll = roll;
        this.name = name;

        System.out.println("this is display method");
        System.out.println(roll + " " + name);
    }
    public void print()
    {
        System.out.println("this is Print method");
        this.display(24,"vinay"); //referring current class method
    }

    ThisKeyword(){
        System.out.println("this is default constructor");
    }
    ThisKeyword(int a){
        this(); //referring current class constructor
        System.out.println(a);

    }
    public static void main(String args[]){

        ThisKeyword tk = new ThisKeyword(15);
        tk.print();
    }

}
