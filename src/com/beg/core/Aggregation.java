package com.beg.core;

public class Aggregation {

    int square(int n){

        return n*n;
    }
}
class Circle{

    Aggregation ag;
    double p =3.14;
    double area(int r){
        ag = new Aggregation();
        int res = ag.square(r);

        return p*res;

    }

    public static void main (String[] args){

        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
