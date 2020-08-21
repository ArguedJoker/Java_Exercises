package com.qa.day9;
import java.util.Scanner;
public class MusicLooper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song.");
            System.out.println("Would you like to take this song of repeat? Please answer y for yes and n for no.");
            String userInput = input.next();

            if(userInput.equals("y")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song!");
    }
}
