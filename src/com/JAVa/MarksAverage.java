package com.JAVa;

import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of CAO : ");
        int a = sc.nextInt();
        System.out.print("Enter Marks of JAVA : ");
        int b = sc.nextInt();
        System.out.print("Enter Marks of GERMANY : ");
        int c = sc.nextInt();
        System.out.print("Enter marks of ADA  : ");
        int d = sc.nextInt();
        float average = (a+b+c+d)/4;
        System.out.println("Average Marks : "+average);
    }
}
