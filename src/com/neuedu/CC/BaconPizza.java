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

public class BaconPizza extends Pizza { //培根披萨类-->子类 //属性私有

        private int gramNum; //克数

        //get set方法
        public int getGramNum() {
            return gramNum;
        }
        public void setGramNum(int gramNum) {
            this.gramNum = gramNum;
        }

        public BaconPizza() { //无参构造
            super();
        }
        //有参构造
        public BaconPizza(int size, int price, String name, int gramNum) {
            super(size, price, name);
            this.gramNum = gramNum;
        }

        //重写shou方法
        public String show(){ //方法重写
            return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"培根克数:"+gramNum;
        }

    }


