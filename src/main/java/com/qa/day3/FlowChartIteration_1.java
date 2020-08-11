package com.qa.day3;

public class FlowChartIteration_1 {

    public static void main (String[] args) {
        for(int a = 100; a < 300; a++) {
            if(a > 200) {
                break;
            } else {
                System.out.println(a);
            }
            a++;
        }
    }
}
