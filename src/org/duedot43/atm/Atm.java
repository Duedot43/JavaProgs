package org.duedot43.atm;

public class Atm {
    private int[][] accounts;
    private double money;
    private String myLinterSaidSo = "That account does not exist!";

    public Atm() {
        this.accounts = new int[][]{{1000}, {2000}, {3000}, {4000}, {5000}, {6000}, {7000}, {8000}, {9000}, {10000}};
        this.money = 100000;
    }

    public Atm(int[][] accounts, double money) {
        this.accounts = accounts;
        this.money = money;
    }

    public int deposit(int ammount, int account) {
        if (account >= this.accounts.length) {
            System.out.println(this.myLinterSaidSo);
            return -0;
        } else {
            this.accounts[account][0] += ammount;
            this.money += ammount;
            return this.accounts[account][0];
        }
    }

    public int withdraw(int ammount, int account) {
        if (account >= this.accounts.length || ammount > this.money) {
            System.out.println("That account does not exist! Or the ATM does not have enough money.");
            return -0;
        } else {
            this.accounts[account][0] -= ammount;
            this.money -= ammount;
            return this.accounts[account][0];
        }
    }

    public int getAccount(int account) {
        if (account >= this.accounts.length) {
            System.out.println(this.myLinterSaidSo);
            return -0;
        } else {
            return this.accounts[account][0];
        }
    }

    public String onString(int account) {
        if (account >= this.accounts.length) {
            System.out.println(this.myLinterSaidSo);
            return "err";
        } else {
            return "" + this.accounts[account][0];
        }
    }
}
