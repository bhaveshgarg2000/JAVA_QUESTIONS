package com.JAVa;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Compound Interest");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate of Interest : ");
        double r = sc.nextDouble();
        System.out.println("Enter Time Period : ");
        double t = sc.nextDouble();

            Double compound_interest = (float) p * (Math.pow((1 + r/100),(t)));
        System.out.println("Compound Interest : "+compound_interest);

    }
}
