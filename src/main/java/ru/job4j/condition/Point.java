package ru.job4j.condition;

import java.util.concurrent.locks.Condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (2, 2) " + Point.distance(0,0,2,2));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(0,1,2,2));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(-5,1,3,10));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(1,-5,0,8));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(0,0,0,0));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(1,1,-1,-5));
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(13,200,-1,10));
    }
}