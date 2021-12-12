//package com.JAVa;
//import java.io.Serializable;
//import java.io.*;
//
//class persistent implements Serializable{
//    int id ;
//    String name ;
//    public persistent(int id , String name ){
//            this.id = id;
//            this.name = name;
//    }
//}
//
//public class BKG {
//    public static void main(String[] args) {
//        try {
//            persistent p1 = new persistent();
//            FileOutputStream fout = new FileOutputStream("def.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fout);
//            out.writeObject(p1);
//            out.flush();
//            out.close();
//            System.out.println("Success");
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//    }
//}
