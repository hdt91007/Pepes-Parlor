package com.pluralsight.UI;

import com.pluralsight.Models.Drinks;
import com.pluralsight.Models.Snacks;

import java.util.Scanner;

public class Orderscreen extends Homescreen {


    public static void OpenOrderScreen(Scanner scan) {
        Boolean runtime = true;

        while (runtime) {

            System.out.println("Please add a name for the order");
            String customername =scan.nextLine().trim();
            System.out.println("Hello "+ customername +"!");
        System.out.println("""
                Prompting order menu would you like to 
                
                1 - Add IceCream to your order
                2 - Add a drink
                3 - Add a snack 
                4 - Checkout
                X - Cancel Order
                """);

        String choice = scan.nextLine().toUpperCase().trim();
        switch (choice) {
            case "1":
                System.out.println("Pulling up our ice cream");

                IcecreamUI order = new IcecreamUI();
                order.addIcecream();


                break;

            case "2":
                System.out.println("action 2");
                DrinksUI.DisplayScreen();
                break;

            case "3":
                System.out.println("action 3");
                Snacks.DisplayScreen();
                break;
            case "4":
                System.out.println("action 4");

                break;
            case "5":
                System.out.println("action 5");

                break;
            case "X":
                System.out.println("returning to Homescreen");
runtime= false;

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
    }
