package org.duedot43.unit2.atm;

import java.util.Scanner;
public class Reality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Atm atm = new Atm();

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How much money do you have on you? ");
        int money = input.nextInt();

        Customer user = new Customer(0, money, name);

        user.exist();
        while (user.walkUp(atm, input) == 0);
        System.out.println(user.onString(atm));
        input.close();
    }
}
