package com.qa.day4;

public class Dogo {
    public static void main(String[] args) {
        method1(1);
    }
    public static void method1(int position){
        int counter = 1;
        for(int i=1; i<=100; i++) {
            if (position == i) {
            } else if(i==11){
                System.out.println(i+"th");
            }else if(i==12) {
                System.out.println(i + "th");
            }else if(i==13) {
                System.out.println(i + "th");
            }else if (i % 10 == 2) {
                System.out.println(i + "nd");
            } else if (i % 10 == 3) {
                System.out.println(i + "rd");
            } else if(i%10 ==1 ){
                System.out.println(i +"st");
            } else {
                System.out.println(i + "th");
            }
        }
    }
}
