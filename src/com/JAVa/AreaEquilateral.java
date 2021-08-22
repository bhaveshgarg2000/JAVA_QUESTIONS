package com.JAVa;

import java.util.Scanner;

public class AreaEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of triangle : ");
        float a = sc.nextFloat();
        double Area_equilateral = (1.73*a*a)/4;
        System.out.println("Area of Equilateral Triangle : "+Area_equilateral);
    }
}
