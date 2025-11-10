package com.pluralsight;

import java.util.Scanner;

public class Homescreen {

    public static void OpenHomescreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Welcome to pepe parlor
                
                Show General menu here
                
                
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
                OpenHomescreen();
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
//todo add a input error loop
    }
}
