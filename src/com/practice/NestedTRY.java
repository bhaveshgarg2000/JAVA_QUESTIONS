package com.practice;

public class NestedTRY {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Going to Divide");
                int c = 20/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try{
//
                int d[] = new int[10];
                d[10] = 40;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Accessing array Element");
            }
        }catch (Exception e){
            System.out.println("Handled");
        }
        System.out.println("Rest of the code Executed");
    }
}
