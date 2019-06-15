package com.neuedu.CC;

public class SeafoodPizza extends Pizza { //海鲜披萨类-->子类 //属性私有
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

        private String peiLiao;


        public String getPeiliao() {
            return peiLiao;
        }
        public void setPeiliao(String peiliao) {
            this.peiLiao = peiLiao;
        }

        public SeafoodPizza() {//无参构造
            super();
        }

        public SeafoodPizza(int size, int price, String name, String peiLiao) {
            super(size, price, name);
            this.peiLiao = peiLiao;
        }


        public String show(){
            return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"配料:"+peiLiao;
        }


    }


