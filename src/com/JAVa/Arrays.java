package com.JAVa;



 class Arrays{
    public static void main(String[] args) {
        // array function
        int marks[] = new int[5];
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 98;
        marks[3] = 90;
        marks[4] = 88;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //length of array
        System.out.print("The length of array : ");
        System.out.println(marks.length);
    //array using known values
        int[] mark = {100,200,300,400};
        System.out.println("Array elements : " +mark[2]);

        //2D array
        int [][] finalMarks = {{90,200,300},{100,20,30}};
        System.out.println("****2D Array Elements****");
        System.out.print("Array Elements : ");
        System.out.print(finalMarks[0][2]);




    }
}
