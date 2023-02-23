package com.me.javatest.util;

public class StringUtil {

    public static String repeat(String str, int n){
        StringBuilder result = new StringBuilder();
        if(n <0 )
            throw new IllegalArgumentException("Negative numbers are not allowed");

        for (int i = 0; i <n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public static boolean isEmpty(String str){
        str = str.trim();
        if(str == null || str.length() == 0){
            return true;
        }else{
            return false;
        }
    }

}
