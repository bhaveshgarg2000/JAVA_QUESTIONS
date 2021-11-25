package com.practice;

public class threadRunnable {
    public static void main(String[] args) {

        class Multi implements Runnable{
            public void run(){
                System.out.println("Thread Is Running............");
            }
        }


        Multi m1 = new Multi();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
