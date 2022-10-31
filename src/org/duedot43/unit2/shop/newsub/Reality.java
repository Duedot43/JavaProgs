package org.duedot43.unit2.shop.newsub;

import java.util.Scanner;
public class Reality {
    public Shop shop;
    public Client client;
    public Scanner input;

    public Reality() {
        String name = "Small Things";
        String[] stock = { "Pen", "Baseball", "Stress Ball", "Small Watch", "USB Drive" };
        double[] prices = { 1.00, 2.00, 3.00, 4.00, 5.00 };
        shop = new Shop(prices, stock, name);
        input = new Scanner(System.in);
        // WHY WHAT IS THIS AHHHH
    }

    public void start() {
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How much money do you have? ");
        double money = input.nextInt();
        client = new Client(name, money);
        client.buyThing();
        this.input.close();
    }

}
