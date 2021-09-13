package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-2);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is a negative number.");
        }
    }
}
