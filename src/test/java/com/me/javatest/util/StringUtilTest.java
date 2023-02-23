package com.me.javatest.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeatString() {
        Assert.assertEquals("HelloHelloHello", StringUtil.repeat("Hello", 3));
        Assert.assertEquals("Hello", StringUtil.repeat("Hello", 1));
    }
}