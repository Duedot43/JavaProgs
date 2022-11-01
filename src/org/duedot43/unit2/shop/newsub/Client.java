package org.duedot43.unit2.shop.newsub;

public class Client extends Reality {
    private String name;
    private double money;

    public Client() {
        super();
        this.name = "John Doe";
        this.money = 0.00;
    }

    public Client(String name, double money) {
        super();
        this.name = name;
        this.money = money;
    }

    public int buyThing() {
        System.out.println("Welcome " + this.name + " you have $" + this.money + " to spend");
        System.out.print(super.shop);
        System.out.print("What would you like to buy?\n>> ");
        int option = super.input.nextInt();
        if (!this.shop.validItem(option)) {
            System.out.println("Invalid item!");
            return 0;
        }
        this.money -= super.shop.buy(option);

        System.out.print("Would you like to shop again? (y/n)\n>> ");
        String opinion = super.input.nextLine();
        if ("y".equals(opinion)) {
            return 0;
        } else {
            return 1;
        }
    }
}
