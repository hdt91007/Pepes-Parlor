package com.pluralsight.Models;

import java.util.Scanner;

public class Snacks extends Items {

    private double price;

    public Snacks (String name, double price){
        super(name);
        this.price = price;
    }

    @Override
    public double CalculatePrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}