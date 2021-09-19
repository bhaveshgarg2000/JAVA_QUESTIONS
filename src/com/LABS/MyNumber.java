package com.LABS;


import java.util.Scanner;

public class MyNumber {
    int x;

    MyNumber(){
        x=0;
    }

    MyNumber(int x){
        this.x = x;
    }

    void isNegative(){
        if (x<0){
            System.out.println("The No. is Negative");
        }
    }

    void isPositive(){
        if (x>0){
            System.out.println("The No. is Postive");
        }
    }
    void isZero(){
        if (x==0){
            System.out.println("The No. is Equals to Zero");
        }
    }

    void isOdd(){
        if (x%2==1){
            System.out.println("The No. is Odd");
        }
    }
    void isEven(){
        if (x%2==0){
            System.out.println("The No. is Even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Z: ");
        int z = sc.nextInt();
        MyNumber y = new MyNumber(z);
        y.isEven();
        y.isNegative();
        y.isOdd();
        y.isPositive();
        y.isZero();


    }
}
