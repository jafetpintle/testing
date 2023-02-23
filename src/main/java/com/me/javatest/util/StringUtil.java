package com.me.javatest.util;

public class StringUtil {

    public static String repeat(String str, int n){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
