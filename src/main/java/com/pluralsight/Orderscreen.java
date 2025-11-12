package com.pluralsight;

import java.util.Scanner;

public class Orderscreen extends Homescreen {


    public static void OpenOrderScreen(Scanner scan) {
        System.out.println("AHHHHHHH");
        System.out.println("Please add a name for the order");

        System.out.println("""
                Prompting order menu would you like to 
                
                1Add IceCream to your order
                2Add a drink
                3Add a snack 
                4 *Other
                5 Review your order 
                
                """);

        String choice = scan.nextLine().toUpperCase().trim();
        switch (choice) {
            case "1":
                System.out.println();

                break;
            case "2":
                System.out.println("action 2");
                break;
            case "3":
                System.out.println("action 3");

                break;
            case "4":
                System.out.println("action 4");

                break;
            case "5":
                System.out.println("action 5");

                break;
            case "x":
                System.out.println("returning to Homescreen");

                break;
            case "M":
                System.out.println("View menu");

                break;
            default:
                System.out.println("invalid response");
                break;


        }

    }
}
