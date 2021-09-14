package com.BHAVESH;


 class CAlcsquare{
     public void square(){
         System.out.println("No Parameter Passed");
     }

     public int square(int number){
         int square = number*number;
         System.out.println("Method with int argument : "+square);
     }

     public float square(float number){
    float square = number*number;
         System.out.println("Method with float argument : "+square);
     }
 }


public class Square {
    public static void main(String[] args) {
        CAlcsquare str = new CAlcsquare();
        str.square();
        str.square(11);
        str.square(100.35);
    }
}
