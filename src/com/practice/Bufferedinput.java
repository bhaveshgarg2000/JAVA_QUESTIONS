package com.practice;
import java.io.*;
//import java.io.BufferedInputStream;
//import java.io.FileInputStream;

public class Bufferedinput {
    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream("D://abc.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while ((i = bin.read())!=-1){
            System.out.print((char)i);
        }


    }
}
