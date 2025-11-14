package com.pluralsight;

import com.pluralsight.Models.Items;

import java.util.List;

public class Order {

    private List<Items> itemsList;
    private double total;

    public Order(List<Items> itemsList, double total) {
        this.itemsList = itemsList;
        this.total = total;
    }
}


