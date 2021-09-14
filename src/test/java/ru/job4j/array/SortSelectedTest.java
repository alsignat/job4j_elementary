package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {15, 0, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 15};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {31, 100, 11, 4, 14};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 11, 14, 31, 100};
        Assert.assertArrayEquals(expected, result);
    }
}