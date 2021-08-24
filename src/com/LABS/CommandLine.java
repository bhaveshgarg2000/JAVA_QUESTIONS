package com.LABS;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println("The product of two variables : " +(x*y));
    }
}
