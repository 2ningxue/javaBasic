package com.neuedu.CC;


    import java.util.Scanner;

    public class Test {


        public static void main(String[] args) {
            //具体的逻辑：---买披萨：
            Scanner input = new Scanner(System.in);
            System.out.print("请输选择要制作的披萨:1.培根披萨   2.海鲜披萨");
            int num = input.nextInt();
            Pizza p=PizzaStore.getPizza(num); //调用披萨工厂类PizzaStroe中的方法-->返回的是披萨类
            System.out.println(p.show());
        }

}
