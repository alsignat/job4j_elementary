package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char cell : board[row]) {
            if (cell != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}