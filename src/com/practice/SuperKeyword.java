package com.practice;


class Animal{

    Animal(){
        System.out.println("Animal is created");
    }
}
    class God extends Animal{
        God(){
            super();
        System.out.println("God is created");

        }
    }


public class SuperKeyword {
    public static void main(String[] args) {
       God d = new God();
    }
}
