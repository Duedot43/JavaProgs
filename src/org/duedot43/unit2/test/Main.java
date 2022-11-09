package org.duedot43.unit2.test;


import java.util.Scanner;;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = -1;
        int number = (int)(Math.random() * 101);
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
        System.out.println("You win!");
        input.close();
    }
    
}