package com.neuedu.CC;

public class Car extends Transportation implements OpenWindow {
    public void Howwork(String b) {
        this.setWork(b);
        System.out.println("汽车的工作方式为：" + getWork());
    }

    public void HMseat(int a) {
        this.setSeat(a);
        System.out.println("汽车能坐的人数为：" + getSeat());
    }

    public void HMspeed(double c) {
        this.setSpeed(c);
        System.out.println("汽车的速度为：" + getSpeed());
    }
    public void open(){
        System.out.println("汽车能开窗子");
    }
}

