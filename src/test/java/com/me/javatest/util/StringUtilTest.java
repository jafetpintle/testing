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

    @Test
    public void isEmpty_emptyString_true(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmpty_notEmptyString_false(){
        Assert.assertFalse(StringUtil.isEmpty("a"));
    }

    @Test
    public void isEmpty_NullString_true(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_StringWithSpaces_true(){
        Assert.assertTrue(StringUtil.isEmpty("   "));
    }


}