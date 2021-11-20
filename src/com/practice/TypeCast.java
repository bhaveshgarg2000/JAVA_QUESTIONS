package com.practice;

public class TypeCast {
    int biild;
    int customerId;
    int discount;
    double billAmount;

    double discountedBillAmount = billAmount - billAmount * (discount/100);


    void setter(int b,int c, int d,double a){
        biild = b;
        customerId = c;
        discount = d;
        billAmount =  a;

    }
void getter(){
    System.out.println("Bill Id : "+biild);
    System.out.println("Customer Id : "+customerId);
    System.out.println("Discount : "+discount + "%");
    System.out.println("Bill Amount : "+billAmount);
    System.out.println("");

}
    public static void main(String[] args) {
        TypeCast t1 = new TypeCast();
        TypeCast t2 = new TypeCast();
    t1.setter(1001,101,2,199.99);
    t1.getter();
        t2.setter(1002,102,4,210.5);
        t2.getter();
    }
}
