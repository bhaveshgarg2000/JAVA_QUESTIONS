package com.JAVa;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle : ");
        float r = sc.nextFloat();
        float PI = 3.14F;
        //typecast of float values in double
      double area =PI*(r*r);
        System.out.println("Area of Circle : " +area);
    }
}
