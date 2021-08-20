package com.JAVa;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter Second number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the following operation");
        System.out.println("For addition + ");
        System.out.println("For subtraction - ");
        System.out.println("For multiplication * ");
        System.out.println("For division / : ");

        System.out.print("Enter Operation : ");
        char op = sc.next().charAt(0);
        if (op == '+')
        {
            System.out.println("The sum of " + a + " and " + b + " = " + (a+b));
        }
        else if(op == '-')
        {
            System.out.println("The subtraction of " + a + " and " + b + " = " + (a-b));
        }
        else if (op == '*')
        {
            System.out.println("The multiplication of " + a + " and " + b + " = " +(a*b));
        }
        else if (op == '/')
        {
            System.out.println("The division of " + a + " and " + b + " = " +(a/b));
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}
