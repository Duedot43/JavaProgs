package org.duedot43.unit2.shop.newnewsub;

public class USB extends SmallThings{
    private String name;
    private int price;

    public USB() {
        super();
        this.name = "Ball";
        this.price = 20 * super.getClients();
    }

    public USB(String name, int price) {
        super();
        this.name = name;
        this.price = price * super.getClients();
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "There are " + super.getClients() + " clients in the shop.";
    }
}
