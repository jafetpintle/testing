package com.me.javatest.util;


import org.junit.Assert;
import org.junit.Test;

public class DateUtilShould {

    @Test
    public void isLeapYear_DivisibleBy400_True() {
        Assert.assertTrue(DateUtil.isLeapYear(1600));
        Assert.assertTrue(DateUtil.isLeapYear(2000));
        Assert.assertTrue(DateUtil.isLeapYear(2400));
    }

    @Test
    public void isLeapYear_divisible100butNot400_False(){
        Assert.assertFalse(DateUtil.isLeapYear(1700));
        Assert.assertFalse(DateUtil.isLeapYear(1800));
        Assert.assertFalse(DateUtil.isLeapYear(1900));

    }

    @Test
    public void isLeapYear_byFourButNotByOneHundred(){
        Assert.assertTrue(DateUtil.isLeapYear(1996));
        Assert.assertTrue(DateUtil.isLeapYear(2004));
        Assert.assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    public void isLeapYear_allNotDividedBy4_false(){
        Assert.assertFalse(DateUtil.isLeapYear(2017));
        Assert.assertFalse(DateUtil.isLeapYear(2018));
        Assert.assertFalse(DateUtil.isLeapYear(2019));
    }
}