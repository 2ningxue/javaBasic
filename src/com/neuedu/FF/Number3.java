package com.neuedu.FF;
      /*  6月13日作业：
      第三题：现在有一个map集合如下：
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        要求：
        1.遍历集合，并将序号与对应人名打印。
        2.向该map集合中插入一个编码为5姓名为李晓红的信息
        3.移除该map中的编号为1的信息
        4.将map集合中编号为2的姓名信息修改为"周林"
        从键盘获取一行输入字符串，要求去除重复字符。*/


import java.util.HashMap;
import java.util.Map;

public class Number3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "乔峰");
        map.put(4, "灭绝师太");

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("==");

        map.remove(1);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        System.out.println("===");

        map.put(2,"周林");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}

