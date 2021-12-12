package com.practice;
import java.io.*;

public class FILE {
    public static void main(String[] args) {
        File file = new File("D:/ABC.txt");
        System.out.println(file.exists());
    }
}