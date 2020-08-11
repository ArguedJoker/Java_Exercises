package com.qa.day2;

// A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks.
// When all the exam marks have been added together, we can find the overall percentage that the person has
// got by multiplying their score by 100 and then dividing by 450.
// Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage.
// This class should also have 2 methods:
// Method 1 - displays the results that the person got for each exam and then the total mark.
// Try to make the output neat and bespoke for each exam.
// Method 2 - which finds and displays the percentage that the person received for the exams overall.
// Expand the results project, there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
// Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams
// (pass grade of 60% for each exam) they still fail overall.
// eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
// they would have an overall grade of 85.3% (Pass) but in this case the student would fail because their physics grade is 54% (Fail)
// Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.



public class Results {

    private static final int physics = 149;
    private static final int chemistry = 132;
    private static final int biology = 144;
    private static final int totalMarks = physics + chemistry + biology;
    private static final int Percentage = (totalMarks * 100)/450;

    public static void method1() {
        System.out.println(physics);
        System.out.println(chemistry);
        System.out.println(biology);
        System.out.println(totalMarks);
    }

    public static void method2() {
        System.out.println(Percentage);
    }

    public static void main(String[] args)
    {

        //int method1();

        //int method2();

    }


}
