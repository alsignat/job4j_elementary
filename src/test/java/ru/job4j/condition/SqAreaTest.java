package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3Square4687() {
        double expected = 4.6875;
        double p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP14K4Square784() {
        double expected = 7.84;
        double p = 14;
        double k = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}
