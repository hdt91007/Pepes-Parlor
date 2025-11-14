package com.pluralsight.UI;

import java.util.Scanner;

import static com.pluralsight.UI.Orderscreen.OpenOrderScreen;

public class Homescreen {

    public static void OpenHomescreen() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Welcome to Pepe's Parlor
                """
        );
        Thread.sleep(1000);
        System.out.println("We serve a variety of Icecream and toppings!!!");
        Thread.sleep(2000);

        System.out.println(""" 
                Please input 1 when your ready to preview our menu
                
                                    or
                
                              Input X to Exit
                """);
        boolean runtime = true;
        while (runtime) {
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                System.out.println("Starting order");
                Thread.sleep(500);

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
