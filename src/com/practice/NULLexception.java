package com.practice;

public class NULLexception {
    public static void main(String[] args) {

        try{
    String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("Error Handled");
        }
    }
}
