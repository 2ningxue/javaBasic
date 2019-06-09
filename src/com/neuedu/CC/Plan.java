package com.neuedu.CC;

public class Plan extends Transportation{
    public void Howwork(String b) {
        this.setWork(b);
        System.out.println("飞机的工作方式为：" + getWork());
    }

    public void HMseat(int a) {
        this.setSeat(a);
        System.out.println("飞机能坐的人数为：" + getSeat());
    }

    public void HMspeed(double c) {
        this.setSpeed(c);
        System.out.println("飞机的速度为：" + getSpeed());
    }
}
