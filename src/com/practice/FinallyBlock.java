package com.practice;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int data = 25/0;
            System.out.println(data);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block is always Executed");
        }
        System.out.println("Rest of the code Executed");

    }
}
