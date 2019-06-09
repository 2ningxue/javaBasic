package com.neuedu.CC;

public class SeafoodPizza extends Pizza { //海鲜披萨类-->子类 //属性私有

        private String peiLiao; //配料

        //get set方法
        public String getPeiliao() {
            return peiLiao;
        }
        public void setPeiliao(String peiliao) {
            this.peiLiao = peiLiao;
        }

        public SeafoodPizza() {//无参构造
            super();
        }
        //有参构造
        public SeafoodPizza(int size, int price, String name, String peiLiao) {
            super(size, price, name);
            this.peiLiao = peiLiao;
        }

        //重写show方法
        public String show(){
            return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"配料:"+peiLiao;
        }


    }


