package com.JAVa;

import java.util.Scanner;

public class PeriEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Equilateral Triangle : ");
        int a = sc.nextInt();
        int peri = 3*a*a*a;
        System.out.println("Perimeter of Equilateral Triangle : "+peri);
    }
}
