package com.pluralsight.Models;

import com.pluralsight.Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public abstract class Items {
    String name;
    String size;
    double price;
    List<Toppings> toppings = new ArrayList<>();

    public Items(String name) {
        this.name = name;
    }

    public Items() {
    this.name = "unamed item";
    }

    public String getName() {
        return name;
    }

    public void addTopping(Toppings topping){
        toppings.add(topping);

 }
 public abstract double pricecheck();

    public abstract String getDescription();


    }


