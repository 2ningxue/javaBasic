package com.neuedu.CC;
/*要求：有三种交通工具飞机、轮船、汽车
         它们有各自的行驶方式（水、路、空）
         它们有各自的载人数量
         它们有各自的行驶速度
         只有轮船和汽车可以打开窗子
         用多态和接口实现：*/


public class Transportation {
    private String work;
    private int seat;
    private double speed;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {

        this.work = work;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void Howwork(String b) {

    }

    public void HMseat(int a) {

    }

    public void HMspeed(double c) {

    }
}


