package com.JAVa;

import java.util.Scanner;

public class CurrencyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Indian currency : ");
        float rupees = sc.nextFloat();
    float dollars = rupees / 70;
        System.out.print("Dollars : " +dollars);
    }
}
