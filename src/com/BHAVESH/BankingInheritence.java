package com.BHAVESH;

class bank{
    int getrateofinterest(){
        return 0;
    }
}

class SBI extends bank{
    int getrateofinterest(){
        return 8;
    }
}

class KOTAK extends bank{
    int getrateofinterest(){
        return 10;
    }
}

class ICICI extends bank{
    int getrateofinterest(){
        return 15;
    }
}


public class BankingInheritence {
    public static void main(String[] args) {
        SBI s = new SBI();
        KOTAK k = new KOTAK();
        ICICI i = new ICICI();
        System.out.println("SBI rate of interest : "+s.getrateofinterest());
        System.out.println("KOTAk rate of interest : "+k.getrateofinterest());
        System.out.println("ICICI rate of interest : "+i.getrateofinterest());

    }
}
