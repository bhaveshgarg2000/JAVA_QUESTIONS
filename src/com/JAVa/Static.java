package com.JAVa;

class Student{
    int rollno ;
    String name;
    static String college = "ITS";

    Student(int r,String n){
    rollno = r;
    name = n;
    }
    void display(){
        System.out.println(rollno + " " + name + " "+ college);
    }
}


public class Static {
    public static void main(String[] args) {
        Student s1 = new Student(1019,"BHAVESH");
        Student s2 = new Student(1028,"DAKSH");


        s1.display();
        s2.display();

    }
}
