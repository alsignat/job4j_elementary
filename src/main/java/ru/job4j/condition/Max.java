package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(first, second);
        int result = max(tmp, third);
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(first, second, third);
        int result = max(tmp, fourth);
        return result;
    }

}
