package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 60 / 70;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 70 / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140) + Converter.dollarToEuro(15);
        float dollars = Converter.rubleToDollar(240) + Converter.euroToDollar(30);
        float rubles = Converter.dollarToRuble(10) + Converter.euroToRuble(20);

        System.out.println("140 rubles plus 10 dollars are " + String.format("%.2f", euro) + " euro.");
        System.out.println("240 rubles plus 30 euro are " + String.format("%.2f", dollars) + " dollars.");
        System.out.println("10 dollars plus 20 euro are " + String.format("%.2f", rubles) + " rubles.");
    }
}