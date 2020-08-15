package com.qa.day5;

public class NintyNineBeers {
    public static void main(String[] args) {
        method1();
    }


    public static int method1() {
        int beer = 99;
        String word = "Bottles";

        while (beer > 0) {
            if (beer == 1) {
                word = "bottle";
            }
            System.out.println(beer + " " + word + "of beer on the wall");
            System.out.println(beer + " " + word + "of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around,");
            beer = beer - 1;
            if (beer > 0) {
                System.out.println(beer + " " + word + " " + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
        return beer;
    }
}