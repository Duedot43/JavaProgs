package org.duedot43.unit2.shop.newsub;

public class Shop extends Reality {
    private String name;
    private String[] stock;
    private double[] prices;


    public Shop() {
        this.name = "Small Things";
        this.stock = new String[]{ "Pen", "Baseball", "Stress Ball", "Small Watch", "USB Drive" };
        this.prices = new double[]{ 1.00, 2.00, 3.00, 4.00, 5.00 };
    }

    public Shop(double[] prices, String[] stock, String name) {
        this.prices = prices;
        this.stock = stock;
        this.name = name;
    }

    public String onString() {
        String output = "Welcome to " + this.name + "!\n";
        for (int i=0; i<this.prices.length; i++) {
            output += i + " " + this.stock[i] + " - " + this.prices[i] + "\n";
        }
        return output;
    }

    public boolean validItem(int item) {
        if (item > this.stock.length || item < 0) {
            return false;
        } else {
            return true;
        }
    }

    public double buy(int option) {
        return this.prices[option];
    }
}
