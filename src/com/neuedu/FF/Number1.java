package com.neuedu.FF;

        /* 6月13日作业
         第一题：产生10个1-100的随机数，并放到一个数组中，
        把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/

import java.util.ArrayList;
import java.util.Random;

public class Number1 {
        public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<>();
            int arr[] = new int[10];
           Random ra = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i]=ra.nextInt(100)+1;
                if (arr[i]>=10)
                    list.add(arr[i]);
            }
            System.out.println(list);
        }
    }


