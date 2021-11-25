package com.practice;


public class threadClass{
    public static void main(String[] args) {
        class Multi extends Thread{
            public void run(){
                System.out.println("Thread is Running");
            }

        }
        Multi t1 = new Multi();
        t1.start();
    }
}
