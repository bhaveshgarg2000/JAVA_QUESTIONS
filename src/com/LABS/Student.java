package com.LABS;

class Atudent {
    int rollno;
    String name;
    float per;
    static int count = 0;
    Atudent(){
        rollno = 0;
        name = null;
        per = 0.f;

    }
    Atudent(int rollno,String name ,float per){
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
        Atudent s1 = new Atudent(1,"Daksh",90.99f);
    Atudent.count();
        Atudent s2 = new Atudent(2,"Yash",99.90f);
Atudent.count();
        Atudent s3 = new Atudent(3,"Soham",99.99f);
        Atudent.count();
        s1.display();
        s2.display();
        s3.display();
    }
}
