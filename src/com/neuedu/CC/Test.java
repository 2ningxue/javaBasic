package com.neuedu.CC;
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

    import java.util.Scanner;

    public class Test {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("请输选择要制作的披萨:1.培根披萨   2.海鲜披萨");
            int num = input.nextInt();
            Pizza p=PizzaStore.getPizza(num);
            System.out.println(p.show());
        }

}
