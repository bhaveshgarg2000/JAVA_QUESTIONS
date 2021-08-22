package com.JAVa;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle ");
        System.out.print("Enter the value of Length : ");
        int a = sc.nextInt();
        System.out.print("Enter the value Breadth : ");
        int b = sc.nextInt();

        int perimeter  = 2*(a+b);
        System.out.print("Perimeter of Rectangle : "+perimeter);
    }
}
