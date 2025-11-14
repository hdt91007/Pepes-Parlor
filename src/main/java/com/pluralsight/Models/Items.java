package com.pluralsight.Models;

import com.pluralsight.Enums.Size;

public abstract class Items {
    private String name;

    public Items(String name) {
        this.name = name;
    }

    public Items(String drinkName, Size size, double finalPrice) {
    }

    public String getName() {
        return name;
    }
public Items(){}
    public abstract double CalculatePrice();


    public abstract String getDescription();


    }


