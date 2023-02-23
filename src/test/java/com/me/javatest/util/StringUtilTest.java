package com.me.javatest.util;


public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hello",3);
        System.out.println(result);
        if(!result.equals("HelloHelloHello"))
            System.out.println("Ok");

        String result2 = StringUtil.repeat("Hello",1);
        System.out.println(result2);
        if(!result2.equals("Hello"))
            System.out.println("Error");


    }
}