package com.JAVa;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float PI = 3.14f;
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        float volume_sphere = 4*(PI*r*r)/3;
        System.out.println("Volume of Sphere : "+volume_sphere);
    }
}
