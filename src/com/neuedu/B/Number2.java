package com.neuedu.B;

public class Number2 {
  //  2 判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {
        int sum=0;
        for (int i=101;i<200;i+=2){
            boolean a=false;
//for(int j=2;j<=Math.sqrt(i);j++){
      for (int j=2;j<i-1;j++){
                if (i%j==0){
                    a=false;
                    break;
                }else {
                    a=true;
                }
            }
            if (a){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println("素数的个数为："+sum);
    }
}
