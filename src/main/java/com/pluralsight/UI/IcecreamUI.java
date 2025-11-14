package com.pluralsight.UI;

import com.pluralsight.Enums.Flavors;
import com.pluralsight.Enums.Size;
import com.pluralsight.Extra.PremiumTopping;
import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Models.Icecream;
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
//    public void setScoop(double numberOfScoops) {
//        int scoopsInt = (int) numberOfScoops;
//
//        switch (scoopsInt) {
//            case 1 -> this.scoop = Scoop.one;
//            case 2 -> this.scoop = Scoop.two;
//            case 3 -> this.scoop = Scoop.three;
//            case 4 -> this.scoop = Scoop.four;
//            case 5 -> this.scoop = Scoop.five;
//            case 6 -> this.scoop = Scoop.six;
//        }
//
//    }
//
//    public double getScoop() {
//        return scoop.getCount();
//    }

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


    public void addIcecream() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Icecream order = new Icecream();


        System.out.println("""
                How many scoops of icecream would you like?
                1-2 Small
                3-4 Medium 
                5-6 Large 
                """);

        int scoopCount = Integer.parseInt(scan.nextLine().trim());
        if (scoopCount <= 2) {
            order.setSize(Size.SMALL);
        } else if (scoopCount <= 4) {
            order.setSize(Size.MEDIUM);
        } else {
            order.setSize(Size.LARGE);
            System.out.println(scoop);
//todo dynamic scoops
            //todo display pricing at each step

        }
            System.out.println("what flavor would you like");
            System.out.println("We serve Vanilla, Cholate, Strawberry, Mint_Chip, Rocky_Road, Coffee");
//todo premium icecream flavor
            //todo display pricing at each step

            order.setFlavor(Flavors.valueOf(scan.nextLine().toUpperCase().trim()));
            System.out.println(order.getFlavor());
            boolean running = true;
            while (running) {
                System.out.println("""
                        Premium Toppings List
                        
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
            System.out.println(premiumList.toString());
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
                            break;
                        case "2":
                            Toppingobj.setName("M&M");
                            break;
                        case "3":
                            Toppingobj.setName("Crackers");
                            break;
                        case "4":
                            Toppingobj.setName("Oreo Bits");
                            break;
                        case "5":
                            Toppingobj.setName("Peanuts");
                            break;
                        case "6":
                            Toppingobj.setName("banana slices");
                            break;
                        case "7":
                            Toppingobj.setName("cherries");
                            break;


                        //todo display pricing at each step

                        //todo validation


                    }
                    Toppingobj.setExtra(extra);
                    regularList.add(Toppingobj);
                    System.out.println(regularList.toString());
                    Thread.sleep(1000);
                }

            }
        }
    }

