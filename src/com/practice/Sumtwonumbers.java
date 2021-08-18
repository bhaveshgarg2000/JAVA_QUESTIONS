package com.practice;

import java.util.Scanner;

public class Sumtwonumbers {
    public static void main(String[] args) {
        int x,y,sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first Number = ");
        x = scan.nextInt();
        System.out.print("Enter second Number = ");
        y = scan.nextInt();
    sum = x+y;
        System.out.println("The sum of two numbers = " +sum);
    }

}
