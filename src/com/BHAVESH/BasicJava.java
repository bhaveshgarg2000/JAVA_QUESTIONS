package com.BHAVESH;

import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {
    //write it on the console like c,String
        System.out.format("hello");
        System.out.println(" ");
        //write it on the console in next line
        System.out.println("Hello");

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of i : ");
        i = sc.nextInt();
        double r = Math.sqrt(i);
        System.out.println("Square root " + i + " : " +i);
    }
}
