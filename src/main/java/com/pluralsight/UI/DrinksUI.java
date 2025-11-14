package com.pluralsight.UI;

import com.pluralsight.Enums.Size;
import com.pluralsight.Models.Drinks;
import com.pluralsight.Models.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrinksUI {
    public static void DisplayScreen() throws InterruptedException {
        boolean runtime = true;
        Scanner scan = new Scanner(System.in);
        List<Items> orderedDrinks = new ArrayList<>();
        String choice = "";
        System.out.println("Opening the Drinks Menu");
        Thread.sleep(1000);
        System.out.println("""
                To order a drink input the attached number 
                
                     1. Cola 1.99
                     2. Orange Soda 1.99
                     3. Coconut water 3.99
                     4. Milkshake 3.99
                
                Enter X when done adding Drinks
                """);
        while (runtime) {

            choice = scan.nextLine().trim().toUpperCase();

            if (choice.equals("X")) {
                System.out.println("Returning to Order Screen");
                Thread.sleep(500);
                break;
            }

            String drinkName = "";
            double basePrice = 0;

            switch (choice) {
                case "1":
                    drinkName = "Cola";
                    basePrice = 1.99;
                    break;

                case "2":
                    drinkName = "Orange Soda";
                    basePrice = 1.99;
                    break;

                case "3":
                    drinkName = "Coconut Water";
                    basePrice = 3.99;
                    break;

                case "4":
                    drinkName = "Milkshake";
                    basePrice = 3.99;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            // -------------------------
            // SIZE SELECTION
            // -------------------------
            System.out.println("""
                    What size do you want?
                    1 - SMALL
                    2 - MEDIUM
                    3 - LARGE
                    """);

            String sizeChoice = scan.nextLine().trim();
            Size size = null;

            switch (sizeChoice) {
                case "1":
                    size = Size.SMALL;
                    break;
                case "2":
                    size = Size.MEDIUM;
                    break;
                case "3":
                    size = Size.LARGE;
                    break;
                default:
                    System.out.println("Invalid size. Returning to menu.");
                    continue;
            }

            double finalPrice = switch (size) {
                case SMALL -> basePrice;
                case MEDIUM -> basePrice + 0.50;
                case LARGE -> basePrice + 1.00;
            };

            Items drink = new Drinks(drinkName, size, finalPrice) {
//                @Override
//                public double CalculatePrice() {
//                    return Items;
//                }
//
//                @Override
//                public String getDescription() {
//                    return "";
//                }
//            };
//            orderedDrinks.add(drink);


            };


        }
    }
}