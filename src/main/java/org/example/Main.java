package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String []args) {

Scanner scanner = new Scanner(System.in);
byte firstOption;
char secondOption;
int select = 0;


System.out.println(""" 
Welcome to the Coverter App

Please choose between the following options:

1. Currency Converter
2. Weight Converter
3. Time Converter
4. Exit
""");

    while (true) {

        System.out.print("Enter your choice:");
        firstOption = scanner.nextByte();

        switch (select) {
            case 1:
                System.out.println("""
                        Enter a for SEK till USD
                        Enter b for USD till SEK 
                        Enter c for SEK till EUR
                        Enter d for EUR till SEK""");
                secondOption = scanner.next()
            break;
            case 2:

            case 3:

            case 4:


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

    }
    }
}
