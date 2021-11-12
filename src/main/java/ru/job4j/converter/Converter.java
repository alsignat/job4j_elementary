package ru.job4j.converter;

public class Converter {
    /**
     *
     * @param value input money sum needed to exchange
     * @return rsl output money sum in given currency
     */

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

        float euroIn = 210;
        float dollarsIn = 105;
        float rublesIn = 530;

        float euro = Converter.rubleToEuro(rublesIn) + Converter.dollarToEuro(dollarsIn) + euroIn;
        float dollars = Converter.rubleToDollar(rublesIn) + Converter.euroToDollar(euroIn) + dollarsIn;
        float rubles = Converter.dollarToRuble(dollarsIn) + Converter.euroToRuble(euroIn) + rublesIn;

        float totalExpectedDollars = 358.83f;
        float totalExpectedEuro = 307.57f;
        float totalExpectedRubles = 21530f;

        boolean testEuro = Math.abs(euro - totalExpectedEuro) < 0.01;
        boolean testDollars = Math.abs(dollars - totalExpectedDollars) < 0.01;
        boolean testRubles = Math.abs(rubles - totalExpectedRubles) < 0.01;

        System.out.println("Expected total money in dollars: " + totalExpectedDollars + ". Result: " + dollars + ". Test passed: " + testDollars);
        System.out.println("Expected total money in euro: " + totalExpectedEuro + ". Result: " + euro + ". Test passed: " + testEuro);
        System.out.println("Expected total money in rubles: " + totalExpectedRubles + ". Result: " + rubles + ". Test passed: " + testRubles);
    }
}
