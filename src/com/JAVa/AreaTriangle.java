package com.JAVa;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Breadth of triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Height of triangle : ");
        int h = sc.nextInt();

        int area = (b*h)/2;
        System.out.println("Area of Triangle : "+area);
    }
}
