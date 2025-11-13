package com.pluralsight;

enum EPremiumToppings {
    Gold_flakes(4.5 , 1),
    caviar(5.4, 2),
    cheesecake(2.0, 3),
    mochi(1.5 , 4),
    fresh_wasabi(3.0, 5),
    bacon(3.0, 6),
    chiliCrisp(2.0 , 7),
    mangoes(2.0,8),
    strawberries(2.0, 9),
    rasberries(1.5 , 10);
    private final double price;
    private final double menuNumber ;

    EPremiumToppings(double price, double menuNumber) {
        this.price = price;
        this.menuNumber = menuNumber ;
    }

    }