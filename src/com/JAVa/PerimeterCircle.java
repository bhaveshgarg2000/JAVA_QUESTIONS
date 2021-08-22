package com.JAVa;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle : ");
        float r = sc.nextFloat();
        float PI = 3.14F;
        double peri =(float) 2*PI*r;
        System.out.println("Perimeter of circle : "+peri);
    }
}
