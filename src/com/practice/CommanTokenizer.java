package com.practice;

import java.util.StringTokenizer;

public class CommanTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("MY,NAME,IS,BHAVESH,KRISHAN,GARG");
        System.out.println("NEXT TOKEN : "+st.nextToken(","));
    }
}
