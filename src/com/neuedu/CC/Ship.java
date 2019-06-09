package com.neuedu.CC;

public class Ship extends Transportation implements OpenWindow {
    public void Howwork(String b) {
        this.setWork(b);
        System.out.println("船的工作方式为：" + getWork());
    }

    public void HMseat(int a) {
        this.setSeat(a);
        System.out.println("船能坐的人数为：" + getSeat());
    }

    public void HMspeed(double c) {
        this.setSpeed(c);
        System.out.println("船的速度为：" + getSpeed());
    }
    public void open(){
        System.out.println("船可以打开窗子");
    }
}
