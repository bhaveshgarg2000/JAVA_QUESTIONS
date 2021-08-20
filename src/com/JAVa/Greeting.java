package com.JAVa;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String c = sc.nextLine();

        System.out.println("Hello " + c + "." + "How are you!!!");
    }
}
