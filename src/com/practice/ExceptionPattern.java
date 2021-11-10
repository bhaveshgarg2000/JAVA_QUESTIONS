package com.practice;

public class ExceptionPattern {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            a[10] = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Parent Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Rest Of the code Executed");

    }

}