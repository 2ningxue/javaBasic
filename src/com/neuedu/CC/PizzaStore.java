package com.neuedu.CC;

    import java.util.Scanner;

    public class PizzaStore { //披萨工厂类-->主要是生产披萨
        /*编写程序实现比萨制作。
               需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。
               可供选择的比萨有：培根比萨和海鲜比萨。
               实现思路及关键代码
               1)?分析培根比萨和海鲜比萨
               2)?定义比萨类
               3)?属性：名称、价格、大小
               4)?方法：展示
               5)?定义培根比萨和海鲜比萨继承自比萨类
               6)?定义比萨工厂类，根据输入信息产生具体的比萨对象*/


        public static Pizza getPizza(int order) {
            Scanner input = new Scanner(System.in);
            Pizza p = null;
            if (order == 1) {
                System.out.println("请输入培根克数:");
                int gramNum = input.nextInt();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();


                p = new BaconPizza(size, price, "培根披萨", gramNum);
            }

            if (order == 2) {
                System.out.println("请输入配料信息:");
                String peiLiao = input.next();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();


                p = new SeafoodPizza(size, price, "海鲜披萨", peiLiao);
            }
            return p;

        }
}
