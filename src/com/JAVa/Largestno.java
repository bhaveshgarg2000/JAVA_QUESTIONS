package com.JAVa;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        if (a>b){
            max = a ;

        }
        else
        {
            max = b;
        }
        System.out.println("Largest Number : " +max);
    }
}
