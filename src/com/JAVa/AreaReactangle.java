package com.JAVa;

import java.util.Scanner;

public class AreaReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Rectanle : ");
        int l = sc.nextInt();
        System.out.print("Enter the Width of Rectangle : ");
        int w = sc.nextInt();
        int area_rectangle = l*w;
        System.out.print("Area of Rectangle : "+area_rectangle);
    }
}
