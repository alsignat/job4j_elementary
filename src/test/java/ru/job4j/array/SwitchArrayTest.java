package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to2() {
        int[] input = {7, 10, 3, 15};
        int source = 3;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 10, 15, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {0, 11, 22, 44, 55};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 55, 22, 44, 11};
        Assert.assertArrayEquals(expected, result);
    }
}
