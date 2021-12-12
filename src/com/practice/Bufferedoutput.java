package com.practice;
import java.io.*;
//import java.io.FileOutputStream;
public class Bufferedoutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D://abc.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String S = "WELCOME TO JAVATPOINT";
            byte b[] = S.getBytes();
            bout.write(b);
            bout.close();
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
