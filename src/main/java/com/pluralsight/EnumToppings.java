package com.pluralsight;

public enum EPremiumToppings{ Gold_flakes(4.5), caviar(5.4), cheesecake(2.0), mochi(), fresh_wasabi(3.0), bacon(3.0), chiliCrisp(2.0), mangoes(2.0), strawberries(2.0), rasberries(1.5) ; }
private final double price;

Topping(double price) {
    this.price = price;