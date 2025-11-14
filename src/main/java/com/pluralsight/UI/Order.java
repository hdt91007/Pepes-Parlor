package com.pluralsight.UI;

import com.pluralsight.Models.Items;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import com.pluralsight.Models.Drinks;
import com.pluralsight.Models.Items;
import com.pluralsight.Models.Snacks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

    public class Order {
        private List<Items> itemsList = new ArrayList<>();
        private LocalDateTime orderTime;






        private double total = 0;

        public Order(List<Items> itemsList, double total) {
            this.itemsList = itemsList;
            this.total = total;
        }
    }
//    public Order() {
//        this.orderTime = LocalDateTime.now();
//
//    }
//    public LocalDateTime getOrderTime() {
//        return orderTime;
//
//    }