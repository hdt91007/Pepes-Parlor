package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public enum Scoop {
    one(1,1.5 ),
    two(2,3.0),
    three(3,4.5),
    four(4,6.0),
    five(5,7.0),
    six(6,8.0);
    private final double scoops;
    private final double baseprice;
//for small .75 and .30for extra
    //for medium 1.5 and .60 for extra
    //for Large 2.25 and .90 for extra


    Scoop(double scoops, double price) {
        this.baseprice = price;
        this.scoops = scoops;
    }


public double getBaseprice() {
    return baseprice;
}
        public double getCount() {
            return scoops;
    }

        public String getSize() {
            return (scoops <= 2) ? "S"
                    : (scoops <= 4) ? "M"
                    : (scoops <= 6) ? "L"
                    : "Invalid";
        }


    public double getPremiumPrice() {
        return switch (getSize()) {
            case "S" -> 0.75;
            case "M" -> 1.50;
            case "L" -> 2.25;
            default -> 0;
        };
    }
    public double getExtraPremiumPrice() {
        return switch (getSize()) {
            case "S" -> 0.30;
            case "M" -> 0.60;
            case "L" -> 0.90;
            default -> 0;
        };
    }
}




