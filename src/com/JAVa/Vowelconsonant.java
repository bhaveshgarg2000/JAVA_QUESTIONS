package com.JAVa;

import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String[] args) {
        System.out.println("Vowel and Consonant Problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is Vowel.");
        }
        else{
            System.out.println(ch +" is Consonant.");
        }
    }
}
