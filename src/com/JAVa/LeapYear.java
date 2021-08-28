package com.JAVa;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean leap = true;
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year %4 ==0)
        {
            if (year%100 ==0){
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            }
        }else leap = false ;

            if (leap){
                System.out.println(year + " is leap year.");
            }
            else
                System.out.println(year +" is not leap year.");

    }
}
