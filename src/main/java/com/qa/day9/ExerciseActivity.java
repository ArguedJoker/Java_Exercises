package com.qa.day9;

import java.util.Scanner;

public class ExerciseActivity {
    public static void main(String[] args) {
        double userHeight = 179;
        double userWeight = 68;
        String userFirstName = "Hritik";
        String userLastName = "Roshan";

        System.out.println("User " + userFirstName + " " + userLastName + " has height of " + userHeight + " cm and weight " + userWeight + " " +  "kilograms.");
        System.out.println("Please add the correct information for height and weight: ");

        Scanner input = new Scanner(System.in);
        userHeight = input.nextDouble();
        userWeight = input.nextDouble();

        System.out.println("Processing .....");
        System.out.println("Processing .....");
        System.out.println("Processing .....");
        System.out.println("One moment please ....");
        System.out.println("Thank you. " + userFirstName + " " + userLastName + " has a new height of " + userHeight + " cm and a new weight of " + userWeight + " " + "kilograms.");

    }

}
