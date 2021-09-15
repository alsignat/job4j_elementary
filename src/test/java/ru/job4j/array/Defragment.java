package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        int value = j;
                        array = SwitchArray.swapString(array, point, value);
                        break;
                    }
                }
            }
        }
        return array;
    }
}