package com.pluralsight.UI;

import com.pluralsight.Extra.PremiumTopping;
import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Models.Items;
import com.pluralsight.Scoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IcecreamUI {


    private Scoop scoop;
    private String flavor;
    //todo add multi flavors
    ArrayList<PremiumTopping> premiumList = new ArrayList<PremiumTopping>();
    ArrayList<RegularTopping> regularList = new ArrayList<RegularTopping>();


    public IcecreamUI(Scoop scoop, String flavor) {
        this.scoop = scoop;
        this.flavor = flavor;
    }

    public IcecreamUI() {

    }

    public void setScoop(double numberOfIceCreamScoops) {

    }

    public double getScoops(double numberOfIceCreamScoops) {
        return numberOfIceCreamScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    public String getDescription() {
        return "";
    }


    public String getSize() {
        return scoop.getSize();
    }


//    public ArrayList<PremiumTopping> getPremiumList() {
//        return premiumList;
//    }
//
//    public void setPremiumList(ArrayList<PremiumTopping> premiumList) {
//        this.premiumList = premiumList;
//    }
//
//    public ArrayList<RegularTopping> getRegularList() {
//        return regularList;

//
//    public void setRegularList(ArrayList<RegularTopping> regularList) {
//        this.regularList = regularList;


    public void addIcecream() {
        Scanner scan = new Scanner(System.in);
        IcecreamUI order = new IcecreamUI();


        System.out.println("""
                How many scoops of icecream would you like?
                1-2 Small
                3-4 Medium 
                5-6 Large 
                """);
        List<Scoop> Scoops = Arrays.asList(Scoop.values());

        //todo verify
        order.setScoop(Double.parseDouble(scan.nextLine().trim()));

//todo dynamic scoops
        //todo display pricing at each step


        System.out.println("what flavor would you like");
        System.out.println("We serve Choclate, Vanilla, Strawberry, Mint, Mango");
//todo premium icecream flavor
        //todo display pricing at each step

        order.setFlavor(scan.nextLine().toUpperCase().trim());
        //
        boolean running = true;
        while (running) {
            System.out.println("""
                    Premium Toppings List
                    Note:All items w/ a * will increase the price of the order
                    
                    1.Gold flakes *
                    2.Caviar *
                    3.Cheesecake *
                    4.Mochi *
                    5.fresh wasabi *
                    6.Bacon *
                    7.Chili crisp *
                    8.Mangoes *
                    9.Strawberries *
                    10.Rasberries *
                    PLease input X when done
                    """);
            System.out.println("please input which topping you would like to add");
            String Choice = scan.nextLine();

            if (Choice.equalsIgnoreCase("X")) {
                running = false;
            } else {
                System.out.println("Would you perfer extra? true or false");
                Boolean extra = Boolean.valueOf(scan.nextLine().toUpperCase().trim());
                PremiumTopping Toppingobj = new PremiumTopping();
                switch (Choice) {

                    case "1":
                        Toppingobj.setName("Gold flakes");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "2":
                        Toppingobj.setName("Caviar");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "3":
                        Toppingobj.setName("Cheesecake");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "4":
                        Toppingobj.setName("Mochi");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "5":
                        Toppingobj.setName("fresh wasabi");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "6":
                        Toppingobj.setName("Bacon");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "7":
                        Toppingobj.setName("Chili crisp");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "8":
                        Toppingobj.setName("Mangoes");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "9":
                        Toppingobj.setName("Strawberries");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;
                    case "10":
                        Toppingobj.setName("Rasberries");
                        Toppingobj.setExtra(extra);
                        premiumList.add(Toppingobj);
                        break;

                }


            }

        }
        running = true;
        while (running) {
            System.out.println("""
                    Regular Toppings List
                    
                    1. Sprinkles
                    2. M&M
                    3. Crackers
                    4. Oreo Bits
                    5. Peanuts
                    6. banana slices
                    7. cherries
                                PLease input X when done
                    
                    """);
            System.out.println("please input which topping you would like to add");
            System.out.println("Would you perfer extra? true or false");
            System.out.println("please input which topping you would like to add");
            String Choice = scan.nextLine();

            if (Choice.equalsIgnoreCase("X")) {
                running = false;
            } else {
                System.out.println("Would you perfer extra? true or false");
                Boolean extra = Boolean.valueOf(scan.nextLine().toUpperCase().trim());
                RegularTopping Toppingobj = new RegularTopping();
                switch (Choice) {

                    case "1":
                        Toppingobj.setName("Sprinkles");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "2":
                        Toppingobj.setName("M&M");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "3":
                        Toppingobj.setName("Crackers");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "4":
                        Toppingobj.setName("Oreo Bits");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "5":
                        Toppingobj.setName("Peanuts");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "6":
                        Toppingobj.setName("Bacon");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "7":
                        Toppingobj.setName("banana slices");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "8":
                        Toppingobj.setName("cherries");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "9":
                        Toppingobj.setName("Mangoes");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "10":
                        Toppingobj.setName("Strawberries");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;
                    case "11":
                        Toppingobj.setName("Rasberries");
                        Toppingobj.setExtra(extra);
                        regularList.add(Toppingobj);
                        break;


                    //todo display pricing at each step

                    //todo validation

                }
            }
        }
    }
}
