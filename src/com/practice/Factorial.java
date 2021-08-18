package com.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of factorial : ");
        n = scan.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(n + " *" + i + " = " + n*i);
                    }
    }
}
