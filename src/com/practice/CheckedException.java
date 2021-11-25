package com.practice;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class CheckedEXception {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("abc.txt");
            pw.println("SAVed");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File Saved Successfully");
    }
}
