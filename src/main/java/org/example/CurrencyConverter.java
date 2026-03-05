package org.example;

import java.util.Scanner;

public class CurrencyConverter {


    public static void runConverter(Scanner scanner) {

        String secondOption;
        double amount;
        double result = 0;

        while (true) {

            System.out.println("""
                    Please choose between the following options:
                    a. SEK to USD
                    b. USD to SEK
                    c. SEK to EUR
                    d. EUR to SEK
                    x. Back to main menu
                    """);

            secondOption = scanner.next();
            if (secondOption.equals("x")) {
                break;
            }

            System.out.print("Enter amount: ");
            amount = scanner.nextDouble();

            switch (secondOption) {
                case "a" -> result = CurrencyConverter.SEKtoUSD(amount);
                case "b" -> result = CurrencyConverter.USDtoSEK(amount);
                case "c" -> result = CurrencyConverter.SEKtoEUR(amount);
                case "d" -> result = CurrencyConverter.EURtoSEK(amount);
                default -> {
                    System.out.println("Invalid choice, try again.");
                    continue;
                }
            }

            System.out.println("Result: " + result);
            System.out.println();

        }
    }

            public static double SEKtoUSD ( double sek) {
                double rate = 0.109;
                return sek * rate;
            }

            public static double USDtoSEK ( double usd) {
                double rate = 9.20;
                return usd * rate;
            }

            public static double SEKtoEUR ( double sek) {
                double rate = 0.0935;
                return sek * rate;
            }

            public static double EURtoSEK ( double eur) {
                double rate = 10.70;
                return eur * rate;


    }
}