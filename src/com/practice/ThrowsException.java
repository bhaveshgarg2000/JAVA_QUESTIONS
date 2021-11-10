package com.practice;
import java.io.IOException;
class Exceptions{
    void m() throws IOException{
        throw new IOException("DEVICE ERROR");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
}
public class ThrowsException {
    public static void main(String[] args) {
Exceptions p1 = new Exceptions();
p1.p();
        System.out.println("Rest of the code Executed");
    }
}
