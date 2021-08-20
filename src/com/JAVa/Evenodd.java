package com.JAVa;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number of your choice : ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("The number is EVEN");
        }
        else
        {
            System.out.println("The number is ODD");
        }
    }
}
