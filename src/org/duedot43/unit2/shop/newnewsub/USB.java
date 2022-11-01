package org.duedot43.unit2.shop.newnewsub;

public class USB extends SmallThings{
    private String name;
    private int price;

    public USB() {
        super();
        this.name = "Ball";
        this.price = 20 * super.clients;
    }

    public USB(String name, int price) {
        super();
        this.name = name;
        this.price = price * super.clients;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " for " + this.price;
    }
}
