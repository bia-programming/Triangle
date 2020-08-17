package com.company;
public class Main {

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.a=3;
        triangle.b=4;
        triangle.c=5;

        String strDouble = String.format("%.2f", triangle.Arie());

        System.out.println("Aria: " +strDouble);
        System.out.println("Perimetru: "+triangle.Perimetru());
    }
}
