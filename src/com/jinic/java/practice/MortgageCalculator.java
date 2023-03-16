package com.jinic.java.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_OF_A_YEAR = 12;

        int principal;
        float monthlyInterest;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            } else {
                System.out.println("Enter a number between 1,000 to 1,000,000");
            }
        }

        while (true) {
            System.out.print("Annual interest rate (0 - 30): ");
            float annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / PERCENT / MONTHS_OF_A_YEAR;
            if (annualInterest > 0 && annualInterest <= 30) {
                break;
            } else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        while (true) {
            System.out.print("Period (1 - 30): ");
            float years = scanner.nextFloat();
            if (years >= 1 && years <= 30) {
                float period = years * MONTHS_OF_A_YEAR;
                float pow = (float)Math.pow(1 + monthlyInterest, period);
                double mortgage = (principal * monthlyInterest * pow) / (pow - 1);
                System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
                break;
            } else {
                System.out.println("Enter a value between 1 and 30");
            }
        }
    }
}
