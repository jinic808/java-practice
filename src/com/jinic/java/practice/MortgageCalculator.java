package com.jinic.java.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        int principal = (int)readInput("Principal", 1000, 1_000_000);
        float annualInterest = (float)readInput("Annual interest rate", 0, 30);
        float years = (float)readInput("Period", 1, 30);
        double mortgage = calculateMortgage(principal, annualInterest, years);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public static double calculateMortgage(int principal, float annualInterest, float years) {
        final byte PERCENT = 100;
        final byte MONTHS_OF_A_YEAR = 12;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_OF_A_YEAR;
        float period = years * MONTHS_OF_A_YEAR;

        float pow = (float)Math.pow(1 + monthlyInterest, period);

        return (principal * monthlyInterest * pow) / (pow - 1);
    }

    public static double readInput(String value, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double result;
        while (true) {
            System.out.print(value + "(" + min + " - " + max + "): ");
            result = scanner.nextFloat();
            if (result >= min && result <= max) {
                return result;
            } else {
                System.out.println("Enter a value between " + min + " and " + max);
            }
        }
    }
}
