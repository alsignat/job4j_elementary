package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max10and23() {
        int a = 10;
        int b = 23;
        int expected = 23;
        int out = Max.max(10, 23);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max30and30() {
        int a = 30;
        int b = 30;
        int expected = 30;
        int out = Max.max(30, 30);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max50and20() {
        int a = 50;
        int b = 20;
        int expected = 50;
        int out = Max.max(50, 20);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max5and20and55() {
        int a = 5;
        int b = 20;
        int c = 55;
        int expected = 55;
        int out = Max.max(5, 20, 55);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max1and12and17and3() {
        int a = 1;
        int b = 12;
        int c = 17;
        int d = 3;
        int expected = 17;
        int out = Max.max(1, 12, 17, 3);
        Assert.assertEquals(expected, out);
    }
}
