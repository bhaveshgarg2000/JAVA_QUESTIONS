package com.practice;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("HELLO I LOVE MY COUNTRY"," ");
while(st.hasMoreTokens()){
    System.out.println(st.nextToken());
}

    }
}
