package com.BHAVESH;


class Vehicle{
    void run(){
        System.out.println("Vehicle is running.");
    }
}

class Bike extends Vehicle{
        //   method over-riding
      void run(){
        System.out.println("Bike is running");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
