package com.company;

import java.lang.Math;
public class Triangle {
    int a,b,c;

    public Triangle(){

    }

    public int Perimetru(){
        int p=a+b+c;
        return p;
    }

    public double Arie(){
        int p=a+b+c;
        double rez=p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(p);
    }
}
