package com.qa.day2;

// Create a method which accepts 3 parameters, 2 integers and a boolean.
// If the boolean is true, the method will return a sum of the two numbers, and if it is false it will return the multiplication of the two numbers.
import java.util.Scanner;

public class FlowCharts {
    public static void main(String[] arg) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number1 = input1.nextLine();
        int a = Integer.parseInt(number1);
        System.out.println("You chose: " + a);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number2 = input2.nextLine();
        int b = Integer.parseInt(number2);
        System.out.println("You Chose: " + b);

        if (a > b)
            System.out.println(a + b);
        else {
            System.out.println(a * b);
        }
    }
}


