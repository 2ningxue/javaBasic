package com.neuedu.DD;
     /*编写一个程序，使用集合存储客户的邮件地址。
             地址中应该包含姓名，街道，市（县），省（自治区），国家（地区）然后显示集合ArrayList
             中的内容*/

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

public class Email {
    private String name;
    private String address;
    private String city;
    private String provence;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "邮件地址："+getName()+getAddress()+getCity()+getProvence()+getCountry();
    }
}


