package com.neuedu.B;

    //     public class Shape {
  /*  5. 编写一个Shape类，具有属性：周长和面积；定义其子类三角形和矩形，分别具有求周长的方法。
    定义主类E，在其main方法中创建三角形和矩形类的对象，并赋给Shape类的对象a、b，使用对象a、b来测试其特性。*/

   /* //shape类
   public class Shape {
    private double l, s;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }*/



   /* //三角形子类
   public class Shape {

        private double l,s;

        public double getL() {
            return l;
        }

        public void setL(double l) {
            this.l = l;
        }

        public double getS() {
            return s;
        }

        public void setS(double s) {
            this.s = s;
        }
*/

//矩形子类


    public class Srect extends Shape {
        private double width,height;
        Srect(double w,double h)
        {
            width=w;
            height=h;
        }
        public void zhouChang()
        {
            setL(2*(width+height));
        }

    }


    }



