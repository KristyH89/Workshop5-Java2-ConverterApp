package org.example;
import org.example.CurrencyConverter;

import java.util.Scanner;
public class Main {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        byte firstOption;

        while (true) {
            System.out.println(""" 
                    =============================================
                    Welcome to the Coverter App
                    
                    Please choose between the following options:
                    
                    1. Currency Converter
                    2. Weight Converter
                    3. Time Converter
                    4. Exit
                    ============================================
                    """);


            System.out.print("Enter your choice:");
            firstOption = scanner.nextByte();

            switch (firstOption) {
                case 1:
                    Currencyconverter.runCurrencyConverter(scanner);
                    break;

                case 2:
                    System.out.println("Weight Converter coming soon...");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Time Converter coming soon...");
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Exiting...");

                    return;

                default:
                    System.out.println("Invalid choice.");

            }
        }
    }
}
/* Flowchart
Converter App
Start

1. Currency Converter
2. Weight Converter
3. Time Converter
4. Exit

Option 1:
Choose a for SEK --> USD
Choose b for USD --> SEK
Choose c for SEK --> EUR
choose d for EUR --> SEK

Enter amount in SEK:
Result = amount * 0,109
Print result + USD

Enter amount in SEK:
Result = amount * 0,0935
Print result + EUR

Option 2:
Choose k for kg -> G
Enter kg
Result = kg * 1000
Print result + gram

Choose g for gram -> kg
Enter gram
Result = gram / 1000
Print result + kilogram

Option 3:
Choose H for hours -> minutes
Enter hours
Result = hours * 60
Print result + minutes

Choose m for minutes -> hours
Enter minutes
Result = minutes /60
Print result + hours


 */



