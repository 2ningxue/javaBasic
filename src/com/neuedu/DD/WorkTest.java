package com.neuedu.DD;
   /*  第一题：1) 创建一个List，在List 中增加三个工人，基本信息如下：
        姓名 年龄 工资
        zhang3 18 3000
        li4 25 3500
        wang5 22 3200
        2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        3) 删除wang5 的信息
        4) 利用for 循环遍历，打印List 中所有工人的信息
        5) 利用迭代遍历，对List 中所有的工人调用work 方法。*/
import java.util.ArrayList;
import java.util.List;

public class WorkTest {
    public static void main(String[] args) {
        List<Work> list = new ArrayList<>();

        list.add(new Work("张3",18,3000));
        list.add(new Work("李4",25,3500));
        list.add(new Work("王5",22,3200));
        list.add(1,new Work("赵6",24,3300));




        list.remove(3);

        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}



