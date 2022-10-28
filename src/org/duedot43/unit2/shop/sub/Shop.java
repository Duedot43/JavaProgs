package org.duedot43.unit2.shop.sub;

import java.util.Scanner;

public class Shop extends Reality {

    private String shopName;
    private String[] items;
    private double[] prices;
    public Scanner input = new Scanner(System.in);

    public Shop() {
        this.prices = new double[] { 1.00, 2.00, 3.00, 4.00, 5.00 };
        this.items = new String[] { "Pen", "Baseball", "Stress Ball", "Small Watch", "USB Drive" };
        this.shopName = "Small Things";
    }

    public Shop(String name, String[] items, double[] prices) {
        this.shopName = name;
        this.items = items;
        this.prices = prices;
    }

    public String shopName() {
        return this.shopName;
    }

    public double[] prices() {
        return this.prices;
    }

    public String toString() {
        String output = "Welcome to " + this.shopName + "!\n";
        for (int i = 0; i < this.items.length; i++) {
            output += i + " = " + this.items[i] + " - " + this.prices[i] + "\n";
        }
        return output;
    }

    public void open() {
        Customer client = new Customer();
        while (client.shop() == 0)
            ;

    }

}
