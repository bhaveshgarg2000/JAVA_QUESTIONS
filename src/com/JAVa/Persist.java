//package com.JAVa;
//import java.io.*;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//
// class Student implements Serializable{
//    int id;
//    String name;
//    public Student(int id , String name){
//        this.id = id;
//        this.name = name;
//    }
//}
//
//public class Persist {
//    public static void main(String[] args) {
// Student S1 = new Student();
// try {
//     FileOutputStream fout = new FileOutputStream("abc.txt");
//     ObjectOutputStream out = new ObjectOutputStream(fout);
//     out.writeObject(S1);
//     out.flush();
//     out.close();
//     System.out.println("Success");
// }
// catch(Exception e){
//     System.out.println(e);
//
// }
// }
//}
