package com.qa.day10;
import java.util.Scanner;
public class DefinedFunctions {

    public static void announcedDeveloperTeaTime() {
        System.out.println("Waiting for Developer Tea time ... ");
        System.out.println("Type in a random word and press enter to start the developers tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Developer Teat time has begun!");
    }

    public static void main(String[] args) {
        announcedDeveloperTeaTime();
    }
}
