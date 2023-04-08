package com.jinic.java.practice.part2.wageCalculator;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyWage(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
