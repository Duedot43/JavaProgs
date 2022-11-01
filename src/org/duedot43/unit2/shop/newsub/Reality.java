package org.duedot43.unit2.shop.newsub;

import java.util.Scanner;
public class Reality{
    public Shop shop;
    public Client client;
    public Scanner input;
    
    //I dont understnad the point of superclasses and subclasses when you cand just use the superclass as a database????
    //Now i see why java is such a memory hog
    public void start() {
        this.shop = new Shop();
        this.input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = this.input.nextLine();
        System.out.print("How much money do you have? ");
        double money = this.input.nextInt();
        client = new Client(name, money);
        client.buyThing();
        this.input.close();
    }

}
