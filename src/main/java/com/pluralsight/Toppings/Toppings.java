package com.pluralsight.Toppings;

public enum Toppings {
    gold_flakes("Gold Flakes",4.5 , 1, true),
    caviar("caviar",5.4, 2,true),
    cheesecake("Cheesecake",1.0, 3,true),
    mochi("Mochi",0.5 , 4,true),
    fresh_wasabi("Fresh Wasabi",2.0, 5,true),
    bacon("Bacon",3.0, 6,true),
    chiliCrisp("Chili Crisp",2.0 , 7,true),
    mangoes("Mangoes ",0.25,8,true),
    strawberries("Strawberries",0.25, 9,true),
    raspberries("Raspberries ",0.25 , 10,true),

    sprinkles("Sprinkles",0, 11, false),
    mms ("M&Ms",0, 12, false),
    crackers ("Crackers",0, 13, false),
    peanuts ("Peanuts",0, 14, false),
    banana_slices ("Banana Slices",0, 15, false),
    mint ("Mint", 0 , 16, false),
    granola("Granola", 0 , 16, false),


    ;




//        12. M&M
//        13. Crackers
//        14. Oreo Bits
//        15. Peanuts
//        16. banana slices

    private final String name;
    private final double price;
    private final double menuNumber ;
    private final boolean isPremiumTopping;

    Toppings(String name, double price, double menuNumber, boolean isPremiumTopping) {
        this.name = name;
        this.price = price;
        this.menuNumber = menuNumber;
        this.isPremiumTopping = isPremiumTopping;
        //todo debug this
    }


    public double getMenuNumber() {
        return menuNumber;
    }

    public boolean isPremiumTopping() {
        return isPremiumTopping;
    }
    public double getPrice(){
        if (isPremiumTopping){
            return price;}
        else {
            return 0;}
    }

}