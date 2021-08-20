package com.JAVa;

public class Loop {
    public static void main(String[] args) {
            //for loop
        //printing of counting from 1 to 100
        for (int i=0; i<=100;i++){
            System.out.println(i);
        }
        //printing of counting from 100 to 1(reverse of for loop)

        for (int i=100; i>=1; i--){
            System.out.println(i);
        }

        //       while loop
        int i= 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }

        //    DO-WHILE

        int k=100;
        do {
            System.out.println(k);
            k--;
        }while(k>=1);
    }
}
