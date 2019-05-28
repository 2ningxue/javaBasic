package com.neuedu;

import java.util.Scanner;

public class Student {
   // 1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩

            String number;
            String name;
            public void Run(){
                double result=0;
                for (int i=0;i<5;i++){
                    Scanner radius1=new Scanner(System.in);
                    System.out.println("输入学号：");
                    number=radius1.next();
                    Scanner radius2=new Scanner(System.in);
                    System.out.println("输入姓名：");
                    number=radius2.next();
                    Scanner radius3=new Scanner(System.in);
                    System.out.println("输入成绩：");
                    int[]arr=new int[3];
                    for (int j=0;j<3;j++){
                        arr[j]=radius3.nextInt();
                    }
                    double sum=0;
                    for (int j=0;j<arr.length;j++){
                        sum+=arr[j];
                        result=sum/3;
                    }
                    System.out.println("学号："+number);
                    System.out.println("成绩："+result);
                    System.out.println("名字："+name);

                }
            }
}
