package com.neuedu.CC;

public class Test3 {
    public static void main(String[] args) {
        AAA(new Car(), "陆地行使", 20, 90.0);
        AAA(new Plan(), "空中行使", 60, 1000.0);
        AAA(new Ship(), "水上行使", 40, 300.0);
        SSS();
    }

    public static void AAA(Transportation Q, String a, int b, double c) {
        Q.HMseat(b);
        Q.HMspeed(c);
        Q.Howwork(a);
    }
    public static void SSS(){
        OpenWindow C=new Car();
        C.open();
        OpenWindow D=new Ship();
        D.open();
    }
}

