package com.BHAVESH;

class ABC {
    int abc =100;
    void virat(){
        System.out.println("Hello Bhavuk");
    }
}
class BAA extends ABC{
    int ghi = 200;
    void dhoni(){
        System.out.println("Hello 10Kunaljii");
    }
}

class CAA extends ABC{
    int def = 300;
    void raina(){
        System.out.println("Swastu");
    }
}


public class Hierchicalinheritance {
    public static void main(String[] args) {

        CAA obj = new CAA();
        System.out.println("Abc = "+obj.abc);
        obj.virat();

    }
}
