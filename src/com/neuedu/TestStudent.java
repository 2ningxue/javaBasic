package com.neuedu;

import java.util.Scanner;

public class TestStudent {
    // 1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
    public static void main(String[] args) {
       /* Student student=new Student();
        student.Run();*/
        Scanner input=new Scanner(System.in);
        float firstsum=0;
      Student[] students=new Student[5];
      for (int i=0;i<students.length;i++){
          Student student=new Student();
          /*提示输入信息*/
          System.out.println("请输入姓名");
          String name=input.next();
          System.out.println("请输入学号");
          String sno=input.next();
          TestStudent[] testStudent=new TestStudent[3];
          for (int j=0;j<3;j++) {
              System.out.println("请输入成绩");
              int math = input.nextInt();
              System.out.println("请输入语文");
              int yuwen = input.nextInt();
              System.out.println("请输入英语");
              int yingyu = input.nextInt();
              TestStudent testStudent1=new TestStudent();
              System.out.println(i);
          }
          student.getName();
          student.getCourse();
          student.getSno();


      }










    }


}
