package com.JAVa;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Bill_pay = 0;
        System.out.println("Electricity Bill Problem");
        System.out.print("No of units used : ");
        int units =  sc.nextInt();

            if(units<100){
        Bill_pay = units*1.20;

            }
            else if (units<=300)
            {
                Bill_pay = 100*1.20+(units-100)*2;
            }
            else if (units>300){
                Bill_pay =  100*1.20+200*2+(units-300)*3;
            }
        System.out.println("Bill to pay : "+Bill_pay);
    }
}
