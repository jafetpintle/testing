package com.me.javatest.util;


public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("Hello",3),"HelloHelloHello");

        assertEquals(StringUtil.repeat("Hello",1), "Hello");

    }

    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected))
            throw new RuntimeException(actual + " is not equals to "+expected);
        else
            System.out.println("Test succesfull...");
    }
}