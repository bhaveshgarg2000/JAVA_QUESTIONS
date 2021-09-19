package com.LABS;

public class Student {
    int rollno;
    String name;
    float per;
    static int count = 0;
    Student(){
        rollno = 0;
        name = null;
        per = 0.f;

    }
    Student(int rollno,String name ,float per){
        this.rollno = rollno;
        this.name = name;
        this.per= per;
        count ++;


    }

        public static void count(){
            System.out.println("Object "+(count)+ " Created");
        }

public void display(){
    System.out.println("....................");
    System.out.println("Roll No "+rollno);
    System.out.println("Name "+name);
    System.out.println("Percentage "+per);
    System.out.println("....................");

}

    public static void main(String[] args) {
        Student s1 = new Student(1,"Kunal",90.99f);
    Student.count();
        Student s2 = new Student(2,"Bhavuk",99.90f);
Student.count();
        Student s3 = new Student(3,"Bhavesh",99.99f);
        Student.count();
        s1.display();
        s2.display();
        s3.display();
    }
}
