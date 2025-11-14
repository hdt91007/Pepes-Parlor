package com.pluralsight.UI;

import com.pluralsight.Models.Drinks;
import com.pluralsight.Models.Snacks;

import java.util.Scanner;

public class Orderscreen extends Homescreen {


    public static void OpenOrderScreen(Scanner scan) throws InterruptedException {
        Boolean runtime = true;
        System.out.println("Please add a name for the order");
        String customername =scan.nextLine().trim();
        System.out.println("Hello "+ customername +"!");
        Thread.sleep(1500);
        System.out.println(" please input a number if you would like to");
        Thread.sleep(1000);
        System.out.println(" 1 - Add IceCream to your order");
        Thread.sleep(1000);
        System.out.println(" 2 - Add a drink ");
        Thread.sleep(1000);
        System.out.println(" 3 - Add a snack");
        Thread.sleep(1000);
        System.out.println(" 4 - Checkout");
        Thread.sleep(1000);
        System.out.println(" 0 - Cancel Order");
        while (runtime) {




        String choice = scan.nextLine().toUpperCase().trim();
        switch (choice) {
            case "1":
                System.out.println("Pulling up our ice cream");
                Thread.sleep(1000);
                IcecreamUI order = new IcecreamUI();
                order.addIcecream();


                break;

            case "2":
                System.out.println("Bring up available Drinks");
                Thread.sleep(1000);

                DrinksUI.DisplayScreen();
                break;

            case "3":
                System.out.println("Bringing up avaliable Snacks");
                Thread.sleep(1000);

                break;
            case "4":
                System.out.println("Checkout prompt");
                Thread.sleep(1000);

                break;
            case "0":
                System.out.println("Canceling Order and Returning to Homescreen");
            runtime= false;

                break;
            default:
                System.out.println("invalid response");
                break;


        }

        }
}
}
