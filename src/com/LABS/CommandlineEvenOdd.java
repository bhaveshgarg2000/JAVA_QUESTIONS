package com.LABS;

public class CommandlineEvenOdd {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
    if(x%2==0){
        System.out.println("The number is Even");
    }
    else
    {
        System.out.println("the number is Odd");
    }

    }
}
