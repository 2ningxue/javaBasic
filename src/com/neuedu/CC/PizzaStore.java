package com.neuedu.CC;

    import java.util.Scanner;

    public class PizzaStore { //披萨工厂类-->主要是生产披萨

        public static Pizza getPizza(int order) { //得到披萨的方法
            Scanner input = new Scanner(System.in);
            Pizza p = null; //赋初始值
            if (order == 1) { // 培根披萨
                System.out.println("请输入培根克数:");
                int gramNum = input.nextInt();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();

                // 根据上面录入的信息，创建具体的培根披萨：--创建对象：
                p = new BaconPizza(size, price, "培根披萨", gramNum);//多态-->向上转型
            }

            if (order == 2) { // 海鲜披萨
                System.out.println("请输入配料信息:");
                String peiLiao = input.next();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();

                // 根据上面录入的信息，创建具体的培根披萨：--创建对象：
                p = new SeafoodPizza(size, price, "海鲜披萨", peiLiao);//多态-->向上转型
            }
            return p; //最终根据需求生产具体披萨后,并返回

        }
}
