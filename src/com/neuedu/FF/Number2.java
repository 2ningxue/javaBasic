package com.neuedu.FF;

import java.util.ArrayList;

public class Number2 {
   /* 6月13日：
    第二题：定义一个方法listTest(ArrayList<Integer> al, Integer s)，
    要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/


   public static void main(String[] args) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(4);
       arrayList.add(5);

       System.out.println("索引值为:"+listTest(arrayList,4));
   }
    public static int  listTest(ArrayList<Integer> al, Integer s){

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)==s)
                return i;
        }
        return -1;
    }
 }

