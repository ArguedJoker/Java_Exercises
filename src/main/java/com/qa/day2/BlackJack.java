package com.qa.day2;

import java.util.Scanner;

public class BlackJack {
    public static void main (String[] arg) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your first number which must be higher than 0: ");
        String number1 = input1.nextLine();
        int a = Integer.parseInt(number1);
        if (a == 0) {
            System.out.println("You chose zero! Y u do dis? Try again!");
            }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your second number which must also be over 0: ");
        String number2 = input2.nextLine();
        int b = Integer.parseInt(number2);
        if (b == 0) {
            System.out.println("You chose zero! Y u do dis? Goodbye");
        }
        if (a <= 21 && b <= 21){
            System.out.println(Math.max(a, b));
        }
        if (a > 21){
          System.out.println("0");
        }
        if (b > 21){
            System.out.println("0");
        }
    }
}
