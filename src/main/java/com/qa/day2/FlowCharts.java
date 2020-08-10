package com.qa.day2;

// Create a method which accepts 3 parameters, 2 integers and a boolean.
// If the boolean is true, the method will return a sum of the two numbers, and if it is false it will return the multiplication of the two numbers.

public class FlowCharts {
    public static void main (String[] arg) {
        int a = 2;
        int b = 10;
        boolean sum = true;
        if ( !sum )
            System.out.println(a + b);
        else {
            System.out.println(a * b);
        }
    }
}
