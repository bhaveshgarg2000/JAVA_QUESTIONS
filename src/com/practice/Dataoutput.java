package com.practice;
import java.io.*;
public class Dataoutput {
    public static void main(String[] args) {
    try{
        FileOutputStream fout = new FileOutputStream("D://abc.txt");
    DataOutputStream dout = new DataOutputStream(fout);
    dout.writeDouble(1.1);
    dout.writeInt(10);
    dout.writeBoolean(true);
    dout.writeChar('4');
    }catch(Exception e){
        System.out.println(e);
        System.out.println("cannot open the Output File");
        return;
    }
    try{
        FileInputStream fin = new FileInputStream("D://abc.txt");
        DataInputStream din = new DataInputStream(fin);
        double a = din.readDouble();
        int b = din.readInt();
        boolean c = din.readBoolean();
        char d = din.readChar();
        System.out.println("Values :"+ a + " " + "b" + " " + "c" + " "+ " d");
    }catch (Exception e){
        System.out.println(e);
        System.out.println("cannot open the Input File");
    }

    }
}
