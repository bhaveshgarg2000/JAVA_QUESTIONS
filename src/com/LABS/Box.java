package com.LABS;


public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public double volume() {
        return width*height*depth;
    }

    public static void main(String args[]) {
        Box box1= new Box(10,20,30);
        Box box2= new Box(5,8,9);
        System.out.println("Volume of box1= "+ box1.volume());
        System.out.println("Volume of box2= "+ box2.volume());
    }
}