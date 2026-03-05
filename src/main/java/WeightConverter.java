package org.example;

import java.util.Scanner;

public class WeightConverter {
    public static void runWeightConverter(Scanner scanner) {

            String thirdOption;
            Double weight;

        while (true) {

            System.out.println("""
                    Please choose between the following options:
                    k. KiloGram to gram
                    g. Gram to kilogram
                    x. Back to main menu.
                    """);

            thirdOption = scanner.next();
            if (thirdOption.equals("x")) {
                break;
            }

            System.out.println("Enter weight: ");
            weight = scanner.nextDouble();
    /*



            System.out.print("Enter amount: ");
            amount = scanner.nextDouble();

            switch (secondOption) {
                case "a" -> result = Valutaconverter.SEKtoUSD(amount);
                case "b" -> result = Valutaconverter.USDtoSEK(amount);
                case "c" -> result = Valutaconverter.SEKtoEUR(amount);
                case "d" -> result = Valutaconverter.EURtoSEK(amount);
                default -> {
                    System.out.println("Invalid choice, try again.");
                    continue;
                }
            }

            System.out.println("Result: " + result);
            System.out.println();

     */

public static double KGtoG(double kg) {
        return kg * 1000;

}
    public static double GtoKG(double g) {
              return g / 1000;
    }


}