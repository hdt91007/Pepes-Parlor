package com.pluralsight.Models;

import com.pluralsight.Scoop;
import com.pluralsight.Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Icecream {
    private Scoop scoop;
    private String flavor;
    private List<Toppings> toppings = new ArrayList<>();

    public Icecream(Scoop scoop, String flavor) {
        this.scoop = scoop;
        this.flavor = flavor;
    }

    public Scoop getScoop() {
        return scoop;
    }

    public String getFlavor() {
        return flavor;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }


    public double getPrice() {
        double total = scoop.getBaseprice();

        for (Toppings t : toppings) {
            total += t.getPrice(scoop);
        }
    return total;}
}

