package com.pluralsight;

public enum Scoop {
    ONE(1,1.5 ),
    TWO(2,3.0),
    THREE(3,4.5),
    FOUR(4,6.0),
    FIVE(5,7.0),
    SIX(6,8.0);
   private final int count;
   private double baseprice;
   Scoop(int c, double baseprice) {
       this.count = c;
       this.baseprice = baseprice;
   }

    public double getBaseprice() {
        return baseprice;
    }

    public int getCount() {
        return count;
    }
}




