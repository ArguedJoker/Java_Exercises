package com.qa.day2;

//import java.util.Scanner;

public class BlackJack {
    public static void main (String[] arg) {

        method1(14);
        method2( 3);
        method3(14, 3);
        method4(22);
        method5(23);


    }

    public static int method1(int a){
        /*Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your first number which must be higher than 0: ");
        String number1 = input1.nextLine();
        int a = Integer.parseInt(number1);*/
        if (a == 0) {
            System.out.println("You chose zero! Y u do dis? Try again!");
        }
        return a;
    }

    public static int method2( int b){
        /*Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your second number which must also be over 0: ");
        String number2 = input2.nextLine();
        int b = Integer.parseInt(number2);*/
        if (b == 0) {
            System.out.println("You chose zero! Y u do dis? Goodbye");
        }
        return b;
    }

    public static int method3(int a, int b) {
        if (a <= 21 && b <= 21) {
            System.out.println(Math.max(a, b));
        }
        return Math.max(a, b);
    }

    public static int method4(int a) {
        if (a > 21){
            System.out.println("0");
        }
        return a;
    }

    public static int method5(int b){
        if (b > 21){
            System.out.println("0");
        }
        return b;
    }
}
