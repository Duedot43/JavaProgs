package org.duedot43.shop;

public class Shop {
    private String name;
    private  String[] stock;
    private double[] prices;
    public int customers = 0;

    public Shop() {
        this.prices = new double[]{ 1.00, 2.00, 3.00, 4.00, 5.00 };
        this.stock = new String[]{ "Pen", "Baseball", "Stress Ball", "Small Watch", "USB Drive" };
        this.name = "Small Things";
    }

    public Shop(double[] prices, String[] stock, String name) {
        this.prices = prices;
        this.stock = stock;
        this.name = name;
    }


    public String[] getStock() {
        return this.stock;
    }

    public String toString() {
        String output = "Welcome to " + this.name + "!\n";
        for (int i = 0; i < this.stock.length; i++) {
            output += i + " = " + this.stock[i] + " - " + this.prices[i] + "\n";
        }
        return output;
    }
    public double buy(int itemIndex, int quantity) {
        System.out.println("You bought " + quantity + " " + this.stock[itemIndex] + "(s) for " + this.prices[itemIndex] + " each.");
        return this.prices[itemIndex] * quantity;
    }
}
