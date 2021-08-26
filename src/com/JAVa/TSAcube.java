package com.JAVa;

import java.util.Scanner;

public class TSAcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Surface Area of Cube");
        System.out.print("Enter side of Cube : ");
        int a = sc.nextInt();
        int TSA = 6*(a*a);
        System.out.println("TSA of Cube : "+TSA);
    }
}
