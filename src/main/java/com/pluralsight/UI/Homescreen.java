package com.pluralsight.UI;

import java.util.Scanner;

import static com.pluralsight.UI.Orderscreen.OpenOrderScreen;

public class Homescreen {

    public static void OpenHomescreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Welcome to Pepe's Parlor
  
  
                Ice cream Flavors
                - Vanilla
                - Mint
                - Cholate
                - Strawberry
                - Rocky Road
                - Coffee
                
                
                Toppings *all star marked toppings will be upcharged
                - Vanilla
                - Mint
                - Cholate
                - Strawberry
                - Rocky Road
                - Coffee
                
                
                Addons
                - Drinks
                - Snacks
                - Food
                - Bag
                - collectible
                
                """);
        System.out.println(""" 
                Please input 1 when your ready to order
                
                or
                
                Input X to Exit
                """);
        boolean runtime = true;
        while (runtime) {
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                System.out.println("Starting order");
                OpenOrderScreen(scan);
                ;
            } else if(choice.equalsIgnoreCase("X"))  {
                System.out.println("""
                        Thank you for visiting Pepe's Parlor.
                        Have a nice day!!
                       
                        """);
                runtime = false;
            } else {
                System.out.println("Input error");

            }

        }
    }
}
