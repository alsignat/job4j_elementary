package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int num = 5;
        int expected = 120;
        int out = Factorial.calc(5);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int num = 0;
        int expected = 1;
        int out = Factorial.calc(0);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForTwoThenTwo() {
        int num = 2;
        int expected = 2;
        int out = Factorial.calc(2);
        Assert.assertEquals(expected, out);
    }
}