package com.practice;

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Circle is drawing");
    }
}



public class Interface1 {
    public static void main(String[] args) {
//    Rectangle r = new Rectangle();
//        Circle c = new Circle();
//        c.draw();
//    r.draw();

        Shape s = new Circle();
    s.draw();

    }
}
