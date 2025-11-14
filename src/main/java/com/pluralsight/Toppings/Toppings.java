package com.pluralsight.Toppings;

import com.pluralsight.Enums.Size;

public class Toppings {
    private String name;
    private double price;
    private boolean premium;
    private int referenceNumber;

    public Toppings(String name, double price, boolean premium, int referenceNumber) {
        this.name = name;
        this.price = price;
        this.premium = premium;
        this.referenceNumber = referenceNumber;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public boolean isPremium() {
        return premium;
    }
    public double calculatePrice(Size size) {
        double multiplier = switch (size) {
            case SMALL ->  1.0;
            case MEDIUM -> 1.5;
            case LARGE -> 2.0;
        };
        return price * multiplier;
    }
    @Override
    public String toString() {
        return name + (premium ? " (P)" : "");
    //conoda
    }


}
