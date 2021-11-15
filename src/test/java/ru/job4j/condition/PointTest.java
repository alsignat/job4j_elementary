package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point aPoint = new Point(0, 0);
        Point bPoint = new Point(2, 0);
        double out = aPoint.distance(bPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to25then2236() {
        double expected = 2.236;
        Point aPoint = new Point(1, 3);
        Point bPoint = new Point(2, 5);
        double out = aPoint.distance(bPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whensdots1() {
        double expected = 12.08;
        Point aPoint = new Point(-1, 2, 8);
        Point bPoint = new Point(10, 2, 3);
        double out = aPoint.distance3D(bPoint);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whensdots2() {
        double expected = 4.58;
        Point aPoint = new Point(4, 2, 5);
        Point bPoint = new Point(0, 0, 6);
        double out = aPoint.distance3D(bPoint);
        Assert.assertEquals(expected, out, 0.01);
    }
}