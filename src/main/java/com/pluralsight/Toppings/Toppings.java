package com.pluralsight.Toppings;

import com.pluralsight.Scoop;

public enum Toppings {
    gold_Flakes("Gold Flakes" , true),
    caviar("Caviar",true),
    cheesecake("Cheesecake",true),
    mochi("Mochi",  true),
    fresh_wasabi("Fresh Wasabi", true),
    bacon("Bacon", true),
    chiliCrisp("Chili Crisp", true),
    mangoes("Mangoes ",true),
    strawberries("Strawberries", true),
    raspberries("Raspberries ", true),

    sprinkles("Sprinkles",  false),
    mms ("M&Ms",  false),
    crackers ("Crackers",  false),
    peanuts ("Peanuts",  false),
    banana_slices ("Banana Slices",  false),
    mint ("Mint",  false),
    granola("Granola",  false);

    private final String name;
    private final boolean isPremium;

    Toppings(String name, boolean isPremium) {
        this.name = name;
        //todo debug this
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }
    public boolean isPremium() {
        return isPremium;
    }

    public double getPrice(Scoop scoop) {
        if (!isPremium) return 0;
        return scoop.getPremiumPrice();
    }
    }