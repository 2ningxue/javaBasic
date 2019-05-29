package com.neuedu.B;

import java.util.Scanner;

public class TestDrawing {


        public static void main(String[] args) {
            System.out.println("请输入正方形的边长");
            Scanner side=new Scanner(System.in);
            Drawing s=new Drawing();
            s.setSide(side.nextDouble());
            s.girth();
            s.area();
            System.out.println();

            System.out.println("请输入圆形的半径");
            Scanner ridus=new Scanner(System.in);
            Circle c=new Circle();
            c.setRadius(ridus.nextDouble());
            c.girth();
            c.area();
        }
    }


