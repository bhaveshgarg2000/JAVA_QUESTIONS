package com.JAVa;

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume of Pyramid");
        System.out.print("Enter Base Length : ");
        int l = sc.nextInt();
        System.out.print("Enter Base Width : ");
        int w = sc.nextInt();
        System.out.print("Enter Pyramid Height : ");
        int h = sc.nextInt();
        int volume = (l*w*h)/3;
        System.out.println("Volume of Pyramid : "+volume);
    }
}
