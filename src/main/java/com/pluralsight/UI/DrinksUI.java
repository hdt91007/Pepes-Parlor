package com.pluralsight.UI;

import com.pluralsight.Enums.Size;
import com.pluralsight.Models.Drinks;
import com.pluralsight.Models.Items;

import java.util.List;
import java.util.Scanner;

public class DrinksUI {
    public static void DisplayScreen() throws InterruptedException {
       boolean runtime = true;
        Scanner scan = new Scanner(System.in);
        String choice ="U";
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
            choice = scan.nextLine().toUpperCase().trim();
            if (choice.equals("X")) {
                System.out.println("Returning to Order Screen");
                runtime = false;
                return;
            }
           else {switch (choice) {
                case "1":
                    System.out.println("""
                            
                    "What size Cola you want?"
                    1 - small
                    2 - medium
                    3- large
                    """);
                    Itemlist.
                    break;
                case "2":
                    System.out.println("""
                            
                    "What size OrangeSoda do you want?"
                    1 - small
                    2 - medium
                    3- large
                    """);
                    break;
                case "3":
                    System.out.println("""
                            
                    "What size Coconut Water do you want?"
                    1 - small
                    2 - medium
                    3- large
                    """);
                    break;
                case "4":
                    System.out.println("""
                            
                    "What size Milkshake do you want?"
                    1 - small
                    2 - medium
                    3- large
                    """);
                    break;
                case "X":
                    System.out.println("Returning to Ordering menu");
                    Thread.sleep(1000);
                    break;
            }

            }
        }
    }
}
