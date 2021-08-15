package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float in = 150;
        float expected = 2.14f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void euroToRuble() {
        float in = 150f;
        float expected = 10500f;
        float out = Converter.euroToRuble(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void rubleToDollar() {
        float in = 140f;
        float expected = 2.33f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void dollarToRuble() {
        float in = 3.5f;
        float expected = 210f;
        float out = Converter.dollarToRuble(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void dollarToEuro() {
        float in = 34f;
        float expected = 29.14f;
        float out = Converter.dollarToEuro(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void euroToDollar() {
        float in = 3.9f;
        float expected = 4.55f;
        float out = Converter.euroToDollar(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}