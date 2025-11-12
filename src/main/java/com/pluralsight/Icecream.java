package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Icecream {
String Size;
Double Price;
String Flavor;
//todo add multi flavors
ArrayList<PremiumTopping> PremiumList = new ArrayList<PremiumTopping>();
ArrayList<Regulartopping> RegularList = new ArrayList<Regulartopping>();

    public Icecream(Double price, String size, String flavor, ArrayList<PremiumTopping> premiumList, ArrayList<Regulartopping> regularList) {
        Price = price;
        Size = size;
        Flavor = flavor;
        PremiumList = premiumList;
        RegularList = regularList;
    }

public Icecream(){};


    public String getFlavor() {
        return Flavor;
    }

    public void setFlavor(String flavor) {
        Flavor = flavor;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public ArrayList<PremiumTopping> getPremiumList() {
        return PremiumList;
    }

    public void setPremiumList(ArrayList<PremiumTopping> premiumList) {
        PremiumList = premiumList;
    }

    public ArrayList<Regulartopping> getRegularList() {
        return RegularList;
    }

    public void setRegularList(ArrayList<Regulartopping> regularList) {
        RegularList = regularList;
    }

    public void addIcecream(){
        System.out.println("how many scoops would you like");
        Scanner scan = new Scanner(System.in);
        Icecream order = new Icecream();
        order.setSize(scan.nextLine().toUpperCase().trim());
//todo dynamic scoops


        System.out.println("Flavor would you like");
        order.setFlavor(scan.nextLine().toUpperCase().trim());

        System.out.println("Type out your desired topping");
        order.add(scan.nextLine().toUpperCase().trim());



        //todo validation

}

}

