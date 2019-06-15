package com.neuedu.CC;

/* 1、定义主持人接口，提供一个无参数无返回值的主持的方法；
             2、定义学生类，提供一个无参数的无返回值的抽象的吃方法；
             3、定义男同学类，继承学生类，吃的方法内容为：”我是男同学，我嗑瓜子，喝啤酒...”;
             4、定义女同学类，继承学生类，同时实现主持人接口，主持方法的内容为：”女士们，先生们，大家好，我是主持人......”，吃的方法内容为：”我是女同学，我嗑瓜子，吃水果...”;
             5、定义班级类，提供一个无返回值的，带两个参数的开晚会的方法，其中第1个参数为主持人接口类型，第二个参数为学生类型，方法内容中要求先调用主持人的主持方法，再打印一句话”晚会正式开始.....”,然后调用学生的吃的方法；
             6、定义测试类，使用多态的形式分别创建学生类型的对象,主持人类型的对象，班级类型的对象（这个对象非多态），使用班级对象调用开晚会的方法；
             显示要求：女士们，先生们，大家好，我是主持人......
             晚会正式开始....
             我是男同学，我嗑瓜子，喝啤酒...*/

public class BanJi {

    //定义主持人接口

    public interface ZhuChiRen {
        public void zhuchi();
    }


//定义学生类

    public abstract class XueSheng {
        public abstract void chi();
    }


//定义男同学类，同时继承学生类

    public class NanTongXue extends XueSheng{
        public void chi() {
            System.out.println("我是男同学，我嗑瓜子，喝啤酒...");
        }
    }



//定义女同学类，继承学生类，并实现主持人接口

    public class NvTongXue extends XueSheng implements ZhuChiRen{
        public void zhuchi() {
//重写写生类中的抽象吃的方法
            System.out.println("女士们，先生们，大家好，我是主持人......");
        }

        public void chi() {

//实现主持人接口的主持的方法
            System.out.println("我是女同学，我嗑瓜子，吃水果...");
        }
    }


//定义班级类

        //无返回值得，带两个参数的开完会方法，第一个参数为主持人接口类型，第二个为学生参数类型
        public void wanhui(ZhuChiRen z,XueSheng x){

//调用主持人主持方法
            z.zhuchi();

//打印一句话
            System.out.println("晚会正式开始……");

//调用学生吃的方法
            x.chi();
        }
    }

