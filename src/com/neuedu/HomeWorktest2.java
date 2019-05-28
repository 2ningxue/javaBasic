package com.neuedu;
//5月27日的5道题作业
public class HomeWorktest2 {
    /*1 定义长方形类，含：
    特征：宽、高（整型）；
    方法：求周长、面积；
    方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
    并对其进行测试*/

   /* //没有参数
     int width=1;
    int height=1;
public void oblong(){
    int a=width*2+height*2;
    System.out.println("长方体的周长是："+a);
    }
    public  void ovlong(){
    int b=width*height;
    System.out.println("长方体的面积是："+b);
    }
    //有一个参数
public  void oblong2(int i){
    int a=width*2+height*2;
    System.out.println("长方体的周长是："+a);
}
    public  void ovlong2(int j) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }
    //有两个参数
    public  void oblong3(int width,int height){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong3(int width,int height) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }*/

   /* 2 定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
    并对其进行测试*/
 /* int radius;
  public void  oblong(int radius1){
  //return 2*Math.PI*radius;直接是3.14的做法
    double c=3.14;
    if (radius>0){
        radius=radius1;
    }else {
        System.out.println("半径输出为正数");
    }
      System.out.println("圆的周长为："+(2*c*radius));
      System.out.println("圆的面积为："+(c*radius*radius));
    }*/


    /* 3 定义一个计算器类，包括加、减、乘、除运算。
      并对其进行测试*/
    /*int firstNum;
    int secondNum;

    public int add() {

    }*/


/*public void mathe(int a,int b){
    System.out.println("相加为："+(a+b));
    System.out.println("相减为："+(a-b));
    System.out.println("相乘为："+(a*b));
    System.out.println("相除为："+(a/b));
}*/

 /* 4 编写一个Java程序，并满足如下要求：
            1）编写一个Car类，具有：   特征：品牌(mark)——String类型   价格（price）、速度（speed）——int型
    功能：驾驶（void drive( )）    功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
3）定义主类E，在其main方法中创建Car类的两个对象：aodi和benchi的对 象并测试其对象的特性。
*/
/*
  private  String mark;
 private int price;
 private int speed;
public  void setMark(String mark1){
    mark=mark1;
}
public String getMark(){
    return mark;
}
 public  void driver(){

 }
 public void SpeedChang(int newSpeed){
     speed=newSpeed;
 }
*/



 /*5 定义一个学生类 包括 姓名 年龄 分数的特征
    创建五个学生对象 对其中特征进行赋值 赋值后 根据分数从大到小进行排序
*/
    /* String sname;
      int age;
      int score;
    //get/set方法
    public  void setSname(String sname1){
        sname=sname1;
    }
    public void  setAge(int age1){
        age=age1;
    }
    public void setScore(int score1){
        score=score1;
    }
    public String getSname(){
        return sname;
    }
    public  int getAge(){
        return  age;
    }
    public  int getScore(){
        return score;
    }
    public String toString(){
        return "姓名"+sname+"成绩"+score;
    }
*/
}
