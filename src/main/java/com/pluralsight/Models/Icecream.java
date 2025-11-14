package com.pluralsight.Models;

import com.pluralsight.Enums.Flavors;
import com.pluralsight.Enums.Size;
import com.pluralsight.Toppings.Toppings;
import com.pluralsight.Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Icecream extends Items {
    private double scoop;
    private Size size;
    private Flavors flavor;
    private List<Toppings> toppings = new ArrayList<>();

    public Icecream(String name) {
        super(name);
    }

    public Icecream(){};
    public Size getSize(){
    return size;
}

public Flavors getFlavor() {
    return flavor;
}

    public void setSize(Size size) {
        this.size = size;
    }

    public void setFlavor(Flavors flavor) {
        this.flavor = flavor;
    }

    public void addToppings(Toppings topping) {
    toppings.add(topping);
    }
    public List<Toppings> getToppings() {
        return toppings;
    }

    @Override
    public double CalculatePrice() {
        double base = switch (size) {
            case SMALL -> 1.5;
            case MEDIUM -> 3;
            case LARGE ->  4.5;
        };
        for (Toppings t : toppings) {
            base +=t.getPrice ();
        }
        return base;
    }

    @Override
    public String getDescription() {
        return "";
    }
    //
//    public Icecream(double scoop, String flavor, double price) {
//        this.scoop = scoop;
//        this.flavor = flavor;
//        this.price = price;
//    }
//
//    public Icecream() {
//    }
//
//    public void setscoop(double scoop) {
//        this.scoop = scoop;
//    }
//
//    public double getScoop() {
//        return scoop;
//    }
//


//

//
//
//    public double getPrice() {
//        return price;
//    }
//
//    }
//
//    @Override
//    public String getDescription() {
//        return "";
//    }
//}
}
