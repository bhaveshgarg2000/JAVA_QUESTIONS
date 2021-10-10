package com.practice;

class ABCD{
    void M(){
        System.out.println("Hello M");
    }
    void N(){
        System.out.println("HEllo N");
    this.M();
    }
}



public class ThisConstructor {

    public static void main(String[] args) {

        ABCD a = new ABCD();
        a.N();
    }
}
