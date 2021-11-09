package com.practice;

public class Numberformatexception {
    public static void main(String[] args) {


        try{
        String name = "BHAVESH KRISHAN GARG";
        int num = Integer.parseInt(name);
        }catch (NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Error Handled.......");

        }

    }
}
