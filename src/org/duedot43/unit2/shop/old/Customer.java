package org.duedot43.unit2.shop.old;

import java.util.Scanner;

public class Customer {
    private String name;
    private double money;

    public Customer() {
        this.name = "John Doe";
        this.money = 100;
    }

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return "Customer: " + this.name + " has $" + this.money;
    }

    public void exists() {
        System.out.println("Welcome to reality " + this.name + "!");
    }

    public int walkIn(Shop shop, Scanner input) {
        shop.customers++;
        System.out.println("You walk into the shop and see:");
        System.out.println(shop);
        System.out.print("What would you like to buy? ");
        int itemIndex = input.nextInt();
        if (itemIndex < 0 || itemIndex >= shop.getStock().length) {
            System.out.println("Sorry, we don't have that item.");
        } else {
            System.out.print("How many " + shop.getStock()[itemIndex] + " would you like to buy? ");
            int quantity = input.nextInt();
            this.money -= shop.buy(itemIndex, quantity);
        }
        System.out.println("Would you like to buy more items? (y/n)");
        String answer = input.next();
        if ("y".equals(answer)) {
            return 1;
        } else {
            shop.customers--;
            return 0;
        }
    }
}
