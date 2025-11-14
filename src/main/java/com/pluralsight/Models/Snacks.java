package com.pluralsight.Models;

import java.util.Scanner;

public class Snacks {


    public static void  DisplayScreen() {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                    Menu for the Snack Bar Menu
                    1. Fries
                    2. Burger
                    3. Tender
                    Enter X when done adding Snacks
                """);
    }
}