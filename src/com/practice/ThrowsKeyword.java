package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void ReadFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
        void SaveFile() throws FileNotFoundException{
            String name = "BHAVESH KRISHAN GARG";
            FileOutputStream  fos = new FileOutputStream("d:/xyz.txt");
        }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.ReadFile();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        try{
            rw.SaveFile();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code executed");
    }
}