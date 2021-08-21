package com.JAVa;

import java.util.Scanner;

public class AreaParalellogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of Paralellogram : ");
        int b = sc.nextInt();
        System.out.print("Enter the Height of Paralellogram : ");
        int h = sc.nextInt();
        int paralellogram_area = (b*h);
        System.out.println("Area of Paralellogram : "+paralellogram_area);
    }
}
