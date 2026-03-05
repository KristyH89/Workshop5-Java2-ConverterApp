package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String []args) {

Scanner scanner = new Scanner(System.in);
byte firstoption;

System.out.println(""" 
Welcome to the Coverter App

Please choose between the following options:

1. Currency Converter
2. Weight Converter
3. Time Converter
4. Exit
""");

System.out.print("Enter your choice:");
        firstoption = scanner.nextByte();


/* Flowchart
Converter App
Start

1. Currency Converter
2. Weight Converter
3. Time Converter
4. Exit

Option 1:
Choose u for USD
Choose e for EUR

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


    }
}
