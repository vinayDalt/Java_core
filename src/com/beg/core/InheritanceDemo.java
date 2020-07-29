package com.beg.core;



public class InheritanceDemo {

int salary=25000;
}
class Bonus extends InheritanceDemo{

    int bonus = 12000;

    public static void main(String[] args){

        Bonus b = new Bonus();
        System.out.println(b.bonus);
        System.out.println(b.salary);
    }


}
