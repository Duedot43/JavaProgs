package org.duedot43.unit2.shop.newnewsub;

public class Ball extends SmallThings{
    private String name;
    private int price;

    public Ball() {
        super();
        this.name = "Ball";
        this.price = 10 * super.clients;
    }

    public Ball(String name, int price) {
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
