package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.a=3;
        triangle.b=4;
        triangle.c=5;

        System.out.println("Aria: " +triangle.Arie());
        System.out.println("Perimetru: "+triangle.Perimetru());
    }
}
