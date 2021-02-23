package com.javarefresh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate + extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }
    
    private int getBaseSalary() {
        return baseSalary;
    }
    
    private int getHourlyRate() {
        return hourlyRate;
    }
    
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or negative");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }

    public static void printNumberOfEmployee() {
        System.out.println(numberOfEmployees);
    }

}
