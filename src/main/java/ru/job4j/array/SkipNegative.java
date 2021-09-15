package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int val = array[row][col];
                if (val < 0) {
                    array[row][col] = 0;
                }
            }
        }
        return array;
    }
}