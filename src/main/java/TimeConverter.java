package org.example;

import java.util.Scanner;

public class TimeConverter {

    public static void runTimeConverter(Scanner scanner) {

        String fourthOption;
        double time;
        double result;


while (true) {

        System.out.println("""
                    Please choose between the following options:
                    h. Hour to minute
                    m. Minute to hour
                    x. Back to main menu
                    """);

        fourthOption = scanner.next();

        if (fourthOption.equals("x")) {
            break;
        }

        System.out.print("Enter time: ");
        time = scanner.nextDouble();

        switch (fourthOption) {
            case "h" -> result = HtoM(time);
            case "m" -> result = MtoH(time);
            default -> {
                System.out.println("Invalid choice, try again.");
                continue;
            }
        }

        System.out.println("Result: " + result);
        System.out.println();
    }
}

public static double HtoM(double h) {
    return h * 60;
}

public static double MtoH(double m) {
    return m / 60;
}
}
