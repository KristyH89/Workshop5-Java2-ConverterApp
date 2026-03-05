package org.example;

import java.util.Scanner;

public class WeightConverter {

    public static void runWeightConverter(Scanner scanner) {

        String thirdOption;
        double weight;
        double result;

        while (true) {

            System.out.println("""
                    Please choose between the following options:
                    k. Kilogram to gram
                    g. Gram to kilogram
                    x. Back to main menu
                    """);

            thirdOption = scanner.next();

            if (thirdOption.equals("x")) {
                break;
            }

            System.out.print("Enter weight: ");
            weight = scanner.nextDouble();

            switch (thirdOption) {
                case "k" -> result = KGtoG(weight);
                case "g" -> result = GtoKG(weight);
                default -> {
                    System.out.println("Invalid choice, try again.");
                    continue;
                }
            }

            System.out.println("Result: " + result);
            System.out.println();
        }
    }

    public static double KGtoG(double kg) {
        return kg * 1000;
    }

    public static double GtoKG(double g) {
        return g / 1000;
    }
}