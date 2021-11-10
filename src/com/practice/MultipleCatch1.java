package com.practice;

public class MultipleCatch1 {
    public static void main(String[] args) {
        try{
//            int a[] = new int[10];
//            Generate ArithmeticException
//            a[10] = 100/0;


//             Generate ArrayIndexOutOfBoundsException
//            System.out.println(a[10]);

//            Generate NullPointerException
            String name = null;
            System.out.println(name.length());


        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            System.out.println("Parent Exception ");
        }
        System.out.println("Rest Of the code Executed");
    }
}
