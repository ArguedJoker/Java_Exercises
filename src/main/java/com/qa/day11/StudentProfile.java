package com.qa.day11;

public class StudentProfile {
    // First Name
    // Middle Name (if applicable)
    // Last Name
    // Student ID
    // Expected GPA
    // Declared Major
    // Class Year
    // Expected year to graduate


    String firstName;
    String lastName;
    double expectedGPA;
    String declaredMajor;
    int classYear;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double expectedGPA, int classYear, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.expectedGPA = expectedGPA;
        this.classYear = classYear;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate = this.expectedYearToGraduate +1;
    }


}
