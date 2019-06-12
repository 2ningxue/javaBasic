package com.neuedu.DD;
/*编写一个程序，使用集合存储客户的邮件地址。
        地址中应该包含姓名，街道，市（县），省（自治区），国家（地区）然后显示集合ArrayList
        中的内容*/

import java.util.ArrayList;
import java.util.List;

public class EmailTest {
    public static void main(String[] args) {
        List<Email> list = new ArrayList<>();

      //  list.add(new Email("名字","街道","城市","省","国家"));

        System.out.println("邮件地址："+list.toString());
    }
}


