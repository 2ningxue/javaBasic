package com.neuedu.DD;
        /*  2）有如下Student 对象，
            　private String name;
              private int age;
              private int score;
              private String classNum;
        其中，classNum 表示学生的班号，例如“class05”。 有如下List List list = new ArrayList();
        list.add(new Student(“Tom”, 18, 100, “class05”));
        list.add(new Student(“Jerry”, 22, 70, “class04”));
        list.add(new Student(“Owen”, 25, 90, “class05”));
        list.add(new Student(“Jim”, 30,80 , “class05”));
        list.add(new Student(“Steve”, 28, 66, “class06”));
        list.add(new Student(“Kevin”, 24, 100, “class04”));
        在这个list 的基础上，完成下列要求：
        1） 计算所有学生的平均年龄
        2） 计算各个班级的平均分*/

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Tom" ,18, 100, "class05"));
        list.add(new Student("Jerry" ,22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30,80 , "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));

        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i).getAge();
        }
        System.out.println("所有学生的年龄："+sum/list.size());

        int score4=0;
        int score5=0;
        int score6=0;
        int num4=0;
        int num5=0;
        int num6=0;
        for(int j=0;j<list.size();j++)
        {
            Student st=list.get(j);

            if(st.getClassNum()=="class04")
            {
                num4++;
                score4 +=st.getScore();
            }
            else if(st.getClassNum()=="class05")
            {
                num5++;
                score5+=st.getScore();
            }
            else
            {
                num6++;
                score6+=st.getScore();
            }

        }
        System.out.println("class04的分数："+score4/num4);
        System.out.println("class05的分数："+score5/num5);
        System.out.println("class06的分数："+score6/num6);



    }
}

