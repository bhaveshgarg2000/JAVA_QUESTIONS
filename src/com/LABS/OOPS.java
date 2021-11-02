package com.LABS;

class Student{
    int roll_no;
    String name;
    int age;
    String course;
    public Student(int roll_no, String name, int age, String course){
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.course = course;
        if(age >= 15 && age <=21){

        }else{
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }
    }
}
class AgeNotWithinRangeException extends ArithmeticException{
    public AgeNotWithinRangeException(String error){
        super(error);
    }
}
public class OOPS{
    public static void main(String[] args) {
        Student s = new Student(7, "Mr.bean", 36, "cse");
    }
}
