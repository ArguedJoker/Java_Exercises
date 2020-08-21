package com.qa.day9;
import java.util.Scanner;
public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber < 5) {
            System.out.println("You will have good fortune today");
        } else {
            System.out.println("Ask a friend to give you a rub for good measure!");
        }
    }
}
