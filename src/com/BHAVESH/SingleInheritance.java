package com.BHAVESH;

class Parent{
    int a =10;
    void show(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
        int b =20;
        void display(){
        System.out.println("Child Class");
        }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Parent Class b : "+c.b);
        c.show();
        System.out.println("Child class a : "+c.a);
        c.display();
    }
}

