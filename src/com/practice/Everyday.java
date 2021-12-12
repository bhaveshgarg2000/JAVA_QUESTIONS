package com.practice;
import java.io.*;

class bhavesh implements Serializable{
    int id ;
    String name;
    public bhavesh(int id,String name){
        this.id = id;
        this.name = name;

    }
}



public class Everyday {
    public static void main(String[] args) {
try{
            bhavesh S1 = new bhavesh(211,"AYUSH");
            FileInputStream fout = new FileInputStream("D://abc.txt");
            ObjectInputStream out = new ObjectInputStream(fout);
            bhavesh b = (bhavesh)out.readObject();
    System.out.println(b.id + " " +b.name);
            fout.close();
        System.out.println("Success");

}catch (Exception e){
    System.out.println(e);
}

    }
}
