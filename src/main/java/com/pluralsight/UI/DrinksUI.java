package com.pluralsight.UI;

import com.pluralsight.Models.Drinks;

import java.util.Scanner;

public class DrinksUI {
    public static void DisplayScreen() {
       boolean runtime = true;
        Scanner scan = new Scanner(System.in);
        String choice ="U";

        while (runtime) {
            System.out.println("""
                        Opening the Drinks Menu
                        To order a drink input the attached number 
                    
                        1. Cola 1.99
                        2. Orange Soda 1.99
                        3. Coconut water 3.99
                        4. Milkshake 3.99
                    
                          Enter X when done adding Snacks
                    """);
            choice = scan.nextLine().toUpperCase().trim();
            if (choice.equals("X")) {
                System.out.println("Returning to Order Screen");
                runtime = false;
                return;
            }
           else {switch (choice) {
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }

            }
        }
    }
}
