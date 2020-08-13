package com.qa.day2;

// Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

import java.util.Scanner;

public class Unique_Sum {
    public static void main (String[] arg) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number1 = input1.nextLine();
        int a = Integer.parseInt(number1);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number2 = input2.nextLine();
        int b = Integer.parseInt(number2);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number3 = input3.nextLine();
        int c = Integer.parseInt(number3);

        if (a == b && b == c) {
           System.out.println("0");
        } else if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(a + b + c);
        }
    }
}
