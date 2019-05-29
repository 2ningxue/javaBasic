package com.neuedu.B;

public class Drawing {

        private double side;

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            if (side>0){
                this.side = side;
            }else {
                System.out.println("请输入一个大于0的数");
            }
        }

        public void girth(){
            double oblong=side*4;
            System.out.println("正方形周长："+oblong);
        }

        public void area(){
            double a=Math.pow(side,2);
            System.out.println("正方形面积："+a);
        }
    }


