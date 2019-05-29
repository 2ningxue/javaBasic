package com.neuedu;

public class Point {
//    5、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
//            2个构造器Point()和Point(int x0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，
//    创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标
  public  int x;
  public  int y;
  public  Point(){

  }
  public Point(int x0,int y0){
      x=x0;
      y=y0;
  }
  public void movePoint(int dx,int dy){
      x+=dx;
      y+=dy;
  }
  public  String toString(){
      return "("+x+","+y+")";
  }

}
