package com.qa.day10;

public class EmployeeSalary {
    // input number of hours the employee works per week
    // input amount of number employee makes per hour
    // output employee's gross yearly salary (before tax)
    // stretch goal - add input for vacation days (employee does not get paid for vacation days taken

    public static double employeeWeeklySalary() {
        double totalHoursPerDay = 8;
        double totalHoursPerWeek = totalHoursPerDay * 5;
        double payPerHour = 21.00;
        double totalPayPerWeek = totalHoursPerWeek * payPerHour;

        return totalPayPerWeek;
    }

    public static double employeeVacation() {
        int numberOfDaysVacation = 5;
        double normalEmployeeDayHours = 8;
        double totalTimeVacationUnpaid = numberOfDaysVacation * normalEmployeeDayHours;

        return totalTimeVacationUnpaid;
    }

    public static void main(String[] args) {
        double employeeSalary = employeeWeeklySalary() * 4 * 12 - employeeVacation();
        System.out.println(employeeSalary);
    }
}
