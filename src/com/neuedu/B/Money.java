package com.neuedu.B;

import java.util.Scanner;

public class Money {
    /*4.企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
    高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，
    可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
    从键盘输入当月利润I，求应发放奖金总数？*/


    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.println("请输入当月的利润:");
        int x=s.nextInt();
        double sum=0;
        if(x>=100){
            sum=10*0.1+10*0.07+20*0.05+40*0.03+60*0.015+(x-100)*0.001;
        } else if(x>=60){
            sum=10*0.1+10*0.07+20*0.05+40*0.03+(x-60)*0.015;
        } else if(x>=40){
            sum=10*0.1*10*0.075+20*0.05+(x-40)*0.03;
        } else if(x>=20){
            sum=10*0.1+10*0.075+(x-20)*0.05;
        } else if(x>=10){
            sum=10*0.1+(x-10)*0.075;
        } else{
            sum=x*0.1	;
        }
        System.out.println("当月的奖金为:"+sum);

    }

}
