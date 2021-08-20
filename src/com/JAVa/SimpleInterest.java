package com.JAVa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount : ");
        int a = sc.nextInt();
        System.out.print("Enter rate of interest : ");
        int b = sc.nextInt();
        System.out.print("Enter time period : ");
        int c = sc.nextInt();
    int Si = (a*b*c)/100;
        System.out.println("Simple Interest : " + Si);
    }
}
