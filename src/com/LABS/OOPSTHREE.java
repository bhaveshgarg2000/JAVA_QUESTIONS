package com.LABS;


public class OOPSTHREE {
    public static void main(String[] args) throws Exception {
        MyDate myDate = new MyDate(34,12,2020);
        if(myDate.day>30 || myDate.day <= 0){
            throw new InvalidDayException("Inavlid day!");
        }
        if(myDate.month>12 || myDate.month < 1){
            throw new InvalidMonthException("invalid month!");
        }
    }
}
class MyDate{
    int day;
    int month;
    int year;
    MyDate(){

    }
    MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
class InvalidDayException extends Exception{
    public InvalidDayException(String error){
        super(error);
    }
}
class InvalidMonthException extends Exception{
    public InvalidMonthException(String error){
        super(error);
    }
}
