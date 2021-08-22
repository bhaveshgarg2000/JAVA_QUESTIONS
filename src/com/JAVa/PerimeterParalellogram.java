package com.JAVa;

import java.util.Scanner;

public class PerimeterParalellogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Paralellogram");
        System.out.print("Enter the value of base : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of Side : ");
        int b = sc.nextInt();
        int perimeter = 2*(a+b);
        System.out.println("Perimeter of Paralellogram : "+perimeter);
    }
}
