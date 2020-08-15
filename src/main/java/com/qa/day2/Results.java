package com.qa.day2;

public class Results {

    private static final int physics = 149;
    private static final int physicsPercentage = (physics * 100) / 150;
    private static final int chemistry = 132;
    private static final int chemistryPercentage = (chemistry * 100) / 150;
    private static final int biology = 144;
    private static final int biologyPercentage = (biology * 100) / 150;
    private static final int totalMarks = physics + chemistry + biology;
    private static final int[] studentMarks = {physics, chemistry, biology, totalMarks};
    private static final int[] studentPercent = {physicsPercentage, chemistryPercentage, biologyPercentage};

    public static void main(String[] args) {
        method1(149, 132, 144, 425);
        method2(99, 88, 96);
    }

    public static int[] method1(int physics, int chemistry, int biology, int totalMarks) {
        System.out.println("Physics marks:" + " " + physics);
        if (physicsPercentage > 60) {
            System.out.println("You passed physics! Well Done!");
        } else {
            System.out.println("Unfortunately you failed your physics exam. Better Luck next time!");
        }

        System.out.println("Chemistry marks:" + " " + chemistry);
        if (chemistryPercentage > 60) {
            System.out.println("You passed chemistry! Well Done!");
        } else {
            System.out.println("Unfortunately you failed your chemistry exam. Better Luck next time!");
        }

        System.out.println("Biology marks:" + " " + biology);
        if (biologyPercentage > 60) {
            System.out.println("You passed Biology! Well Done!");
        } else {
            System.out.println("Unfortunately you failed your biology exam. Better Luck next time!");
        }

        System.out.println("Total marks:" + " " + totalMarks + "/450");
        return studentMarks;
    }

    public static int[] method2(int physicsPercentage, int chemistryPercentage, int biologyPercentage) {
        int percentage = (totalMarks * 100) / 450;
        System.out.println("Average mark (as percentage):" + " " + percentage);
        if (physicsPercentage > 60) {
            if (chemistryPercentage > 60) {
                if (biologyPercentage > 60) {
                    System.out.println("Well done you have passed all your exams and can now graduate!");
                } else {
                    System.out.println("Unfortunately, you need to pass all of your exams to be able to graduate");
                }
            }

        }
        return studentPercent;
    }
}
