package com.JAVa;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your no : ");
        int n = sc.nextInt();

        int count = 0;
        while (n>0){
        int rem = n % 10;
        if (rem == 2){
            count++;
     }
        n= n/10;
        }
        System.out.println(count);
    }
}
