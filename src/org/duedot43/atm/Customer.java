package org.duedot43.atm;

import java.util.Scanner;
public class Customer {
    private String name;
    private int card;
    private int money;

    public Customer() {
        this.card = 0;
        this.money = 0;
        this.name = "John Doe";
    }

    public Customer(int card, int money, String name) {
        this.card = card;
        this.money = money;
        this.name = name;
    }

    public void exist() {
        System.out.println("Welcome to reality " + this.name);
    }

    public String onString(Atm atm) {
        return "Your current balance is " + atm.onString(card) + "\nYou have $" + this.money + " on you.";
    }

    public int walkUp(Atm atm, Scanner input) {
        System.out.println(this.onString(atm));
        System.out.print("What would you like to do?\n1: View money\n2: Withdraw\n3: Deposit\n>> ");
        int choice = input.nextInt();
        if (choice <= 0 || choice > 3) {
            System.out.println("Invalid choice!");
            return 0; // 0 is normal exit aka the user wants to do it again
        } else if (choice == 1) {
            System.out.println(this.onString(atm));
        } else if (choice == 2) {
            System.out.print("How much money would you like to withdraw you can withdraw a maximum of $" + atm.getAccount(this.card) + "\n>> ");
            int withdraw = input.nextInt();
            if (atm.getAccount(this.card) >= withdraw){
                atm.withdraw(withdraw, this.card);
                this.money += withdraw;
                System.out.println(this.onString(atm));
            } else {
                System.out.println("You dont have enough money to do that!");
                return 0;
            }
        } else {
            System.out.print("How much money would you like to deposit you can deposit a maximum of $" + this.money + "\n>> ");
            int deposit = input.nextInt();
            if (this.money >= deposit) {
                atm.deposit(deposit, this.card);
                this.money -= deposit;
                System.out.println(this.onString(atm));
            } else {
                System.out.println("You do not have enough money!");
                return 0;
            }
        }

        System.out.print("Would you like to do more with your money? (y/n) \n>> ");
        String getOut = input.next();

        if ("y".equals(getOut)) {
            return 0;
        } else {
            return 1;
        }
    }
}
