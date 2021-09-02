package com.JAVa;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long n = sc.nextLong();

        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

            if (sum ==n){
                System.out.println(n + " is Perfect Number.");
            }
        else {
                System.out.println(n + " is not Perfect Number.");

            }



    }
}
