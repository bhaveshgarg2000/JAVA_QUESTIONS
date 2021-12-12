package com.practice;
//import java.io.*;
import java.io.FileInputStream;
public class example2 {
    public static void main(String[] args) {
        try{
    FileInputStream fin = new FileInputStream("D://abc.txt");
   int i;
    while((i = fin.read())!=-1)
            System.out.print((char)i);
            fin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
