package com.pluralsight.Extra;

public class RegularTopping {
    String name;
    double price;
    boolean extra;

    public RegularTopping(String name, double price, boolean extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public RegularTopping() {

    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }
}