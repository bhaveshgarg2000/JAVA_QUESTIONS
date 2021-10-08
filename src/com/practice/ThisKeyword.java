package com.practice;
class Student{
    int rollno;
    String name;
    int fee;
    Student(int rollno,String name, int fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno + " "+ name + " " + fee );
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        Student s1 = new Student(1019,"BHAVESH KRISHAN GARG",10000);
        Student s2 = new Student(1021,"BHAVUK AGGARWAL",500000);
    s1.display();
    s2.display();
    }
}
