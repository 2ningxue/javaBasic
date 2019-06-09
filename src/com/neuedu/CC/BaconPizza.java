package com.neuedu.CC;

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


