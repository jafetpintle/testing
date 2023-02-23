package com.me.javatest.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeatString_trheeTimes() {
        Assert.assertEquals("HelloHelloHello", StringUtil.repeat("Hello", 3));
    }

    @Test
    public void testRepeatString_oneTime() {
        Assert.assertEquals("Hello", StringUtil.repeat("Hello", 1));
    }

    @Test
    public void testRepeatString_zeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("Hello", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatString_NegativeNumber() {
        StringUtil.repeat("Hello", -1);
    }

}