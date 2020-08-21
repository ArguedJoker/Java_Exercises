package com.qa.day9;

public class JavaPractice {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.5;
        boolean hasPerfectAttendance = true;

        String studentForeName = "Rohan";
        String studentLastName = "Chauhan";
        char studentFirstInitial = studentForeName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentForeName);
        System.out.println(studentLastName);
        System.out.println(studentForeName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
