package com.neuedu.CC;
     /*要求：有三种交通工具飞机、轮船、汽车
             它们有各自的行驶方式（水、路、空）
             它们有各自的载人数量
             它们有各自的行驶速度
             只有轮船和汽车可以打开窗子
             用多态和接口实现：*/

public class Test3 {
    public static void main(String[] args) {
        AAA(new Car(), "陆地", 20, 90.0);
        AAA(new Plan(), "空中", 60, 1000.0);
        AAA(new Ship(), "水上", 40, 300.0);
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

