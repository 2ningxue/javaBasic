package com.neuedu.CC;

public class Pizza { //披萨类-->父类 //属性私有

        private int size;
        private int price;
        private String name;

        //get set方法
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Pizza() { //无参构造
            super();
        }
        public Pizza(int size, int price, String name) { //有参构造
            super();
            this.size = size;
            this.price = price;
            this.name = name;
        }

        //show方法
        public String show(){
            return "这是制作披萨的方法!";
        }

    }


