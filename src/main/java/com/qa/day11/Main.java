package com.qa.day11;

public class Main {
    public static void main(String[] args) {

        // Find area of a triangle
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        double triangleArea = triangleA.findArea();
        double triangleArea2 = triangleB.findArea();
        System.out.println(triangleArea);
        System.out.println(triangleArea2);
        System.out.println(triangleA.sideLengthThree); // instance variable
        System.out.println(triangleB.base); // instance variable
        System.out.println(Triangle.numberOfSides); // class variable

        // Student Profile Challenge

        StudentProfile student1 = new StudentProfile("Rohan", "Chauhan", "BioTechnology", 4.5, 2, 2020 );
        StudentProfile student2 = new StudentProfile("Harry", "Oswald", "Computer Science", 4, 2, 2020);

        System.out.println(student1.firstName);
        System.out.println(student1.lastName);
        System.out.println(student1.declaredMajor);
        System.out.println(student1.expectedGPA);

        student1.incrementExpectedGraduationYear();
        System.out.println(student1.expectedYearToGraduate);

        System.out.println(student2.firstName);
        System.out.println(student2.lastName);
        System.out.println(student2.declaredMajor);
        System.out.println(student2.expectedGPA);

        student2.incrementExpectedGraduationYear();
        System.out.println(student2.expectedYearToGraduate);

    }
}
