package com.JAVa;


 class student {
     int rollno;
     String name;
     static String college = "MRU";

     static void Change() {
         college = "IIT";
     }
    //constructor intialize variables
     student(int r, String n) {
         rollno = r;
         name = n;
     }

     void display() {
         System.out.println(rollno + " " + name + " " + college);
     }
 }

     public class StaticMethod {
            public static void main(String[] args) {
                student.Change();//calling change method
                //craeting objects
                student s1 = new student(1019,"BHAVESH");
                student s2 = new student(1021,"BHAVUK");
                student s3 = new student(1059,"KUNAL ARORA");

                s1.display();
                s2.display();
                s3.display();

            }
        }
