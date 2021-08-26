package com.JAVa;

import java.util.Scanner;

public class CSAcylinder {
    public static void main(String[] args) {
        System.out.println("CSA of Cylinder");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of cylinder : ");
        float r = sc.nextFloat();
        System.out.print("Enter Height of Cylinder : ");
        float h = sc.nextFloat();
        float PI = 3.14f;
        float CSA =2*(PI*r*h);
        System.out.println("CSA of Cylinder : "+CSA);
    }
}
