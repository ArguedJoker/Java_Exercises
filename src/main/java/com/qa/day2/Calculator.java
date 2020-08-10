package com.qa.day2;

// Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
// Create the following additional three methods that each take two parameters:
// Multiplication - which takes two numbers and returns the product.
// Subtraction - which takes two numbers, then returns the result of the subtraction.
// Division - which takes two numbers, then returns the result of the division.
// Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.
// With the division method, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;


            default:
                System.out.print("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
