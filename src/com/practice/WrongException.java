package com.practice;

public class WrongException {
    public static void main(String[] args) {

//            Different Exception in try block wrong Exception in catch block
//            try{
//                int a = 100/0;
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//                System.out.println("Rest Of the code");
//            }
//

//            Different Exception in try block wrong Exception in catch block

            try{
                int b[] = {0,1,2,3,4};
                System.out.println(b[5]);
            }catch (ArithmeticException e){
                System.out.println(e);
            }




    }
}
