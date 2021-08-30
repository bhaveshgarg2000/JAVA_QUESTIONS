package com.JAVa;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = sc.nextInt();
        int count =0;
        while(n>0){
            int rem = n%10;
            n/=10;
            count = count*10+rem;
        }
        System.out.println("Reverse No : "+count);
    }
}
