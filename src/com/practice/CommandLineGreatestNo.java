package com.practice;

import java.util.Scanner;

public class CommandLineGreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = (a>b?(a>c?a:c):(b>c?b:c));
        System.out.println("Largest No : "+d);
    }
}
