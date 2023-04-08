package com.jinic.java.practice.part2.wageCalculator;

public class Employee {
    private int baseSalary;
    private int hourlyWage;

    public Employee() {
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("baseSalary cannot be 0 or negative");
        this.baseSalary = baseSalary;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        if (hourlyWage <= 0)
            throw new IllegalArgumentException("hourlyWage cannot be 0 or negative");
        this.hourlyWage = hourlyWage;
    }

    public int calculateWage(int overtimeHours) {
        return getBaseSalary() + getHourlyWage() * overtimeHours;
    }
}
