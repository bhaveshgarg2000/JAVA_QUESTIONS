package com.practice;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int data = 25/5;
            System.out.println(data);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block is always Executed");
        }
        System.out.println("Rest of the code Excuted");

    }
}
