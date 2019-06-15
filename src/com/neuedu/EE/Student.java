package com.neuedu.EE;
     /* 6月13号下午的一个小测试题，题目如下：
       1.创建一个StudentManager项目 实现学生管理系统
       2.登陆系统输入用户名和密码，
       创建对应Admin类 包括用户名和密码，
       用户名和密码正确 显示3中页面提示
       3.页面提示 1.查看学生信息
                  2.添加学生信息
                  3.修改学生信息
                  4.删除学生信息
                  5.退出系统
       输入不同编号实现不同功能
               学生类信息：姓名 年龄 班级 学号*/

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String classNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Student() {
    }

    public Student(String name, int age, String classNum) {
        this.name = name;
        this.age = age;
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNum='" + classNum + '\'' +
                '}';
    }
}

























