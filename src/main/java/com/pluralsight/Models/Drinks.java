package com.pluralsight.Models;

import com.pluralsight.Enums.Size;


public class Drinks extends Items{
    private Size size;
    private String name;
    private double price;

    public Drinks (String name, Size size, double price) {
        super(name);
        this.size = size;
    }

    public Drinks() {}


    @Override
    public double CalculatePrice() {
        return switch (size) {
            case SMALL -> 2.99;
            case MEDIUM -> 3.49;
            case LARGE -> 4.99;
        };
    }

        @Override
        public String getDescription() {
        return getName() + "(" + size + ")";

        }
        }
