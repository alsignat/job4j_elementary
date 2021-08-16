package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void testingA() {
        // Входные параметра
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        // ожидаемое значение
        int expected = 40;
       // вызов метода, который хотим проверить.
        // Результат вычисления. Это всегда одна переменная.
        int rsl = X2.calc(a, b, c, x);
       // Сравнение
        assertEquals(expected, rsl);
    }

    @Test
    public void testingB() {
        // Входные параметра
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        // ожидаемое значение
        int expected = 3;
        // вызов метода, который хотим проверить.
        // Результат вычисления. Это всегда одна переменная.
        int rsl = X2.calc(a, b, c, x);
        // Сравнение
        assertEquals(expected, rsl);
    }

    @Test
    public void testingC() {
        // Входные параметра
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        // ожидаемое значение
        int expected = 2;
        // вызов метода, который хотим проверить.
        // Результат вычисления. Это всегда одна переменная.
        int rsl = X2.calc(a, b, c, x);
        // Сравнение
        assertEquals(expected, rsl);
    }

    @Test
    public void testingD() {
        // Входные параметра
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        // ожидаемое значение
        int expected = 2;
        // вызов метода, который хотим проверить.
        // Результат вычисления. Это всегда одна переменная.
        int rsl = X2.calc(a, b, c, x);
        // Сравнение
        assertEquals(expected, rsl);
    }

    @Test
    public void testingE() {
        // Входные параметра
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        // ожидаемое значение
        int expected = 1;
        // вызов метода, который хотим проверить.
        // Результат вычисления. Это всегда одна переменная.
        int rsl = X2.calc(a, b, c, x);
        // Сравнение
        assertEquals(expected, rsl);
    }
}