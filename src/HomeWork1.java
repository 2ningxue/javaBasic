import java.util.Scanner;
//总共是十道题，除了第八题是独立的主方法以外，其他九道题都是一个主方法，每一道题一个注释。
public class HomeWork1 {
    public static void main(String[] args) {
//第一题：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
// 其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，
// 因为153=1的三次方＋5的三次方＋3的三次方。
//1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。

  /*  for(int i=100;i<=999;i++){
        int a=i/100;
        int b=i%100/10;
        int c=i%10;
        if (i==a*a*a+b*b*b+c*c*c){
            System.out.println(i);
        }
    }*/


        // 第二题：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
        // 60-89分之间的用B表示，60分以下 的用C表示。

        /* Scanner input=new Scanner(System.in);
         System.out.println("输入你的成绩：");
 int result=input.nextInt();
   int a= result;
   if (a>=90){
       System.out.println("A");
   }else  if (a>=60&&a<=89){
       System.out.println("B");
   }else  if (a<60){
       System.out.println("C");
   }else {
       System.out.println("result");
   }*/


        //第三题:有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？
        // 都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。
        // 组成所有的排列后再去 掉不满足条件的排列。

      /* int a=0;
       int  i=1;
       for (;(i>0)&&(i<1000);i++){
           int b=i/100;
           int c=i%100/10;
           int d=i%10;
           if (b<=4&&b>0&&c<=4&&c>=1&&d<=4&&d>=1&&b!=c&&b!=d&&c!=d){
               System.out.println(i);
               a++;
               System.out.println(a);
           }
       }*/


//第四题：计算9！

    /*  int sum=1;
     for (int i=1;i<=9;i++){
         sum*=i;
     }
        System.out.println("阶乘是"+sum);*/



        //第五题：分别计算1-100之间的奇数和 和偶数和


      /* int sum1=0;
       int sum2=0;
       for (  int i=1; i<=100;i++) {
           if (i % 2 == 1) {
               sum1 += i;
           } else {
               sum2 += i;
           }
       }
           System.out.println("奇数值是：" + sum1);
           System.out.println("偶数值是：" + sum2);
           */


        //第六题：一个5位数，判断它是不是回文数。
        // 即12321是回文数，个位与万位相同，十位与千位相同。

        /*  Scanner input=new Scanner(System.in);
        System.out.println("请输入5位数字：");
        int s=input.nextInt();
           int a=s/10000;
           int b=s%10000/1000;
           int c=s%1000/100;
           int d=s%100/10;
           int e=s%10;
           if (s>=10000&&s<=99999){
               if (a==e&&b==d){
                   System.out.println("是回文数");
               }else {
                   System.out.println("不是回文数");
               }
           }*/


//第七题：判断一个年份是平年还是闰年

       /* Scanner input=new Scanner(System.in);
        System.out.println("输入年份：");
        int year=input.nextInt();
         if (year%4==0&&year%100!=0||year%400==0){
             System.out.println("该年是闰年");
         }else {
             System.out.println("该年是平年");
         }
*/


        //第八题：编写程序，输入一个字符，判断它是否为小写字母，
        // 如果是，将它转换成大写字母，否则，不转换。
         //a=97  A=65  z=122 Z=90


       /* public static void main(String[] args) throws Exception{
            System.out.println("请输入字母：");
            char a=(char)System.in.read();
        if (a >= 'a' && a <= 'z') {
            a-=32;
            System.out.println(a);
        }else {
            a+=32;
            System.out.println(a);
        }*/



//第九题：用 while 循环，计算 1~200 之间所有 3 的倍数之和。
      /* int i = 1;
       int sum=0;
        while (i <= 200) {
            if (i%3==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("3的倍数之和"+sum);*/


//第十题：一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。
// 编程验证给定的整数能否被 9 整除。
        Scanner input=new Scanner(System.in);
        System.out.println("输入数字：");
        int i=input.nextInt();
       if (i%9==0){
         System.out.println("i能被9整除");
      }else {
     System.out.println("i不能被9整除");
    }
        }
    }

