package org.duedot43.unit2.shop.newnewsub;

public class Ball extends SmallThings{
    private String name;
    private int price;

    public Ball() {
        super(1);
        this.name = "Ball";
        this.price = 10 * super.getClients();
    }

    public Ball(String name, int price) {
        super(1);
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
