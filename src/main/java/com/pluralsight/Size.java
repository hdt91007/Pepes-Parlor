package com.pluralsight;

public enum Size {
    oneScoops(1.5, 1, "S"),
    twoScoops(3, 2, "S"),
    threeScoops(4.5, 3, "M"),
    fourScoops(6.0, 4, "M"),
    fiveScoops(7.0, 5, "L"),
    sixScoops(8.0, 6, "L");
    private final double price;
    private final double scoops;
    private final String scale;

    Size(double price, double scoops, String scale) {
        this.price = price;
        this.scoops = scoops;
        this.scale = scale;
    }

    public double getprice() {
        return price;
    }

    }



