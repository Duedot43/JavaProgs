package org.duedot43.unit2.shop.newnewsub;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball();
        USB usb = new USB();
        Scanner input = new Scanner(System.in);

        System.out.print("What would you like to buy?\n1 Ball - " + ball.getPrice() + "\n2 USB - " + usb.getPrice() + "\n>> ");
        int option = input.nextInt();

        if (option == 1) {
            System.out.println("You bought a " + ball.getName() + " for " + ball.getPrice() + " and " + ball.toString());
        } else if (option == 2) {
            System.out.println("You bought a " + usb.getName() + " for " + usb.getPrice() + " and " + usb.toString());
        }
        input.close();


    }
}
