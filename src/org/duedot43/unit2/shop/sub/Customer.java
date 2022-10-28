package org.duedot43.unit2.shop.sub;

public class Customer extends Shop {

    private String name;
    private double money;

    public int shop() {

        System.out.print("What is your name? ");
        this.name = this.input.nextLine();
        System.out.print("How much money do you have? ");
        this.money = this.input.nextInt();
        System.out
                .println("Welcome to " + this.shopName() + " " + this.name + "! You have $" + this.money + " to spend");
        System.out.println(this);
        System.out.print("What would you like to buy? \n>> ");
        int option = this.input.nextInt();
        if (option > 4 || option < 0) {
            System.out.println("Invalid item!");
            return 0;
        }
        System.out.print("How many would you like to buy? ");
        int amount = this.input.nextInt();
        double price = this.prices()[option];

        if (this.money - (price * amount) < 0) {
            System.out.println("You do not have enough money for that!");
            return 0;
        }
        this.money -= price;
        System.out.print("Would you like to buy something else? ");
        String choice = this.input.next();
        if ("y".equals(choice)) {
            return 0;
        } else {
            System.out.println(this.exit());
            return 1;
        }

    }

    public String exit() {
        return "Balance: " + this.money + " - " + this.name;
    }
}
