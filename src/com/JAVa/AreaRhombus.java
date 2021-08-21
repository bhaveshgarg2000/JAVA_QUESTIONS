package com.JAVa;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of First Diagonal : ");
        int p = sc.nextInt();
        System.out.print("Enter the value of Second Diagonal : ");
        int q = sc.nextInt();
        int area = (p*q)/2;
        System.out.println("Area of Diagonal : "+area);
    }
}
