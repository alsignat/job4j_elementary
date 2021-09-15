package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                array[row][col] = (row + 1) * (col + 1);
            }
        }
        return array;
    }
}
