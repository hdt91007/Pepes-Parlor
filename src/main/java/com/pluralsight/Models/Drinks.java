package com.pluralsight.Models;

import java.util.Scanner;

public class Drinks extends Items{
    String Name;
    double Price;

    public String getName() {
        return Name;
    }

    @Override
    public double pricecheck() {
        return price;
    }

    @Override
    public String getDescription() {
        return name;
    }



    public Drinks(String name, double price) {
        super (name);
        this.price = price;

    }
}
