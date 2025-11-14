package com.pluralsight.Extra;

public class PremiumTopping {
    String name;
    double price;
    boolean extra;

    public PremiumTopping(String name, double price, boolean extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public PremiumTopping() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(String Size) {

        switch (Size) {
            case "S":
                if (extra) {
                    return 1.5;
                } else {
                    return 1.0;
                }
                //todo dynamic price by .5 value
            case "M":
                if (extra) {
                    return 3;
                } else {
                    return 2;
                }
            case "L":
                if (extra) {
                    return 4.50;
                } else {
                    return 3.0;
                }
            default:
                return 0;
//todo add an invalid case for redo
        }

        //return price;
        //todo auto adjust Size


    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public void addPremiumTopping(String UI) {    }
}
