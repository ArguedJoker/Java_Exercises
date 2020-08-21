package com.qa.day9;
import java.util.Scanner;
public class MCQ {
    public static void main(String[] args) {
        String question = "What is the largest planet in the solar system";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";
        String correctAnswer = choiceTwo;

        // asking question
        System.out.println(question);

        // print statement to give choices
        System.out.println("Choose one fo the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        //user inputs an answer
        Scanner scanner = new Scanner(System.in);

        //retrieve user's input
        String input = scanner.next();

        //if input matches correctAnswer then user is correct and prints congrats message.
        //if input does not match correctAnswer then prints out incorrect and then the correct answer.
        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Yes. That is the correct answer.");
        } else {
            System.out.println("No. That's not right. The correct answer is " + correctAnswer);
        }
    }
}
