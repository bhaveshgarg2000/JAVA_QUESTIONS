package com.practice;
import java.io.FileOutputStream;
public class example1 {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("D://abc.txt");
        String S = "HELLO WELCOME BHAVESH'S HOUSE";
        byte b[] = S.getBytes();
        fout.write(b);
        fout.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
