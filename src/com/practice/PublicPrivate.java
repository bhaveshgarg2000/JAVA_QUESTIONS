package com.practice;
class DUMB{
    private void method(){
        System.out.println("HELLO");
    }
}

class DEAF extends DUMB{
    protected void method(){
        System.out.println("BYE");
    }
}


class PublicPrivate {
    public static void main(String[] args) {

        DEAF d = new DEAF();
        d.method();

    }
}
