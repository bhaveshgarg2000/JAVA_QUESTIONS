package com.LABS;

public class CommandlineCircleArea {
    public static void main(String[] args) {

        double r = Double.parseDouble(args[0]);
        double PI = 3.14;
        double area_cicle  = PI*(r*r);
        System.out.println("Area of circle : "+area_cicle);
    }
}
